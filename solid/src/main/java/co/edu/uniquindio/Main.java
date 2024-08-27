package co.edu.uniquindio;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        /*
        OBJETOS Y LISTA PARA PROBAR: GESTORCLIENTE
         */

        //Lista de clientes (Vacia)
        Collection<Cliente> listaClientes = new ArrayList<>();


        // Clientes que añadirán a dicha lista
        listaClientes.add(new Cliente("Allison", "67432", null, new ArrayList<>()));
        listaClientes.add(new Cliente("David", "55567", null, new ArrayList<>()));
        listaClientes.add(new Cliente("Daniel", "99922", null, new ArrayList<>()));

        // Se crea el gestor de clientes
        GestorCliente gestorCliente = new GestorCliente(listaClientes);

        // Solicitar al usuario que ingrese el DNI del cliente a actualizar
        String dni = JOptionPane.showInputDialog(null,
                "Ingrese el DNI del cliente a actualizar:",
                "Actualizar Información del Cliente", JOptionPane.PLAIN_MESSAGE);

        gestorCliente.actualizarInformacionCliente(dni);


        // Creación de una colección para almacenar las habitaciones
        Collection<Habitacion> listaHabitaciones = new ArrayList<>();

        // Crear algunos clientes y habitaciones de ejemplo
        Cliente cliente1 = new Cliente("Allison", "67432", null, new ArrayList<>());
        Cliente cliente2 = new Cliente("David", "55567", null, new ArrayList<>());
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        Habitacion habitacion1 = new Habitacion(101, 100.0, TipoHabitacion.SIMPLE, null, new ArrayList<>(), new ArrayList<>());
        Habitacion habitacion2 = new Habitacion(102, 150.0, TipoHabitacion.DOBLE, null, new ArrayList<>(), new ArrayList<>());
        listaHabitaciones.add(habitacion1);
        listaHabitaciones.add(habitacion2);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú de Sistema de Reserva de Hotel\n" +
                            "1. Crear Habitación\n" +
                            "2. Crear Reserva\n" +
                            "3. Mostrar Detalles de Reserva\n" +
                            "4. Salir"));

            switch (opcion) {
                case 1:
                    // Crear Habitación
                    int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la habitación:"));
                    String tipoHabitacionStr = JOptionPane.showInputDialog("Ingrese el tipo de habitación (SIMPLE, DOBLE, SUITE):");
                    TipoHabitacion tipoHabitacion = TipoHabitacion.valueOf(tipoHabitacionStr.toUpperCase());
                    double precioHabitacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la habitación:"));
                    Habitacion nuevaHabitacion = new Habitacion(numeroHabitacion, precioHabitacion, tipoHabitacion, null, new ArrayList<>(), new ArrayList<>());
                    listaHabitaciones.add(nuevaHabitacion);
                    JOptionPane.showMessageDialog(null, "Habitación creada con éxito.");
                    break;

                case 2:
                    // Crear Reserva
                    if (listaClientes.isEmpty() || listaHabitaciones.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe haber al menos un cliente y una habitación antes de realizar una reserva.");
                        break;
                    }

                    String dniCliente = JOptionPane.showInputDialog("Ingrese el DNI del cliente:");
                    Cliente clienteReserva = listaClientes.stream()
                            .filter(c -> c.getDni().equals(dniCliente))
                            .findFirst()
                            .orElse(null);

                    if (clienteReserva == null) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        break;
                    }

                    numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la habitación a reservar:"));
                    Habitacion habitacionReserva = listaHabitaciones.stream()
                            .filter(h -> h.getNumero() == numeroHabitacion)
                            .findFirst()
                            .orElse(null);

                    if (habitacionReserva == null) {
                        JOptionPane.showMessageDialog(null, "Habitación no encontrada.");
                        break;
                    }

                    LocalDate horaEntrada = LocalDate.now();
                    LocalDate horaSalida = horaEntrada.plusDays(3);

                    Reserva nuevaReserva = new Reserva(horaEntrada, horaSalida, clienteReserva, new ArrayList<>(), habitacionReserva);
                    clienteReserva.agregarReserva(nuevaReserva);
                    habitacionReserva.setReservaAsociada(nuevaReserva);

                    JOptionPane.showMessageDialog(null, "Reserva creada con éxito.");
                    break;

                case 3:
                    // Mostrar detalles de la reserva
                    dniCliente = JOptionPane.showInputDialog("Ingrese el DNI del cliente para ver su reserva:");
                    clienteReserva = listaClientes.stream()
                            .filter(c -> c.getDni().equals(dniCliente))
                            .findFirst()
                            .orElse(null);

                    if (clienteReserva == null) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        break;
                    }

                    if (clienteReserva.getReservas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El cliente no tiene reservas.");
                    } else {
                        for (Reserva reserva : clienteReserva.getReservas()) {
                            reserva.mostrarDetallesReserva();
                        }
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de reservas.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 4);


    }
}
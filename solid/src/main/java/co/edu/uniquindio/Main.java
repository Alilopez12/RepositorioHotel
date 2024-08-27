package co.edu.uniquindio;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        /*
         * Crea una lista de clientes para ser gestionados por el sistema.
         *
         * @returns {Collection<Cliente>} - Una colección de objetos Cliente.
         */

        Collection<Cliente> listaClientes = new ArrayList<>();
        /*
         * Crea una habitación y los servicios asociados.
         * @returns {Habitacion} - Un objeto Habitacion con los servicios iniciales.
         * @returns {ServicioDeHabitacion} - Dos objetos ServicioDeHabitacion con detalles del servicio.
         * */

        Habitacion habitacion1 = new Habitacion(101, 200.0, TipoHabitacion.SIMPLE, null, new ArrayList<>(), new ArrayList<>());
        ServicioDeHabitacion servicio1 = new ServicioDeHabitacion("Servicio de SPA", 50.0, TipoServicio.SPA, habitacion1, "Masaje completo");
        ServicioDeHabitacion servicio2 = new ServicioDeHabitacion("Restaurante", 30.0, TipoServicio.RESTAURANTE, habitacion1, "Cena gourmet");

        /*
         * Asocia una lista de servicios a una habitación y establece una reserva para dicha habitación.
         *
         * @returns {Collection<Servicio>} - Una colección de objetos Servicio añadidos a la habitación.
         * @returns {Reserva} - Un objeto Reserva asociada a la habitación.
         */

        Collection<Servicio> listaServicios = new ArrayList<>();
        listaServicios.add(servicio1);
        listaServicios.add(servicio2);
        habitacion1.setListaServicios(listaServicios);

        Reserva reserva1 = new Reserva(LocalDate.now(), LocalDate.now().plusDays(3), null, new ArrayList<>(), habitacion1);
        habitacion1.setReservaAsociada(reserva1);

        /*
         * Crea y asocia clientes con reservas y servicios.
         *
         * @returns {Cliente} - Un objeto Cliente con una reserva asociada y añadido a la lista de clientes.
         * @returns {Collection<Cliente>} - Una colección de objetos Cliente añadidos a la lista.
         */

        Cliente cliente1 = new Cliente("Allison", "67432", reserva1, new ArrayList<>());
        cliente1.getListaReservasAsociadas().add(reserva1);
        reserva1.setClienteAsociado(cliente1);

        listaClientes.add(cliente1);
        listaClientes.add(new Cliente("David", "55567", null, new ArrayList<>()));
        listaClientes.add(new Cliente("Daniel", "99922", null, new ArrayList<>()));

        /*
         * Crea un gestor de clientes que maneja una lista de clientes.
         *
         * @returns {GestorCliente} - Un objeto GestorCliente con la lista de clientes inicializada.
         */

        GestorCliente gestorCliente = new GestorCliente(listaClientes);

        /*
         * Solicita al usuario el DNI del cliente para actualizar la información o mostrar el registro de consumo.
         *
         * @returns {String} - El DNI ingresado por el usuario.
         */

        String dni = JOptionPane.showInputDialog(null,
                "Ingrese el DNI del cliente a actualizar o mostrar el registro de estadía:",
                "Actualizar Información del Cliente o Mostrar Registro de estadía", JOptionPane.PLAIN_MESSAGE);

        /*
         * Muestra un diálogo para que el usuario elija entre actualizar la información del cliente o mostrar el registro de estadía.
         *
         * @returns {int} - La opción seleccionada por el usuario: 0 para actualizar información, 1 para mostrar el registro de estadía.
         */

        String[] opciones = {"Actualizar Información", "Mostrar Registro de Estadia"};
        int seleccion = JOptionPane.showOptionDialog(null,
                "¿Qué acción desea realizar?",
                "Seleccionar Acción",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        /*
         * Realiza una acción basada en la selección del usuario.
         * - Si se selecciona actualizar la información, llama al método de actualización del gestor.
         * - Si se selecciona mostrar el registro de consumo, busca al cliente por DNI y muestra el registro.
         * - Muestra un mensaje de error si el cliente no es encontrado.
         */

        if (seleccion == 0) {
            gestorCliente.actualizarInformacionCliente(dni);
        } else if (seleccion == 1) {
            boolean clienteEncontrado = false;
            for (Cliente cliente : listaClientes) {
                if (cliente.getDni().equals(dni)) {
                    cliente.mostrarRegistroDeEstadia();
                    clienteEncontrado = true;
                    break;
                }
            }

            if (!clienteEncontrado) {
                JOptionPane.showMessageDialog(null,
                        "Cliente con DNI " + dni + " no encontrado.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }
    }

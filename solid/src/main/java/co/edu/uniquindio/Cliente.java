package co.edu.uniquindio;

import javax.swing.*;
import java.util.Collection;

public class Cliente {

    private String nombre;
    private String dni;
    private Reserva reservaAsociada;
    private Collection<Reserva> listaReservasAsociadas;


    /*
     * Constructor para crear un nuevo cliente.
     *
     * @param nombre - Nombre del cliente.
     * @param dni - DNI del cliente.
     * @param reservaAsociada - Reserva asociada al cliente (puede ser null).
     * @param listaReservasAsociadas - Lista de reservas asociadas al cliente.
     */

    public Cliente(String nombre, String dni, Reserva reservaAsociada, Collection<Reserva> listaReservasAsociadas) {
        this.nombre = nombre;
        this.dni = dni;
        this.reservaAsociada = reservaAsociada;
        this.listaReservasAsociadas = listaReservasAsociadas;
    }

    /*
    Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Reserva getReservaAsociada() {
        return reservaAsociada;
    }

    public void setReservaAsociada(Reserva reservaAsociada) {
        this.reservaAsociada = reservaAsociada;
    }

    public Collection<Reserva> getListaReservasAsociadas() {
        return listaReservasAsociadas;
    }

    public void setListaReservasAsociadas(Collection<Reserva> listaReservasAsociadas) {
        this.listaReservasAsociadas = listaReservasAsociadas;
    }

    /**
     * Muestra el registro de consumo del cliente en un cuadro de diálogo.
     * Si el cliente no tiene una reserva asociada, muestra un mensaje de error.
     */

    public void mostrarRegistroDeEstadia() {
        if (reservaAsociada == null) {
            JOptionPane.showMessageDialog(null, "No hay reserva asociada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder registro = new StringBuilder("Cliente: " + nombre + "\nDNI: " + dni +
                "\nReserva: " + reservaAsociada.getHoraEntrada() + " - " + reservaAsociada.getHoraSalida() +
                "\nHabitación: " + reservaAsociada.getHabitacionAsociada().getNumero());

        JOptionPane.showMessageDialog(null, registro.toString(), "Registro de Estadia", JOptionPane.INFORMATION_MESSAGE);
    }
}

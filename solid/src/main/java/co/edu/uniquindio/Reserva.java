package co.edu.uniquindio;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Collection;

public class Reserva {
    private LocalDate horaEntrada;
    private LocalDate horaSalida;
    private Cliente clienteAsociado;
    private Collection<Cliente> listaClientesAsociados;
    private Habitacion habitacionAsociada;

    // Constructor de la clase Reserva
    public Reserva(LocalDate horaEntrada, LocalDate horaSalida, Cliente clienteAsociado,
                   Collection<Cliente> listaClientesAsociados, Habitacion habitacionAsociada) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.clienteAsociado = clienteAsociado;
        this.listaClientesAsociados = listaClientesAsociados;
        this.habitacionAsociada = habitacionAsociada;
    }

    /**
     * Muestra los detalles de la reserva
     */
    public void mostrarDetallesReserva() {
        JOptionPane.showMessageDialog(null,
                "Cliente: " + clienteAsociado.getNombre() +
                        "\nDNI: " + clienteAsociado.getDni() +
                        "\nHabitación Número: " + habitacionAsociada.getNumero() +
                        "\nTipo de Habitación: " + habitacionAsociada.getTipoHabitacion() +
                        "\nFecha de Entrada: " + horaEntrada +
                        "\nFecha de Salida: " + horaSalida);
    }

    /*
    Getters y Setters
     */
    public LocalDate getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDate horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Collection<Cliente> getListaClientesAsociados() {
        return listaClientesAsociados;
    }

    public void setListaClientesAsociados(Collection<Cliente> listaClientesAsociados) {
        this.listaClientesAsociados = listaClientesAsociados;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacionAsociada(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }
}
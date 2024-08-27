package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.Collection;

public class Reserva {
    private LocalDate horaEntrada;
    private LocalDate horaSalida;
    private Cliente cliente;
    private Collection<Cliente> listaClientes;
    private Habitacion habitacion;

    public Reserva(LocalDate horaEntrada, LocalDate horaSalida, Cliente cliente, Collection<Cliente> listaClientes, Habitacion habitacion) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.cliente = cliente;
        this.listaClientes = listaClientes;
        this.habitacion = habitacion;
    }


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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
 

}

package co.edu.uniquindio;

import java.util.Collection;

public class Hotel {
    private Collection<Reserva> listaReservas;
    private Collection<Habitacion> listaHabitaciones;
    private Collection<Cliente> listaClientes;
    private Collection<Servicio> listaServicios;

    public Hotel(Collection<Reserva> listaReservas, Collection<Habitacion> listaHabitaciones, Collection<Cliente> listaClientes, Collection<Servicio> listaServicios) {
        this.listaReservas = listaReservas;
        this.listaHabitaciones = listaHabitaciones;
        this.listaClientes = listaClientes;
        this.listaServicios = listaServicios;
    }

    public Collection<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Collection<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public Collection<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(Collection<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Collection<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(Collection<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }



}

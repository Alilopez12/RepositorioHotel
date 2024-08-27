package co.edu.uniquindio;

import java.util.Collection;

public class Habitacion {
    private int numero;
    private double precio;
    private TipoHabitacion tipoHabitacion;
    private Reserva reservaAsociada;
    private Collection<Servicio> listaServicios;
    private Collection<ServicioDeHabitacion> listaServiciosDeHabitacion;

    public Habitacion(int numero, double precio, TipoHabitacion tipoHabitacion, Reserva reservaAsociada, Collection<Servicio> listaServicios,
                      Collection<ServicioDeHabitacion> listaServiciosDeHabitacion) {
        this.numero = numero;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.reservaAsociada = reservaAsociada;
        this.listaServicios = listaServicios;
        this.listaServiciosDeHabitacion = listaServiciosDeHabitacion;
    }

    /*
    Getters y Setters
     */

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Reserva getReservaAsociada() {
        return reservaAsociada;
    }

    public void setReservaAsociada(Reserva reservaAsociada) {
        this.reservaAsociada = reservaAsociada;
    }

    public Collection<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(Collection<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public Collection<ServicioDeHabitacion> getListaServiciosDeHabitacion() {
        return listaServiciosDeHabitacion;
    }

    public void setListaServiciosDeHabitacion(Collection<ServicioDeHabitacion> listaServiciosDeHabitacion) {
        this.listaServiciosDeHabitacion = listaServiciosDeHabitacion;
    }
}

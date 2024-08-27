package co.edu.uniquindio;

import java.util.Collection;

public class Habitacion {
    private int numero;
    private double precio;
    private TipoHabitacion tipoHabitacion;
    private Collection<Servicio> listaServicios;

    public Habitacion(int numero, double precio, TipoHabitacion tipoHabitacion, Collection<Servicio> listaServicios, Collection<ServicioDeHabitacion> listaServiciosDeHabitacion) {
        this.numero = numero;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.listaServicios = listaServicios;
        this.listaServiciosDeHabitacion = listaServiciosDeHabitacion;
    }


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

    public Collection<ServicioDeHabitacion> getListaServiciosDeHabitacion() {
        return listaServiciosDeHabitacion;
    }

    public void setListaServiciosDeHabitacion(Collection<ServicioDeHabitacion> listaServiciosDeHabitacion) {
        this.listaServiciosDeHabitacion = listaServiciosDeHabitacion;
    }

    public Collection<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(Collection<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    private Collection<ServicioDeHabitacion> listaServiciosDeHabitacion;



}

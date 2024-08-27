package co.edu.uniquindio;

import java.util.Collection;

public class Cliente {

    private String nombre;
    private String dni;
    private Reserva reserva;
    private Collection<Reserva> listaReservas;


    public Cliente(String nombre, String dni, Reserva reserva, Collection<Reserva> listaReservas) {
        this.nombre = nombre;
        this.dni = dni;
        this.reserva = reserva;
        this.listaReservas = listaReservas;
    }

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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }


    public Collection<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Collection<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }




}

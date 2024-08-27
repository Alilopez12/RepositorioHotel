package co.edu.uniquindio;

import java.util.Collection;

public class Cliente {

    private String nombre;
    private String dni;
    private Reserva reservaAsociada;
    private Collection<Reserva> listaReservasAsociadas;

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
}

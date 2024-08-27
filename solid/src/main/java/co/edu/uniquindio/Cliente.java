package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cliente {

    private String nombre;
    private String dni;
    private Reserva reservaAsociada;
    private List<Reserva> reservas;

    public Cliente(String nombre, String dni, Reserva reservaAsociada, Collection<Reserva> listaReservasAsociadas) {
        this.nombre = nombre;
        this.dni = dni;
        this.reservaAsociada = reservaAsociada;
        this.reservas = new ArrayList<>();
    }

    /**
     * Agrega una reserva a la colección de reservas del cliente.
     *
     * @param reserva La reserva a agregar.
     */
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
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
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }



}

package co.edu.uniquindio;

public class ServicioDeHabitacion extends Servicio{

    private String detalle;

    public ServicioDeHabitacion(String nombre, double precio, TipoServicio tipoServicio,
                                Habitacion habitacionAsociada, String detalle) {
        super(nombre, precio, tipoServicio, habitacionAsociada);
        this.detalle = detalle;
    }


}

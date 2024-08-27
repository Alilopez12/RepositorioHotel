package co.edu.uniquindio;

public class ServicioDeHabitacion extends Servicio{

    private String detalle;

    public ServicioDeHabitacion(String nombre, double precio, TipoServicio tipoServicio, String detalle) {
        super(nombre, precio, tipoServicio);
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }


}

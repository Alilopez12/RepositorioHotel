package co.edu.uniquindio;

public class Servicio implements Consumible{
    private String nombre;
    private double precio;
    private TipoServicio tipoServicio;



    public Servicio(String nombre, double precio, TipoServicio tipoServicio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoServicio = tipoServicio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }



    //implementación interface
    @Override
    public void consumir() {
        // para probar el metodo
        System.out.println("El servicio " + nombre + " ha sido consumido.");
    }
}

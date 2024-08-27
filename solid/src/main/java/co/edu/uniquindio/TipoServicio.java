package co.edu.uniquindio;

public enum TipoServicio {
    SPA(50000),
    RESTAURANTE(35000),
    LIMPIEZA(5000);

    private final int precio;

    // Constructor del enum para aceptar el parámetro
    TipoServicio(int precio) {
        this.precio = precio;
    }

    // metodo para obtener el valor del precio
    public int getPrecio() {
        return precio;
    }
}
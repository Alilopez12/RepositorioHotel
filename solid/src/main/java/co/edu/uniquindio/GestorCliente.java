package co.edu.uniquindio;
import javax.swing.JOptionPane;
import java.util.Collection;

public class GestorCliente {
    private Collection<Cliente> listaClientes;

    public GestorCliente(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    /*
    Metodo que actualiza la información de un Cliente
    @PARAMETROS: DNI
    @RETURN: Nada (porque es VOID)
     */
    public void actualizarInformacionCliente(String dni) {
        Cliente cliente = buscarClientePorDNI(dni);

        if (cliente != null) {
            String nombreActual = cliente.getNombre();
            String nuevoNombre = JOptionPane.showInputDialog(null,
                    "Información actual:\nNombre: " + nombreActual + "\nIngrese el nuevo nombre:",
                    "Actualizar Información", JOptionPane.PLAIN_MESSAGE);

            // Valida que el nuevo NOMBRE no sea nulo o un espacio vacio
            if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                cliente.setNombre(nuevoNombre);
                JOptionPane.showMessageDialog(null, "Nombre actualizado correctamente.",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el nombre. (DATO NULO O VACÍO)",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

            String dniActual = cliente.getDni();
            String nuevoDni = JOptionPane.showInputDialog(null,
                    "Información actual:\nDNI: " + dniActual + "\nIngrese el nuevo DNI:",
                    "Actualizar Información", JOptionPane.PLAIN_MESSAGE);

            // Valida que el nuevo DNI no sea nulo o un espacio vacio
            if (nuevoDni != null && !nuevoDni.trim().isEmpty()) {
                cliente.setDni(nuevoDni);
                JOptionPane.showMessageDialog(null, "DNI actualizado correctamente.",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el DNI. (DATO NULO O VACÍO)",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado al Cliente.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
    Metodo axuiliar para el metodo: "ActualizarInformacionCliente", que busca un cliente por medio de su DNI
    @PARAMETROS: DNI
    @RETURN: Un Objeto de tipo Cliente o en su defecto null (Sí el DNI no existe)
     */

    private Cliente buscarClientePorDNI(String dni) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }
}

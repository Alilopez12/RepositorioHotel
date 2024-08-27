package co.edu.uniquindio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        /*
        OBJETOS Y LISTA PARA PROBAR: GESTORCLIENTE
         */

        //Lista de clientes (Vacia)
        Collection<Cliente> listaClientes = new ArrayList<>();

        // Clientes que añadirán a dicha lista
        listaClientes.add(new Cliente("Allison", "67432", null, new ArrayList<>()));
        listaClientes.add(new Cliente("David", "55567", null, new ArrayList<>()));
        listaClientes.add(new Cliente("Daniel", "99922", null, new ArrayList<>()));

        // Se crea el gestor de clientes
        GestorCliente gestorCliente = new GestorCliente(listaClientes);

        // Solicitar al usuario que ingrese el DNI del cliente a actualizar
        String dni = JOptionPane.showInputDialog(null,
                "Ingrese el DNI del cliente a actualizar:",
                "Actualizar Información del Cliente", JOptionPane.PLAIN_MESSAGE);

        gestorCliente.actualizarInformacionCliente(dni);
    }
}
package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import java.util.ArrayList;
import javax.swing.*;

public class ManejoInformacion {

    private Categoria agregarCategoria() {
        Categoria vCategorias;
        String vNombre = "";
        String vEstado = "";
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ", "Ingreso de Categorias", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado: ", "Ingreso de Categorias", JOptionPane.INFORMATION_MESSAGE);
        vCategorias = new Categoria(vNombre, vEstado);
        return vCategorias;
    }

    private void mostrarCategorias(ArrayList<Categoria> pCategorias) {
        String vInformacion = "";
        int vNumero = 1;
        for (Categoria c : pCategorias) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + c.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Categorias", JOptionPane.INFORMATION_MESSAGE);
    }

    private void modificarCategorias(ArrayList<Categoria> pCategorias) {
        Categoria vCategoria;
        String vInformacion = "";
        String vNombre = "";
        String vEstado = "";
        int vNumero = 1;
        for (Categoria c : pCategorias) {
            vInformacion = vInformacion + "\n" + vNumero + " - " + c.toString();
            vNumero++;
        }
        vInformacion = vInformacion + "\nIndique el numero de la categoria a modificar: ";
        vNumero = Integer.parseInt(JOptionPane.showInputDialog(null, vInformacion, "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE));
        vCategoria = pCategorias.get(vNumero - 1);
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre", "Actualizacion de Categoria", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Categoria", JOptionPane.INFORMATION_MESSAGE);
        vCategoria.setNombre(vNombre);
        vCategoria.setEstado(vEstado);
    }

    private void eliminarCategorias(ArrayList<Categoria> pCategorias) {
        Categoria vCategoria;
        String vInformacion = "";
        String vNombre = "";
        String vEstado = "";
        int vNumero = 1;
        for (Categoria c : pCategorias) {
            vInformacion = vInformacion + "\n" + vNumero + " - " + c.toString();
            vNumero++;
        }
        vInformacion = vInformacion + "\nIndique el numero de la categoria a eliminar: ";
        vNumero = Integer.parseInt(JOptionPane.showInputDialog(null, vInformacion, "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE));
        pCategorias.remove(vNumero-1);
        JOptionPane.showMessageDialog(null, "Categoria Eliminada");
    }

    public void manejoCategorias(int pOpcion, ArrayList<Categoria> pCategorias) {
        Categoria vCategoria;
        switch (pOpcion) {
            case 1:
                vCategoria = agregarCategoria();
                pCategorias.add(vCategoria);
                break;
            case 2:
                mostrarCategorias(pCategorias);
                break;
            case 3:
                modificarCategorias(pCategorias);
                break;
            case 4:
                eliminarCategorias(pCategorias);
                break;
            default:
                break;
        }
    }
}

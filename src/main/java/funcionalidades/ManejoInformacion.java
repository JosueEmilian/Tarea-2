package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import com.josueemilian.biblioteca.Editorial;
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
        Categoria vCategoria = null;
        String[] vAInformacion = new String[pCategorias.size()];
        String vInformacion = "";
        String vNombre = "";
        String vEstado = "";
        int vNumero = 0;
        for (Categoria c : pCategorias) {
            vAInformacion[vNumero] = c.getNombre();
            vNumero++;
        }
        //vNumero = Integer.parseInt(JOptionPane.showInputDialog(null, vInformacion, "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE));
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la categoria a modificar", "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Categoria c : pCategorias) {
            if (c.getNombre().equalsIgnoreCase(vInformacion)) {
                vCategoria = c;
                break;
            }
        }

        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre", "Actualizacion de Categoria", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Categoria", JOptionPane.INFORMATION_MESSAGE);
        vCategoria.setNombre(vNombre);
        vCategoria.setEstado(vEstado);
    }

    private void eliminarCategorias(ArrayList<Categoria> pCategorias) {
        Categoria vCategoria = null;
        String[] vAInformacion = new String[pCategorias.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Categoria c : pCategorias) {
            vAInformacion[vNumero] = c.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la categoria a eliminar", "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Categoria c : pCategorias) {
            if (c.getNombre().equalsIgnoreCase(vInformacion)) {
                vCategoria = c;
                break;
            }
        }
        pCategorias.remove(vCategoria);
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

    ///////////////////////////////
    
    private Editorial agregarEditoriales() {
        Editorial vEditorial;
        String vNombre = "";
        String vEstado = "";
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ", "Ingreso de Editoriales", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado: ", "Ingreso de Editoriales", JOptionPane.INFORMATION_MESSAGE);
        vEditorial = new Editorial(vNombre, vEstado);
        return vEditorial;
    }

    private void mostrarEditoriales(ArrayList<Editorial> pEditoriales) {
        String vInformacion = "";
        int vNumero = 1;
        for (Editorial e : pEditoriales) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Editoriales", JOptionPane.INFORMATION_MESSAGE);
    }

    private void modificarEditoriales(ArrayList<Editorial> pEditoriales) {
        Editorial vEditoriales = null;
        String[] vAInformacion = new String[pEditoriales.size()];
        String vInformacion = "";
        String vNombre = "";
        String vEstado = "";
        int vNumero = 0;
        for (Editorial e: pEditoriales) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la Editorial a modificar", "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Editorial e : pEditoriales) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vEditoriales = e;
                break;
            }
        }

        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre", "Actualizacion de Editoriales", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Editoriales", JOptionPane.INFORMATION_MESSAGE);
        vEditoriales.setNombre(vNombre);
        vEditoriales.setEstado(vEstado);
    }

    private void eliminarEditorial(ArrayList<Editorial> pEditoriales) {
        Editorial vEditoriales = null;
        String[] vAInformacion = new String[pEditoriales.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Editorial e: pEditoriales) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la Editorial a eliminar", "Listado de Categoria", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Editorial e : pEditoriales) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vEditoriales = e;
                break;
            }
        }
        pEditoriales.remove(vEditoriales);
        JOptionPane.showMessageDialog(null, "Editorial Eliminada");
    }
    
    
    ////////////////////////////

    public void manejoEditoriales(int pOpcion, ArrayList<Editorial> pEditoriales) {
        Editorial vEditorial;
        switch (pOpcion) {
            case 1:
                vEditorial = agregarEditoriales();
                pEditoriales.add(vEditorial);
                break;
            case 2:
                mostrarEditoriales(pEditoriales);
                break;
            case 3:
                modificarEditoriales(pEditoriales);
                break;
            case 4:
                eliminarEditorial(pEditoriales);
                break;
            default:
                break;
        }
    }
}

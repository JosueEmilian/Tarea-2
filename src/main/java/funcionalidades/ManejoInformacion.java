package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import com.josueemilian.biblioteca.Editorial;
import com.josueemilian.biblioteca.Autor;
import com.josueemilian.biblioteca.Libros;
import java.util.ArrayList;
import javax.swing.*;

public class ManejoInformacion extends Libros{

    //CRUD CATEGORIA
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

    //CRUD EDITORIAL
    
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

    
    //CRUD AUTORES
    
    private Autor agregarAutores() {
        Autor vAutor;
        String vNombre = "";
        String vFechaNacimiento = "";
        String vEstado = "";
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ", "Ingreso de Autores", JOptionPane.INFORMATION_MESSAGE);
        vFechaNacimiento = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento: ", "Ingreso de Autores", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el estado: ", "Ingreso de Autores", JOptionPane.INFORMATION_MESSAGE);
        vAutor = new Autor(vNombre, vFechaNacimiento, vEstado);
        return vAutor;
    }

    private void mostrarAutores(ArrayList<Autor> pAutores) {
        String vInformacion = "";
        int vNumero = 1;
        for (Autor e : pAutores) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Autores", JOptionPane.INFORMATION_MESSAGE);
    }

    private void modificarAutores(ArrayList<Autor> pAutores) {
        Autor vAutores = null;
        String[] vAInformacion = new String[pAutores.size()];
        String vInformacion = "";
        String vNombre = "";
        String vFechaNacimiento = "";
        String vEstado = "";
        int vNumero = 0;
        for (Autor e: pAutores) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el autor a modificar", "Listado de Autores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Autor e : pAutores) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vAutores = e;
                break;
            }
        }

        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre", "Actualizacion de Autores", JOptionPane.INFORMATION_MESSAGE);
        vFechaNacimiento = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento", "Actualizacion de Autores", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Autores", JOptionPane.INFORMATION_MESSAGE);
        vAutores.setNombre(vNombre);
        vAutores.setFechaNacimiento(vFechaNacimiento);
        vAutores.setEstado(vEstado);
    }

    private void eliminarAutor(ArrayList<Autor> pAutores) {
        Autor vAutores = null;
        String[] vAInformacion = new String[pAutores.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Autor e: pAutores) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el autor a eliminar", "Listado de Autores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Autor e : pAutores) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vAutores = e;
                break;
            }
        }
        pAutores.remove(vAutores);
        JOptionPane.showMessageDialog(null, "Autor Elimando");
    }
    
    
    public void manejoAutores(int pOpcion, ArrayList<Autor> pAutores) {
        Autor vAutor;
        switch (pOpcion) {
            case 1:
                vAutor = agregarAutores();
                pAutores.add(vAutor);
                break;
            case 2:
                mostrarAutores(pAutores);
                break;
            case 3:
                modificarAutores(pAutores);
                break;
            case 4:
                eliminarAutor(pAutores);
                break;
            default:
                break;
        }
    }
    
    
    //CRUD LIBRO
    private Libros agregarLibros(){
        Libros vLibro;
              
        String vNombre = "";
        int vAnio;
        String vEstado = "";
        
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ", "Ingreso de Libros", JOptionPane.INFORMATION_MESSAGE);
        vAnio =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el anio: ", "Ingreso de Libros", JOptionPane.INFORMATION_MESSAGE));
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el estado: ", "Ingreso de Libros", JOptionPane.INFORMATION_MESSAGE);
        
                
        Categoria c = new Categoria("NombreCategoria","Estado");
        Editorial e = new Editorial("NombreEditorial","Estado");
        ArrayList<Autor> pAutores = new ArrayList();
        
        vLibro = new Libros(vNombre, vAnio, vEstado,c,e,pAutores);

        return vLibro;
    }
    
    

    private void mostrarLibros(ArrayList<Libros> pLibros) {
        String vInformacion = "";
        int vNumero = 1;
        for (Libros e : pLibros) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Libros", JOptionPane.INFORMATION_MESSAGE);
    }

    
    private void modificarLibros(ArrayList<Libros> pLibros) {
        Libros vLibros = null;
        String[] vAInformacion = new String[pLibros.size()];
        String vInformacion = "";
        String vNombre = "";
        int vAnio;
        String vEstado = "";
        int vNumero = 0;
        for (Libros e: pLibros) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el libro a modificar", "Listado de Autores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Libros e : pLibros) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vLibros = e;
                break;
            }
        }

        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre", "Actualizacion de Libros", JOptionPane.INFORMATION_MESSAGE);
        vAnio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el anio", "Actualizacion de Libros", JOptionPane.INFORMATION_MESSAGE));
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Libros", JOptionPane.INFORMATION_MESSAGE);
        vLibros.setNombre(vNombre);
        vLibros.setAnio(vAnio);
        vLibros.setEstado(vEstado);
    }

    private void eliminarLibro(ArrayList<Libros> pLibros) {
        Libros vLibros = null;
        String[] vAInformacion = new String[pLibros.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Libros e: pLibros) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el autor a eliminar", "Listado de Autores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Libros e : pLibros) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vLibros = e;
                break;
            }
        }
        pLibros.remove(vLibros);
        JOptionPane.showMessageDialog(null, "Libro Elimando");
    }
    
  
    

    public void manejoLibros(int pOpcion, ArrayList<Libros> pLibros) {
        Libros vLibro;
        switch (pOpcion) {
            case 1:
                vLibro = agregarLibros();
                pLibros.add(vLibro);
                break;
            case 2:
                mostrarLibros(pLibros);
                break;
            case 3:
                modificarLibros(pLibros);
                break;
            case 4:
                eliminarLibro(pLibros);
                break;
            default:
                break;
        }
    }   

}

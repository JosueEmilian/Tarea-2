package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import com.josueemilian.biblioteca.Editorial;
import com.josueemilian.biblioteca.Autor;
import com.josueemilian.biblioteca.Libros;
import com.josueemilian.biblioteca.Copia;
import com.josueemilian.biblioteca.Lectores;
import com.josueemilian.biblioteca.Prestamos;
import com.josueemilian.biblioteca.Multas;
import java.util.ArrayList;
import javax.swing.*;

public class ManejoInformacion {

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
     
    //CRUD COPIAS
    private Copia agregarCopias(){
        Copia vCopia;
        
        int vIdentificador;      
        String vEstado = "";
        
        vIdentificador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Identificador: ", "Registro de Copias", JOptionPane.INFORMATION_MESSAGE));
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el estado: ", "Registro de Copias", JOptionPane.INFORMATION_MESSAGE);
                  
        Libros l = new Libros();
        
        vCopia = new Copia(vIdentificador, vEstado,l);

        return vCopia;
    }
      
    private void mostrarCopias(ArrayList<Copia> pCopias) {
        String vInformacion = "";
        int vNumero = 1;
        for (Copia e : pCopias) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Libros", JOptionPane.INFORMATION_MESSAGE);
    }
  
    private void modificarCopias(ArrayList<Copia> pCopias) {
        Copia vCopias = null;
        String[] vAInformacion = new String[pCopias.size()];
        String vInformacion = "";
        
        int vIdentificador;
        String vEstado = "";
        
        
        int vNumero = 0;
        for (Copia e: pCopias) {            
            vAInformacion[vNumero] = e.getEstado();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el libro a modificar", "Listado de Autores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Copia e : pCopias) {
            if (e.getEstado().equalsIgnoreCase(vInformacion)) {
                vCopias = e;
                break;
            }
        }

        vIdentificador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Identificador", "Actualizacion de Copias", JOptionPane.INFORMATION_MESSAGE));
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Copias", JOptionPane.INFORMATION_MESSAGE);
        vCopias.setIdentificador(vIdentificador);
        vCopias.setEstado(vEstado);
    }
    
    private void eliminarCopia(ArrayList<Copia> pCopias) {
        Copia vCopias = null;
        String[] vAInformacion = new String[pCopias.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Copia e: pCopias) {
            vAInformacion[vNumero] = e.getEstado();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la copia a eliminar", "Listado de Copias", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Copia e : pCopias) {
            if (e.getEstado().equalsIgnoreCase(vInformacion)) {
                vCopias = e;
                break;
            }
        }
        pCopias.remove(vCopias);
        JOptionPane.showMessageDialog(null, "Copia Elimando");
    }

    public void manejoCopias(int pOpcion, ArrayList<Copia> pCopias) {
        Copia vCopia;
        switch (pOpcion) {
            case 1:
                vCopia = agregarCopias();
                pCopias.add(vCopia);
                break;
            case 2:
                 mostrarCopias(pCopias);
                break;
            case 3:
                modificarCopias(pCopias);
                break;
            case 4:
               eliminarCopia(pCopias);
                break;
            default:
                break;
        }
    }   

    //CRUD LECTORES
    private Lectores agregarLectores(){
        Lectores vLector;
        
        int vDPI;      
        String vNombre = "";
        
        vDPI = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el DPI: ", "Registro de Lectores", JOptionPane.INFORMATION_MESSAGE));
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre: ", "Registro de Lectores", JOptionPane.INFORMATION_MESSAGE);
                
        vLector = new Lectores(vDPI, vNombre);

        return vLector;
    } 
    
    private void mostrarLectores(ArrayList<Lectores> pLectores) {
        String vInformacion = "";
        int vNumero = 1;
        for (Lectores e : pLectores) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Lectores", JOptionPane.INFORMATION_MESSAGE);
    }
   
    private void modificarLectores(ArrayList<Lectores> pLectores) {
        Lectores vLectores = null;
        String[] vAInformacion = new String[pLectores.size()];
        String vInformacion = "";
        
        int vDPI;
        String vNombre = "";
        
        
        int vNumero = 0;
        for (Lectores e: pLectores) {            
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el Lector a modificar", "Listado de Lectores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Lectores e : pLectores) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vLectores = e;
                break;
            }
        }

        vDPI = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el DPI", "Actualizacion de Lectores", JOptionPane.INFORMATION_MESSAGE));
        vNombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre", "Actualizacion de Lectores", JOptionPane.INFORMATION_MESSAGE);
        vLectores.setDPI(vDPI);
        vLectores.setNombre(vNombre);
    }
    
    private void eliminarLectores(ArrayList<Lectores> pLectores) {
        Lectores vLectores = null;
        String[] vAInformacion = new String[pLectores.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Lectores e: pLectores) {
            vAInformacion[vNumero] = e.getNombre();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el Lector a eliminar", "Listado de Lectores", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Lectores e : pLectores) {
            if (e.getNombre().equalsIgnoreCase(vInformacion)) {
                vLectores = e;
                break;
            }
        }
        pLectores.remove(vLectores);
        JOptionPane.showMessageDialog(null, "Lector Elimando");
    }

    public void manejoLectores(int pOpcion, ArrayList<Lectores> pLectores) {
        Lectores vLectores;
        switch (pOpcion) {
            case 1:
                vLectores = agregarLectores();
                pLectores.add(vLectores);
                break;
            case 2:
                 mostrarLectores(pLectores);
                break;
            case 3:
                modificarLectores(pLectores);
                break;
            case 4:
                eliminarLectores(pLectores);
                break;
            default:
                break;
        }
    }   
        
    //CRUD PRESTAMOS
    private Prestamos agregarPrestamos(){
        Prestamos vPrestamo;
        
        int vNumeroPrestamo; 
        String vFechaPrestamo = "";
        String vFechaDevolucion = "";
        
        Copia c = new Copia();
        Lectores l = new Lectores();
         
        vNumeroPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de Prestamo: ", "Registro de Prestamos", JOptionPane.INFORMATION_MESSAGE));
        vFechaPrestamo = JOptionPane.showInputDialog(null, "Ingrese la fecha del prestamo: ", "Registro de Prestamos", JOptionPane.INFORMATION_MESSAGE);
        vFechaDevolucion = JOptionPane.showInputDialog(null, "Ingrese la fecha de Devolucion: ", "Registro de Prestamos", JOptionPane.INFORMATION_MESSAGE);

        vPrestamo = new Prestamos(vNumeroPrestamo, vFechaPrestamo, vFechaDevolucion, c, l);

        return vPrestamo;
    }
   
    private void mostrarPrestamos(ArrayList<Prestamos> pPrestamos) {
        String vInformacion = "";
        int vNumero = 1;
        for (Prestamos e : pPrestamos) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Prestamos", JOptionPane.INFORMATION_MESSAGE);
    }
  
    private void modificarPrestamos(ArrayList<Prestamos> pPrestamos) {
        Prestamos vPrestamos = null;
        String[] vAInformacion = new String[pPrestamos.size()];
        String vInformacion = "";
        
        int vNumeroPrestamo; 
        String vFechaPrestamo = "";
        String vFechaDevolucion = "";
       // Copia pCopia = new Copia();
        //Lectores pLector = new Lectores();
        
        int vNumero = 0;
        for (Prestamos e: pPrestamos) {            
            vAInformacion[vNumero] = e.getFechaDevolucion();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el prestamo a modificar", "Listado de Prestamos", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Prestamos e : pPrestamos) {
            if (e.getFechaDevolucion().equalsIgnoreCase(vInformacion)) {
                vPrestamos = e;
                break;
            }
        }

        vNumeroPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de Prestamo", "Actualizacion  de Prestamos", JOptionPane.INFORMATION_MESSAGE));
        vFechaPrestamo = JOptionPane.showInputDialog(null, "Ingrese la fecha de Prestamo", "Actualizacion de Prestamos", JOptionPane.INFORMATION_MESSAGE);
        vFechaDevolucion = JOptionPane.showInputDialog(null, "Ingrese la fecha de Devolucion", "Actualizacion de Prestamos", JOptionPane.INFORMATION_MESSAGE);
        vPrestamos.setNumeroPrestamo(vNumeroPrestamo);
        vPrestamos.setFechaPrestamo(vFechaPrestamo);
        vPrestamos.setFechaDevolucion(vFechaDevolucion);
        
    }

    private void eliminarPrestamos(ArrayList<Prestamos> pPrestamos) {
        Prestamos vPrestamos = null;
        String[] vAInformacion = new String[pPrestamos.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Prestamos e: pPrestamos) {
            vAInformacion[vNumero] = e.getFechaDevolucion();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es el Prestamo a eliminar", "Listado de Prestamos", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Prestamos e : pPrestamos) {
            if (e.getFechaDevolucion().equalsIgnoreCase(vInformacion)) {
                vPrestamos = e;
                break;
            }
        }
        pPrestamos.remove(vPrestamos);
        JOptionPane.showMessageDialog(null, "Prestamo Elimando");
    }
 
    public void manejoPrestamos(int pOpcion, ArrayList<Prestamos> pPrestamos) {
        Prestamos vPrestamos;
        switch (pOpcion) {
            case 1:
                vPrestamos = agregarPrestamos();
                pPrestamos.add(vPrestamos);
                break;
            case 2:
                 mostrarPrestamos(pPrestamos);
                break;
            case 3:
                modificarPrestamos(pPrestamos);
                break;
            case 4:
                eliminarPrestamos(pPrestamos);
                break;
            default:
                break;
        }
    }   
     
    //CRUD MULTAS
    private Multas agregarMultas(){
        Multas vMulta;
        
        int vNumeroMulta; 
        int vMonto;
        String vFechaMulta = "";
        String vEstado = "";
        Lectores l = new Lectores();
                 
        vNumeroMulta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de Multa: ", "Registro de Multas", JOptionPane.INFORMATION_MESSAGE));
        vMonto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Monto: ", "Registro de Multas", JOptionPane.INFORMATION_MESSAGE));
        vFechaMulta = JOptionPane.showInputDialog(null, "Ingrese la fecha de la multa: ", "Registro de Multas", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el estado: ", "Registro de Multas", JOptionPane.INFORMATION_MESSAGE);

        vMulta = new Multas(vNumeroMulta, vFechaMulta, vMonto, vEstado, l);

        return vMulta;
    }
     
    private void mostrarMultas(ArrayList<Multas> pMultas) {
        String vInformacion = "";
        int vNumero = 1;
        for (Multas e : pMultas) {
            vInformacion = vInformacion + "\n" + vNumero + "-" + e.toString();
            vNumero++;
        }
        JOptionPane.showMessageDialog(null, vInformacion, "Listado de Multas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void modificarMultas(ArrayList<Multas> pMultas) {
        Multas vMultas = null;
        String[] vAInformacion = new String[pMultas.size()];
        String vInformacion = "";
        
        int vNumeroMulta; 
        int vMonto;
        String vFechaMulta = "";
        String vEstado = "";
        
        int vNumero = 0;
        for (Multas e: pMultas) {            
            vAInformacion[vNumero] = e.getFechaMulta();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la multa a modificar", "Listado de Multas", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Multas e : pMultas) {
            if (e.getFechaMulta().equalsIgnoreCase(vInformacion)) {
                vMultas = e;
                break;
            }
        }

        vNumeroMulta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de Multa", "Actualizacion de Multas", JOptionPane.INFORMATION_MESSAGE));
        vMonto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Monto de Multa", "Actualizacion de Multas", JOptionPane.INFORMATION_MESSAGE));
        vFechaMulta = JOptionPane.showInputDialog(null, "Ingrese la fecha de la multa", "Actualizacion de Multas", JOptionPane.INFORMATION_MESSAGE);
        vEstado = JOptionPane.showInputDialog(null, "Ingrese el Estado", "Actualizacion de Multas", JOptionPane.INFORMATION_MESSAGE);
        vMultas.setNumeroMulta(vNumeroMulta);
        vMultas.setMonto(vMonto);
        vMultas.setFechaMulta(vFechaMulta);
        vMultas.setEstado(vEstado);  
    }
 
    private void eliminarMultas(ArrayList<Multas> pMultas) {
        Multas vMultas = null;
        String[] vAInformacion = new String[pMultas.size()];
        String vInformacion = "";
        int vNumero = 0;
        for (Multas e: pMultas) {
            vAInformacion[vNumero] = e.getFechaMulta();
            vNumero++;
        }
        vInformacion = (String) JOptionPane.showInputDialog(null, "Cual es la multa a eliminar", "Listado de Prestamos", JOptionPane.INFORMATION_MESSAGE, null, vAInformacion, 1);
        for (Multas e : pMultas) {
            if (e.getFechaMulta().equalsIgnoreCase(vInformacion)) {
                vMultas = e;
                break;
            }
        }
        pMultas.remove(vMultas);
        JOptionPane.showMessageDialog(null, "Multa Elimando");
    }

    public void manejoMultas(int pOpcion, ArrayList<Multas> pMultas) {
        Multas vMultas;
        switch (pOpcion) {
            case 1:
                vMultas = agregarMultas();
                pMultas.add(vMultas);
                break;
            case 2:
                 mostrarMultas(pMultas);
                break;
            case 3:
                modificarMultas(pMultas);
                break;
            case 4:
                eliminarMultas(pMultas);
                break;
            default:
                break;
        }
    }   
}

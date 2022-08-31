package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import com.josueemilian.biblioteca.Editorial;
import com.josueemilian.biblioteca.Autor;
import com.josueemilian.biblioteca.Libros;
import com.josueemilian.biblioteca.Copia;
import com.josueemilian.biblioteca.Lectores;
import com.josueemilian.biblioteca.Prestamos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class manejoArchivos {

    //TXT CATEGORIAS
    private void guardarCategorias(ArrayList<Categoria> pCategorias) {
        String vNombreArchivo = "categorias.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Categoria c : pCategorias) {
                objetoSalida.writeObject(c);
                //System.out.println("Almacenando registro -> " + c.getNombre());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no disponible | " + e);
        } catch (IOException e) {
            System.out.println("Archivo no disponible ok | " + e);
        }

    }

    private void recuperarCategoria(ArrayList<Categoria> pCategorias) {
        String vNombreArchivo = "categorias.txt";
        Categoria vCategoria = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vCategoria = (Categoria) objetoEntrada.readObject();
                pCategorias.add(vCategoria);
                //System.out.println("Recuperando Categoria: ->" + vCategoria.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException i) {
            System.out.println("Error: " + i);
        } catch (ClassNotFoundException j) {
            System.out.println("Error: " + j);
        }
    }

    //TXT EDITORIALES
    private void guardarEditoriales(ArrayList<Editorial> pEditoriales) {
        String vNombreArchivo = "editoriales.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Editorial e : pEditoriales) {
                objetoSalida.writeObject(e);
                //System.out.println("Almacenando registro -> " + e.getNombre());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no disponible | " + ex);
        } catch (IOException ex) {
            System.out.println("Archivo no disponible ok | " + ex);
        }

    }

    private void recuperarEditoriales(ArrayList<Editorial> pEditoriales) {
        String vNombreArchivo = "editoriales.txt";
        Editorial vEditorial = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vEditorial = (Editorial) objetoEntrada.readObject();
                pEditoriales.add(vEditorial);
                //System.out.println("Recuperando editorial: ->" + vEditorial.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    //TXT AUTORES
    private void guardarAutores(ArrayList<Autor> pAutores) {
        String vNombreArchivo = "autores.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Autor e : pAutores) {
                objetoSalida.writeObject(e);
                //System.out.println("Almacenando registro -> " + e.getNombre());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no disponible | " + ex);
        } catch (IOException ex) {
            System.out.println("Archivo no disponible ok | " + ex);
        }

    }

    private void recuperarAutores(ArrayList<Autor> pAutores) {
        String vNombreArchivo = "autores.txt";
        Autor vAutor = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vAutor = (Autor) objetoEntrada.readObject();
                pAutores.add(vAutor);
                //System.out.println("Recuperando Autor: ->" + vAutor.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    
    //Txt Libros
    private void guardarLibros(ArrayList<Libros> pLibros) {
        String vNombreArchivo = "libros.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Libros e : pLibros) {
                objetoSalida.writeObject(e);
                //System.out.println("Almacenando registro -> " + e.getNombre());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no disponible | " + ex);
        } catch (IOException ex) {
            System.out.println("Archivo no disponible ok | " + ex);
        }

    }

    private void recuperarLibros(ArrayList<Libros> pLibros) {
        String vNombreArchivo = "libros.txt";
        Libros vLibro = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vLibro = (Libros) objetoEntrada.readObject();
                pLibros.add(vLibro);
                //System.out.println("Recuperando Libro: ->" + vLibro.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    //Txt Copias
    private void guardarCopias(ArrayList<Copia> pCopias) {
        String vNombreArchivo = "copias.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Copia e : pCopias) {
                objetoSalida.writeObject(e);
                //System.out.println("Almacenando registro -> " + e.getEstado());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no disponible | " + ex);
        } catch (IOException ex) {
            System.out.println("Archivo no disponible ok | " + ex);
        }

    }

    private void recuperarCopias(ArrayList<Copia> pCopias) {
        String vNombreArchivo = "copias.txt";
        Copia vCopia = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vCopia = (Copia) objetoEntrada.readObject();
                pCopias.add(vCopia);
                //System.out.println("Recuperando copia: ->" + vCopia.getEstado());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    
    //Txt Lectores
    private void guardarLectores(ArrayList<Lectores> pLectores) {
        String vNombreArchivo = "lectores.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Lectores e : pLectores) {
                objetoSalida.writeObject(e);
                //System.out.println("Almacenando registro -> " + e.getNombre());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no disponible | " + ex);
        } catch (IOException ex) {
            System.out.println("Archivo no disponible ok | " + ex);
        }

    }

    private void recuperarLectores(ArrayList<Lectores> pLectores) {
        String vNombreArchivo = "lectores.txt";
        Lectores vLectores = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vLectores = (Lectores) objetoEntrada.readObject();
                pLectores.add(vLectores);
               // System.out.println("Recuperando copia: ->" + vLectores.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    
    //Txt Prestamos
    private void guardarPrestamos(ArrayList<Prestamos> pPrestamos) {
        String vNombreArchivo = "prestamos.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(vNombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            for (Prestamos e : pPrestamos) {
                objetoSalida.writeObject(e);
                //System.out.println("Almacenando registro -> " + e.getNombre());
            }
            objetoSalida.close();
            archivoSalida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no disponible | " + ex);
        } catch (IOException ex) {
            System.out.println("Archivo no disponible ok | " + ex);
        }

    }

    private void recuperarPrestamos(ArrayList<Prestamos> pPrestamos) {
        String vNombreArchivo = "prestamos.txt";
        Prestamos vPrestamos = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(vNombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            while (objetoEntrada != null) {
                vPrestamos = (Prestamos) objetoEntrada.readObject();
                pPrestamos.add(vPrestamos);
               // System.out.println("Recuperando copia: ->" + vLectores.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    //////////////////////////////
    public void resguardarInformacion(ArrayList<Categoria> pCategorias) {
        guardarCategorias(pCategorias);
    }

    public void recuperarInformacion(ArrayList<Categoria> pCategorias) {
        recuperarCategoria(pCategorias);
    }

    public void resguardarInformacionEdit(ArrayList<Editorial> pEditoriales) {
        guardarEditoriales(pEditoriales);
    }

    public void recuperarInformacionEdit(ArrayList<Editorial> pEditoriales) {
        recuperarEditoriales(pEditoriales);
    }

    public void resguardarInformacionAutores(ArrayList<Autor> pAutores) {
        guardarAutores(pAutores);
    }

    public void recuperarInformacionAutores(ArrayList<Autor> pAutores) {
        recuperarAutores(pAutores);
    }
    
    public void resguardarInformacionLibros(ArrayList<Libros> pLibros){
        guardarLibros(pLibros);
    }
    
    public void recuperarInformacionLibros(ArrayList<Libros> pLibros){
        recuperarLibros(pLibros);
    }
    
    public void resguardarInformacionCopias(ArrayList<Copia> pCopias){
        guardarCopias(pCopias);
    }
    
    public void recuperarInformacionCopias(ArrayList<Copia> pCopias){
        recuperarCopias(pCopias);
    }
    
    public void resguardarInformacionLectores(ArrayList<Lectores> pLectores){
        guardarLectores(pLectores);
    }
    
    public void recuperarInformacionLectores(ArrayList<Lectores> pLectores){
        recuperarLectores(pLectores);
    }
    
    public void resguardarInformacionPrestamos(ArrayList<Prestamos> pPrestamos){
        guardarPrestamos(pPrestamos);
    }
    
    public void recuperarInformacionPrestamos(ArrayList<Prestamos> pPrestamos){
        recuperarPrestamos(pPrestamos);
    }
}
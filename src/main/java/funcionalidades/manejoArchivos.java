package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import com.josueemilian.biblioteca.Editorial;
import com.josueemilian.biblioteca.Autor;
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
                System.out.println("Almacenando registro -> " + c.getNombre());
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
                System.out.println("Recuperando Categoria: ->" + vCategoria.getNombre());
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
                System.out.println("Almacenando registro -> " + e.getNombre());
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
                System.out.println("Recuperando editorial: ->" + vEditorial.getNombre());
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
                System.out.println("Almacenando registro -> " + e.getNombre());
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
                System.out.println("Recuperando Autor: ->" + vAutor.getNombre());
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
}

package funcionalidades;

import com.josueemilian.biblioteca.Categoria;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class manejoArchivos {

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
            while(objetoEntrada!=null){
                vCategoria = (Categoria)objetoEntrada.readObject();
                pCategorias.add(vCategoria);
                System.out.println("Recuperando Categoria: ->"+vCategoria.getNombre());
            }
            objetoEntrada.close();
            archivoEntrada.close();
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e);
        }catch(IOException i){
            System.out.println("Error: "+i);
        }catch(ClassNotFoundException j){
            System.out.println("Error: "+j);
        }
    }

    private void guardarEditoriales() {

    }

    public void resguardarInformacion(ArrayList<Categoria> pCategorias) {
        guardarCategorias(pCategorias);
    }

    public void recuperarInformacion(ArrayList<Categoria> pCategorias) {
        recuperarCategoria(pCategorias);
    }
}

package com.josueemilian.biblioteca;

import funcionalidades.ManejoInformacion;
import funcionalidades.manejoArchivos;
import funcionalidades.manejoMenu;
import javax.swing.*;
import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args){
        int vOpcionMenu;
        int vOpcionSubMenu = 0;
        
        //creacion de Array List
        ArrayList<Categoria> aCategorias = new ArrayList();
        ArrayList<Editorial> aEditoriales = new ArrayList();
        ArrayList<Autor> aAutores = new ArrayList();
        ArrayList<Libros> aLibros = new ArrayList();
        ArrayList<Copia> aCopias = new ArrayList();
        ArrayList<Lectores> aLectores = new ArrayList();
        ArrayList<Prestamos> aPrestamos = new ArrayList();
        ArrayList<Multas> aMultas = new ArrayList();
        
        //intanciamos las clases
        manejoMenu oMenu = new manejoMenu();
        ManejoInformacion oInformacion = new ManejoInformacion();
        manejoArchivos oArchivos = new manejoArchivos();
        
        oArchivos.recuperarInformacion(aCategorias);
        oArchivos.recuperarInformacionEdit(aEditoriales);
        oArchivos.recuperarInformacionAutores(aAutores);
        oArchivos.recuperarInformacionLibros(aLibros);
        oArchivos.recuperarInformacionCopias(aCopias);
        oArchivos.recuperarInformacionLectores(aLectores);
        oArchivos.recuperarInformacionPrestamos(aPrestamos);
        oArchivos.recuperarInformacionMultas(aMultas);
        
        
        do {
            vOpcionMenu = oMenu.mostrararMenu();
            if (vOpcionMenu != 9) {
                vOpcionSubMenu = oMenu.mostrarSubMenu();
            }
            switch (vOpcionMenu) {
                case 1:
                    oInformacion.manejoCategorias(vOpcionSubMenu, aCategorias);
                    break;
                case 2:
                    oInformacion.manejoEditoriales(vOpcionSubMenu,aEditoriales);
                    break;
                case 3:
                    oInformacion.manejoAutores(vOpcionSubMenu, aAutores);
                    break;
                case 4:
                    oInformacion.manejoLibros(vOpcionSubMenu, aLibros);
                    break;
                case 5:
                    oInformacion.manejoCopias(vOpcionSubMenu, aCopias);
                    break;
                case 6:
                    oInformacion.manejoLectores(vOpcionSubMenu, aLectores);
                    break;
                case 7:
                    oInformacion.manejoPrestamos(vOpcionSubMenu, aPrestamos);
                    break;
                case 8:
                    oInformacion.manejoMultas(vOpcionSubMenu, aMultas);
                    break;
                case 9:
                    oArchivos.resguardarInformacion(aCategorias);
                    oArchivos.resguardarInformacionEdit(aEditoriales);
                    oArchivos.resguardarInformacionAutores(aAutores);
                    oArchivos.resguardarInformacionLibros(aLibros);
                    oArchivos.resguardarInformacionCopias(aCopias);
                    oArchivos.resguardarInformacionLectores(aLectores);
                    oArchivos.resguardarInformacionPrestamos(aPrestamos);
                    oArchivos.resguardarInformacionMultas(aMultas);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Vuelve a Intentarlo");
                    break;
            }
        } while (vOpcionMenu != 9);
    }
}

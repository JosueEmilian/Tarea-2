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
        ArrayList<Libros> pLibros = new ArrayList();
        
        //intanciamos las clases
        manejoMenu oMenu = new manejoMenu();
        ManejoInformacion oInformacion = new ManejoInformacion();
        manejoArchivos oArchivos = new manejoArchivos();
        
        oArchivos.recuperarInformacion(aCategorias);
        oArchivos.recuperarInformacionEdit(aEditoriales);
        oArchivos.recuperarInformacionAutores(aAutores);
        
        
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
                    oInformacion.manejoLibros(vOpcionSubMenu, pLibros);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    oArchivos.resguardarInformacion(aCategorias);
                    oArchivos.resguardarInformacionEdit(aEditoriales);
                    oArchivos.resguardarInformacionAutores(aAutores);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Vuelve a Intentarlo");
                    break;
            }
        } while (vOpcionMenu != 9);
    }
}

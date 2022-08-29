package com.josueemilian.biblioteca;

import funcionalidades.ManejoInformacion;
import funcionalidades.manejoMenu;
import javax.swing.*;
import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {
        int vOpcionMenu;
        int vOpcionSubMenu = 0;
        //creacion de Array List
        ArrayList<Categoria> aCategorias = new ArrayList();
        ArrayList<Editorial> aEditoriales = new ArrayList();

        manejoMenu oMenu = new manejoMenu();
        ManejoInformacion oInformacion = new ManejoInformacion();

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
                    break;
                case 4:
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
                    JOptionPane.showMessageDialog(null, "Fin de la aplicacion");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Vuelve a Intentarlo");
                    break;
            }
        } while (vOpcionMenu != 9);

    }

}

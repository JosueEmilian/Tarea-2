package funcionalidades;

import javax.swing.*;

public class manejoMenu {

    //metodos
    public int mostrararMenu() {
        int vResultado = 0;
        vResultado = Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. Categorias\n"
                        + "2. Editoriales\n"
                        + "3. Autores\n"
                        + "4. Libros\n"
                        + "5. Copias\n"
                        + "6. Lectores\n"
                        + "7. Prestamos\n"
                        + "8. Multas\n"
                        + "9. Salida\n"
                        + "Indique la opcion a elegir:",
                        "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
        return vResultado;
    }

    //
    public int mostrarSubMenu() {
        int vResultado = 0;
        vResultado = Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. Agregar\n"
                        + "2. Visualizar\n"
                        + "3. Modificar\n"
                        + "4. Eliminar\n"
                        + "5. Salida", "Sub Menu",
                        JOptionPane.INFORMATION_MESSAGE));
        return vResultado;
    }
}

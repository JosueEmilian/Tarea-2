package funcionalidades;

import javax.swing.*;

public class manejoMenu {

    //metodos
    public int mostrararMenu() {
        int vResultado = 0;
        vResultado = Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. Categorias\n2. Editoriales\n3. Autores\n"
                        + "4. Libros\n5. Copias\n6. Lectores\n"
                        + "7. Prestamos\n8. Multas\n9. Salida\n"
                        + "Indique la opcion a elegir:", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
        return vResultado;
    }

    public int mostrarSubMenu() {
        int vResultado = 0;
        vResultado = Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. Agregar\n2. Visualizar\n3. Modificar\n"
                                                + "4. Eliminar\n5. Salida", "Sub Menu",
                                                  JOptionPane.INFORMATION_MESSAGE));
        return vResultado;
    }
}

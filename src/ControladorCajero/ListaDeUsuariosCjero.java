/*
 *metodo que muestra y verifica el usuario
 */
package ControladorCajero;

import ModeloCajero.UsuarioCajero;
import java.util.Vector;

/**
 *
 * @author elian
 */
public class ListaDeUsuariosCjero {

    private static Vector<UsuarioCajero> datos = new Vector<UsuarioCajero>();

    public static void agregar(UsuarioCajero ob) {
        datos.addElement(ob);
    }

    public static void eliminar(int pos) {
        datos.removeElement(pos);
    }

    public static Vector mostrar() {
        return datos;

    }

    public static Vector mostra() {
        return ListaDeUsuariosCjero.mostrar();

    }

    public static int verificarUsuarioNuevo(String usu) {
        Vector lista = mostrar();
        UsuarioCajero obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (UsuarioCajero) lista.elementAt(i);
            if (obj.getNombre().equals(usu)) {
                return 1;
            }

        }

        return -1;

    }

    public static int verificarlogueo(String usuario, String contra) {
        Vector lista = mostrar();
        UsuarioCajero obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (UsuarioCajero) lista.elementAt(i);
            if (obj.getNombre().equalsIgnoreCase(usuario) && obj.getContraseña().equalsIgnoreCase(contra)) {
                return 1;
            }
        }
        return -1;

    }

}

/*
 * metodo de saldo
 */
package ControladorCajero;

import ModeloCajero.ClaseAbstOperaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author elian
 */
public class ClaseHijaSaldo extends ClaseAbstOperaciones {

    @Override
    public void Transacciones() {
        JOptionPane.showMessageDialog(null, "SU SALDO ES ACTUAL ES  : " +getSaldo());
        
    }
    
}

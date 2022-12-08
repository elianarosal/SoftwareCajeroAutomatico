/*
 * metodo de retiro
 */
package ControladorCajero;

import ModeloCajero.ClaseAbstOperaciones;
import static ModeloCajero.ClaseAbstOperaciones.getSaldo;
import javax.swing.JOptionPane;

/**
 *
 * @author elian
 */
public class ClaseHijaRetiro extends ClaseAbstOperaciones {

    @Override
    public void Transacciones() {
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            JOptionPane.showMessageDialog(null, "RETIRASTE:  " + retiro);
            JOptionPane.showMessageDialog(null, "SU SALDO ACTUAL ES  : " + getSaldo());

        } else {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");

        }
    }
}

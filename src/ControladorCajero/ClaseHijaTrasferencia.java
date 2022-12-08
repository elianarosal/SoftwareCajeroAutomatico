/*
 * metodo transferencia
 */
package ControladorCajero;

import ModeloCajero.ClaseAbstOperaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author elian
 */
public class ClaseHijaTrasferencia extends ClaseAbstOperaciones {

    @Override
    public void Transacciones() {
        Transferencia();
        if (transferencia <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - transferencia);
            JOptionPane.showMessageDialog(null, "USTED REALIZO UNA TRANSFERENCIA DE : " + transferencia);
            JOptionPane.showMessageDialog(null, "SU SALDO ACTUAL ES DE : " + getSaldo());

        } else {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");

        }

    }

}

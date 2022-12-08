/*
 * metodo que controla deposito, extiende de la clse padre tomando una constante saldo
 */
package ControladorCajero;

import ModeloCajero.ClaseAbstOperaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author elian
 */
public class ClaseHijaDeposito  extends ClaseAbstOperaciones{

    @Override
    public void Transacciones() {
         Deposito();
        transacciones = getSaldo();
         setSaldo(transacciones + deposito);
         JOptionPane.showMessageDialog(null, "USTED REALIZO UN DEPOSITO A SU CUENTA  DE : " + deposito);
          JOptionPane.showMessageDialog(null, "TU SALDO ACTUAL ES : " + getSaldo());
      
        
    
    }
    
}

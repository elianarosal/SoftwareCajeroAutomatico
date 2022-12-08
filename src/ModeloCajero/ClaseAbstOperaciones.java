/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloCajero;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elian
 */
public abstract class ClaseAbstOperaciones {

    protected int transacciones = 0, retiro = 0, deposito = 0, transferencia = 0;

    public int getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(int transferencia) {
        this.transferencia = transferencia;
    }
    private static int saldo = 5000;
    Scanner entrada = new Scanner(System.in);

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClaseAbstOperaciones.saldo = saldo;
    }

    public abstract void Transacciones();

    public void Retiro() {
        retiro = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL RETIRO"));

    }

    public void Deposito() {

        deposito = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL DEPOSITO"));
    }

    public void Transferencia() {
        transferencia = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL MONTO DE LA TRANSFERENCIA"));

    }
}

/*
 * software sencillo , que hace de un simulador de cajero , lo relice bajo el patron de diseño MVC
 */
package softwarecajeroautomatico;

import VistaCajero.JFrameInfirmacionMVC;
import VistaCajero.JFrameLogueo;

/**
 *
 * @author elianaRosal
 */
public class SoftwareCajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     JFrameInfirmacionMVC logueo = new JFrameInfirmacionMVC();
      logueo.setVisible(true);
      logueo.setResizable(true);
    }
    
}

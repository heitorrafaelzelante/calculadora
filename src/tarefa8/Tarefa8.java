/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa8;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author heito
 */
public class Tarefa8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nimbus();
        // TODO code application logic here
        calculadora calc = new calculadora();
        calc.setLocationRelativeTo(null);
        //calc.setLocation(100, 200);
        calc.setVisible(true);

    }

    private static void nimbus() {
        String laf = "";

        try {

            try {
                //TENTA USAR O NIMBUS
                UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();

                if (laf.length() == 0) {
                    laf = "NimbusLookAndFeel";
                }

                for (UIManager.LookAndFeelInfo lookAndFeelInfo : info) {
                    if (lookAndFeelInfo.getClassName().contains(laf)) {
                        UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
                        break;
                    }
                }

            } catch (Exception ex) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }

        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex) {
        }
    }

}

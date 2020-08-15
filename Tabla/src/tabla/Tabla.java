/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Pantalla v1 = new Pantalla();
        v1.setVisible(true);//muestra ventana
        v1.setSize(650,600);
        v1.setTitle("Tabla UTH");
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setLocationRelativeTo(null);
    }
    
}

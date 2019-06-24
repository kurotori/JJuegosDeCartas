/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JLabel;

/**
 *
 * @author Sebastian
 */
public class Ventanita extends Ventana {
    
    public Ventanita(){
        this.setTitle("Soy Hija de la Ventana");
        this.getjLabel1().setText("Cambiamos Todo");
        this.getMenu().removeAllItems();
        this.getMenu().addItem("Una cosa");
        this.getMenu().addItem("Otra cosa");
        this.getMenu().addItem("Esa cosa");
        this.getMenu().addItem("La cosa");
    }
    
}

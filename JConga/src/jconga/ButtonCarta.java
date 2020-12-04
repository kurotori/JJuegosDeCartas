/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import baraja.Carta;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import javax.swing.JButton;
import javax.imageio.*;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author luiss
 */
public class ButtonCarta extends JButton{
    
    private Carta carta = new Carta(0, "vacia");
    public boolean seleccionada = false;
    public boolean enJuego = false;
    
    public ButtonCarta(){
        ActualizarImagen();
    }

    /**
     * @return the carta
     */
    public Carta getCarta() {
        return carta;
    }

    /**
     * @param carta the carta to set
     */
    public void setCarta(Carta carta) {
        this.carta = carta;
    }
    
    public void ActualizarImagen(){
        String ruta = carta.rutaImagen();
        try{
            Image img = ImageIO.read(getClass().getResource(ruta));
            img = img.getScaledInstance(104, 160, Image.SCALE_SMOOTH);
            this.setIcon(new ImageIcon(img));
        }
        catch(IOException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
        
    }
    
    public void PonerBordes(){
        LineBorder borde;
        if (seleccionada) {
            borde = new LineBorder(Color.red, 5);
        }
        else{
            borde =  new LineBorder(Color.white, 0);
        }
        this.setBorder(borde);
    }
    
    public void Mover(){
        Rectangle posBtn = this.getBounds();
        Rectangle posBtn2;
        if (seleccionada) {
            posBtn2 = new Rectangle(posBtn.x, (posBtn.y)-20, posBtn.width, posBtn.height);
        }
        else{
            posBtn2 = new Rectangle(posBtn.x, (posBtn.y)+20, posBtn.width, posBtn.height);
        }
        this.setBounds(posBtn2);
    }
    
    
    
}

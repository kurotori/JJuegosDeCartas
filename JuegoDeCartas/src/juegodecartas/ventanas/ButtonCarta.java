/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas.ventanas;

import javax.swing.AbstractButton;
import juegodecartas.baraja.Carta;

/**
 *
 * @author luiss
 */
public class ButtonCarta extends AbstractButton{
    
    private Carta carta = null;

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
        String ruta = carta.RutaImagen();
    }
}

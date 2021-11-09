/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop8;

/**
 *
 * @author migue
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    public InstrumentoViento() {
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}

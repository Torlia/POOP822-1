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
public interface InstrumentoMusical {
    
    //Por defecto, todos los métodos definidos dentro de una interfaz son públicos y abstractos
    void tocar();
    void afinar();
    String tipoInstrumento();
}

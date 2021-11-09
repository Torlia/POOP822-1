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
public class Main {
    public static void main(String[] args) {
        System.out.println("###Objetos se comportan como superclases###");
        PoligonoC poligonoC = new PoligonoC();
        //Polígono puede comportase como su superclase Object
        Object objeto = poligonoC; //objeto = perroK;
        System.out.println(poligonoC);
        System.out.println(objeto);
        poligonoC = (PoligonoC) objeto; //Se requiere hacer un casteo
        System.out.println(poligonoC);
        
        float flotante;
        double doble = 1.6666666666666666666666666;
        flotante = (float) doble;
        
        poligonoC = new TrianguloC();
        System.out.println(poligonoC);
        poligonoC = new CuadrilateroC();
        System.out.println(poligonoC.toString());
        
        PoligonoC poli = new CuadrilateroC();
        System.out.println(poli.toString());
        //poli.setBase(5.5f);   //El método no está definido en el PolígonoC,
                                //por lo tanto no puede sobreescribirlo
        
        System.out.println("###Clases abstractas###");
        
        //PoligonoA polA = new PoligonoA(); -> No se puede crear objetos de clases abstractas
        PoligonoA polA = new TrianguloA();
        System.out.println(polA);
        polA = new CuadrilateroA();
        System.out.println(polA);
        
        System.out.println("###Interfaces###");
        
        //Podemos crear una referencia a interfaz
        InstrumentoMusical instrumento;
        //Pero no podemos implementarla
        //InstrumentoMusical instru = new InstrumentoMusical();
        
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
        
        System.out.println("###Actividad extra###");
        // Se puede acceder a las variables de la interfaz sin crear instancias
        System.out.println("El mes "+Meses.DOS+" corresponde a:");
        System.out.println(Meses.NOMBRES_MESES[Meses.DOS]);
    }
}

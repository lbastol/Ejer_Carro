/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.agregacion.vista;

import edu.unal.poo.agregacion.modelo.Automovil;
import edu.unal.poo.agregacion.modelo.LLanta;
import edu.unal.poo.agregacion.modelo.Motor;
import edu.unal.poo.agregacion.modelo.Puerta;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setNumeroSerie("123");
        //..
        LLanta l1 = new LLanta();
        l1.setModelo("12");
        //...
        Puerta puerta = new Puerta();
        
        Automovil auto = new Automovil();
        auto.setMarca("bbb");
        auto.addPuerta(puerta);
        //..
        auto.addLlanta(l1);
        auto.replaceMotor(motor);
    }
}

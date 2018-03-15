/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.agregacion.modelo;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int annio;
    private LLanta[] llantas;
    private Puerta[] puertas;
    private Motor motor;

    public Automovil() {
      this.llantas = new LLanta[4];
      this.puertas = new Puerta[4];
    }
    
    public Motor getMotor(){
      return this.motor;
    }
    
    public void replaceMotor(Motor motor){
      this.motor = motor;
    }
    
    public LLanta[] getLlantas(){
      return this.llantas;
    }
    public boolean addLlanta(LLanta llanta){
        int posVacio = -1;
        for (int i=0; i<4; i++){
            if(this.llantas[i]==null){
                posVacio=i;
                break;
            }
        }
        if(posVacio!=-1){
            llanta = this.llantas[posVacio];
            return true;
        }else
        return false;
    }
    
    public boolean removeLlanta(LLanta llanta){
        boolean resultado=false;
        for(int i=0; i<4 ; i++){
            if(this.llantas[i]!=null){
                if(this.llantas[i].equals(llanta)){
                    this.llantas[i]=null;
                    resultado= true;
                }
            }
        }
      return false;
    }
    public boolean replaceLlanta(LLanta llanta, LLanta nueva){
       boolean resultado=false;
       for(int i=0; i<4; i++){
           if(this.llantas[i]!=null){
               if(this.llantas[i]== llanta){
                   this.llantas[i]=nueva;
                   resultado=true;
               }
           }
       }
       
        return false;
    }
    
    public boolean addPuerta(Puerta puerta){
        int posVacio = -1;
        for (int i=0; i<4; i++){
            if(this.puertas[i]==null){
                posVacio=i;
                break;
            }
        }
        if(posVacio!=-1){
            puerta = this.puertas[posVacio];
            return true;
        }else
        return false;
      
    }
    public boolean removePuerta(Puerta puerta){
        boolean resultado=false;
        for(int i=0; i<4 ; i++){
            if(this.puertas[i]!=null){
                if(this.puertas[i].equals(puerta)){
                    this.puertas[i]=null;
                    resultado= true;
                }
            }
        }
      return false;
    }
    public Puerta[] getPuerta(){
      return this.puertas;
    }
    public boolean replacePuerta(Puerta puerta, Puerta nuevaPuerta){
        boolean resultado=false;
       for(int i=0; i<4; i++){
           if(this.puertas[i]!=null){
               if(this.puertas[i]== puerta){
                   this.puertas[i]=nuevaPuerta;
                   resultado=true;
               }
           }
       }
      return false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
    
    
}

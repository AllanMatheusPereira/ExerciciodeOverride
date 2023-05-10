/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exerciciooverride;
/**
 *
 * @author allan
 */
public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O Gato miou.");
    }
    @Override
    public void mover(){
        System.err.println("O Gato se moveu.");
        
    }
}

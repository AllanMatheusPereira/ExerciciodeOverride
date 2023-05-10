/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exerciciooverride;
/**
 *
 * @author allan
 */
public class Cachorro extends Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("O Cachorro latiu.");
    }
    @Override
    public void mover(){
        System.err.println("O Cachorro se moveu.");
    }
}
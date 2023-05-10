/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.exerciciooverride;

/**
 *
 * @author allan
 */
public class ExercicioOverride {
    public static void main(String[] args) {
        
        
        Animal animal;
        animal = new Cachorro();
        animal.emitirSom();
        animal.mover();
        animal = new Gato();
        animal.emitirSom();
        animal.mover();
    }
}

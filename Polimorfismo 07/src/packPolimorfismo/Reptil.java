/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packPolimorfismo;

/**
 *
 * @author anton
 */
public class Reptil extends Animal{
    //Atributos
    private int numeroEscamas;
    
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Reptil andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    public int getNumeroEscamas() {
        return numeroEscamas;
    }

    public void setNumeroEscamas(int numeroEscamas) {
        this.numeroEscamas = numeroEscamas;
    }
    
    
}

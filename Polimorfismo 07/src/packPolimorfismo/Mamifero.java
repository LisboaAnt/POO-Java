/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packPolimorfismo;

/**
 *
 * @author anton
 */
public class Mamifero extends Animal{
    //atributos
    private String corPelo;
    
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Locomovendo como mamifero");

    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    

}

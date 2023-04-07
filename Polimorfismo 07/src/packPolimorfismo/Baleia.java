/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packPolimorfismo;

/**
 *
 * @author anton
 */
public class Baleia extends Mamifero{
    //Atributos
    private float PesoBaleia;
    private float peso;
    //Métodos
    
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }


    public void setPes(float peso, int a) {
    throw new UnsupportedOperationException("Não é permitido alterar o peso do cachorro diretamente");
    }
    

    public void setPes(float b) {
    throw new UnsupportedOperationException("Não é permitido alterar o peso do cachorro diretamente");
    }

    
    public float getPesoBaleia() {
        return PesoBaleia;
    }

    public void setPesoBaleia(float PesoBaleia) {
        this.PesoBaleia = PesoBaleia;
    }
    

}

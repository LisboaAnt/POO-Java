/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packPolimorfismo;

/**
 *
 * @author anton
 */
public class mainPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baleia b = new Baleia();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        //Animal a = new Animal(); Classes abstratas não podem ser objetos
        m.setPeso(12.2f);
        m.setIdade(42);
        m.setMembros(9);
        
        
        
        m.emitirSom();
        b.locomover();
        r.emitirSom();
        
        
    }
    
}

//Ainda na metade do curso usando interface java
package aula06;
public class Aula06 {

    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.ligarMudo(); //liga com volume = 20
        c.desligarMudo(); //desliga
        c.maisVolume();  //Volume m�ximo = 100
        c.menosVolume(); // valume m�nimo = 0 
        c.pause();
        c.play();
        c.fecharMenu();


      

        
        c.abritMenu();
        
    }
    
}

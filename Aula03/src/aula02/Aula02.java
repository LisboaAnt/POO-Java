
package aula02;


public class Aula02 {


    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC TRANSPARENTE";
        c1.cor = "Azul";
        //c1.ponta = (float)0.5;
        c1.carga = (Integer)80;
        //c1.tampada = false;
        c1.ponta((float) 15.3);
        c1.status();
        c1.rabiscar();
    }
    
}

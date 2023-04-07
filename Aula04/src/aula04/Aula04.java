package aula04;

public class Aula04 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC",0.8f,false,"Azul");
        Caneta c2 = new Caneta("KIK", 1.1f,true,"Red");
        
        System.out.println(c1.toString());
        
        System.out.println(c2.toString());
    }
    
}

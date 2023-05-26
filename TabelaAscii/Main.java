package criptagemurss;


public class Main {
    public static void main(String[] args) {
    
    Codificador code = new Codificador();
    String x = code.codificar("Ola mundo"); // soma em 3 o indice da tabela ascii
        System.out.println(x);
        
    String xx = code.descodificar(x);
        System.out.println(xx);
    }
    
}

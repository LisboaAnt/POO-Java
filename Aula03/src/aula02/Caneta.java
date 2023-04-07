
package aula02;


public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Est� tampada? "+ this.tampada);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    
    public void ponta(float valor){
        this.ponta = valor;
    }
    
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! N�o posso rabiscar, est� tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    public void tampar(){
        this.tampada = true;
        
    }
    public void destampar(){
        this.tampada = false;
        
    }
}

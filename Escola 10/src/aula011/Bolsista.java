
package aula011;



public final class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de "+ this.getNome());   
    }    
    
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade, "+this.getNome()+" É bolsista, sua bolsa é de " +this.getBolsa()+"%");
    }
    
    public void setBolsa(float x){
        bolsa = x;
    }
    
    public float getBolsa(){
        return bolsa;
    }
}

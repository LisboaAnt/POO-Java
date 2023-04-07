
package aula011;


public final class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos
    
    public void receberAumento(float aumento){
        
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Aumento de "+aumento+" o salario de" +this.getNome()+" é "+this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}

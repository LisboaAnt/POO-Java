package aula011;

public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    
    //M�todo
    
    
    public void fazerAniversario(){
        this.idade++;   
    }
    //M�todos especiais
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Dados {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}

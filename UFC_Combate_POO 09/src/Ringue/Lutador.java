
package Ringue;


public class Lutador implements Show {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    //Contruct

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    
    
    //Getters

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        
        if(this.peso >= 52.2f && this.peso <= 70.3f){
            this.categoria = "Leve";
        }else if(this.peso > 70.3f && this.peso <83.9){
            this.categoria = "Médio";
        }else if(this.peso >= 83.9f && peso <= 120.2f){
            this.categoria = "Pesado";
        }else{this.categoria = "Inválido";}
        
    }

    public void setVitorias(int vitor) {
        this.vitorias = vitor;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    //MÉTODOS ABSTRATOS
    
    
    @Override
    public void apresentar() {
        System.out.println("------------------------");
        System.out.println("CHEGOU A HORA!! O lutador "+ this.getNome()+" está destuindo os adversários!!");
        System.out.println("Diretamente de "+ this.getNacionalidade()+ " e com " + this.getIdade()+" de idade" + " Pesando " +this.getPeso()+"Kg "+"Com " +this.getVitorias()+" vitorias, "+this.getEmpates()+" empates e " +this.getDerrotas()+" Derrotas!!!");
    }

    @Override
    public void status() {
        System.out.println("====STATUS====");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("É um peso: " + this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    
    
}

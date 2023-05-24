package fazendinha_feliz;

public class Bovino {
    private int id;
    private int peso;
    private boolean vacaParida;

    public Bovino(int id, int peso,boolean vacaParida) {
        this.id = id;
        this.peso = peso;
        this.vacaParida = vacaParida;
    }

    //get

    public int getId() {
        return id;
    }
    public float getPeso(){
        return peso;
    }

    public boolean isVacaParida() {
        return vacaParida;
    }
    
    
    
    @Override
    public String toString() {
        return "Bovino{" + "id=" + id + ", peso=" + peso +'}';
    }
    
    
}



public class Bateria extends Objetocomum {

    public Bateria(String descricao, int energia) {
        this.setDescricao(descricao);
        if(energia > 0){this.setEnergia(energia);}else{ System.err.print("ERNERGIA DA BATERIA NÃO PODE SER NEGATIVA");} 
    }
}

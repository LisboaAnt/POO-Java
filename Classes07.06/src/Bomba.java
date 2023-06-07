
public class Bomba extends Objetocomum{
     public Bomba(String descricao, int energia) {
        this.setDescricao(descricao);
        if(energia < 0){this.setEnergia(energia);}else{ System.err.print("ERNERGIA DA BOMBA NÃO PODE SER POSITIVA");} 
    }
}

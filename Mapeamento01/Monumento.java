package mapeamento01;


public class Monumento {
    public localizacao loc;
    public String nome;
    
    public Monumento(float x,float y,String n){
        this.loc = new localizacao(x,y);
        this.nome = n;
    }

    @Override
    public String toString() {
        return "Monumento{" + "Latitude =" + loc.getLatitude() + ", Longitude =" + loc.getLongitude() + ", nome= " + nome + '}';
    }

    public localizacao getLoc() {
        return loc;
    }
    
    
    
}

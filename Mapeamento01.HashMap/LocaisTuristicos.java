
import java.util.*;

public class LocaisTuristicos {
    
    private String pais;
    
    HashMap <Coordenada,Local>locaisTuristicos = new HashMap();
    
    
    public void addHashMap(float x, float y, String pais, String cidade, String nome, String descricao){
        Local mon = new Local(x,y,pais,cidade,nome,descricao);
        this.locaisTuristicos.put(mon.getLoc(),mon);
        
    }
    
    public void busHasMap(float x,float y){
        Coordenada coordenada = new Coordenada(x,y); 
        if(this.locaisTuristicos.containsKey(coordenada)){
            System.out.println(this.locaisTuristicos.get(coordenada).toString());
        }else{System.out.println("Nao tem nenhuma atracao nesse ponto");}
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public HashMap<Coordenada, Local> getLocaisTuristicos() {
        return locaisTuristicos;
    }

    public void setLocaisTuristicos(HashMap<Coordenada, Local> locaisTuristicos) {
        this.locaisTuristicos = locaisTuristicos;
    }

    
}

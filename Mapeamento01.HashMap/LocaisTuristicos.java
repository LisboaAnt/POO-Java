import java.util.*;
public class LocaisTuristicos {
    private String pais;
    
    HashMap <Coordenada,Local>locaisTuristicos;
    
    public LocaisTuristicos(){
        this.locaisTuristicos = new <Coordenada,Local>HashMap();
    }
    
    public void setLocalTuristico(Local x){
        this.locaisTuristicos.put(x.getCoordenada(),x);
        
    }
    
    public Local getLocalTuristico(Local x){
        if(this.locaisTuristicos.containsKey(x.getCoordenada())){
            return this.locaisTuristicos.get(x.getCoordenada());
        }else{System.out.println("Nao tem nenhuma atracao nesse ponto");}
    return null;
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

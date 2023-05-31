package mapeamento01;
import java.util.*;

public class Monumentos {
    
    HashMap <localizacao,Monumento>hm = new HashMap();
    
    public void addHashMap(float x, float y, String n){
        Monumento mon = new Monumento(x,y,n);
        this.hm.put(mon.getLoc(),mon);
        
    }
    
    public void busHasMap(float x,float y){
        localizacao loc = new localizacao(x,y); 
        if(this.hm.containsKey(loc)){
            System.out.println(this.hm.get(loc).toString());
        }else{System.out.println("Não tem nenhuma atração nesse ponto");}
    }
}

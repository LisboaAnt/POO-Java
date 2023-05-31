package mapeamento01;

/**
 *
 * @author anton
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Monumentos mapa = new Monumentos();
        mapa.addHashMap(100, -100, "Paris");
        mapa.busHasMap(100, -100);
    }
    
}

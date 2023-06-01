
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        LocaisTuristicos mapa = new LocaisTuristicos();
        
        Local local1 = new Local(100,100,"Russia","Moskou","Jalab","Torre de areia");
        mapa.setLocalTuristico(local1);
        Local local2 = new Local(200,100,"Russia","Moskou","Jalab","Torre de areia");
        System.out.println(mapa.getLocalTuristico(local2));
        
    }
    
}

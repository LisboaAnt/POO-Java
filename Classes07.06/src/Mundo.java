
public class Mundo {
    private Objetocomum objetos[][];
    
    public void listarObjetos(){
        for (int i = 0; i < objetos.length; i++) {
        for (int j = 0; j < objetos[i].length; j++) {
        System.out.print(objetos[i][j] + " ");
        }
    System.out.println();
    }

    }

    public Objetocomum[][] getObjetos() {
        return objetos;
    }

    public void setObjetos(Objetocomum[][] objetos) {
        this.objetos = objetos;
    }
    
    
    
}

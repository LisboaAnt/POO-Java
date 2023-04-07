//Implementação de interfaces, ecapsulamento, herança, polimorfismo de sobreposição
package projetoyoutube;

/**
 *
 * @author anton
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula de php");
        v[1] = new Video("Gampley God Of War 5");
        v[2] = new Video("Assassin's creed gampley brksEDU");
        
        
        Usuario g[] = new Usuario[2];
        g[0] = new Usuario("Lisboa",20,"M","Alpha");
        g[1] = new Usuario("Elisabeht", 45,"F","Eli");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[0]);
        vis[1] = new Visualizacao(g[0],v[0]);
        vis[0] = new Visualizacao(g[0],v[1]);

        vis[0].avaliar();
        vis[1].avaliar(87f);
        
        System.out.println(vis[0].toString());
        
        System.out.println("------------USUARIOS---------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("---------VIDEOS---------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
    }
    
}

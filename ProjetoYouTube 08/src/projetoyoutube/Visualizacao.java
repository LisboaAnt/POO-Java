/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author anton
 */
public class Visualizacao {
    //Atributos
    
    private Usuario espectador;
    private Video filme;
    

    
    
    //Métodos especiais

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    //Metodos
    public void avaliar(){
        this.filme.setAvaliacao(50);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);

    }
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 30;
        }else if(porc <= 50){
            tot = 50;
        }else if(porc <= 90){
            tot = 80;
        }else{
            tot = 100;
        }
        
        this.filme.setAvaliacao(tot);
    }
    
    
    
    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", \nfilme=" + filme + '}';
    }
    
    
}

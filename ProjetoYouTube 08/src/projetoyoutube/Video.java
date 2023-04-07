/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author anton
 */
public class Video implements AcoesVideo{
    //Atributos
    private String titulo;
    private int avaliacao;
    private long views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.avaliacao = -1;
    }
    
    
    
    
    //Métodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        if(this.avaliacao == -1){
            this.avaliacao = avaliacao;
        }else{
        int nova = (int)((this.avaliacao + avaliacao)/2);
        this.avaliacao = nova;
        }
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //Interface
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);

    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);

    }
    
    private int testeLogico(){
        if(avaliacao == -1){
        return 0;
        }else{
            return avaliacao;
        }
    }
    
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + testeLogico() + "%, views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
}

package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
   //Métodos Especiais
    
    public ControleRemoto(){
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }
    
    //getters

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() { //Get só pela didatica do curso, o certo é is
        return ligado;
    }

    private boolean getTocando() { //Get só pela didatica do curso, o certo é is
        return tocando;
    }
    
    //setters

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(20);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        
        this.setVolume(0);
        
    }

    @Override
    public void abritMenu() {
        System.out.println("====MENU====");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        System.out.print("{");
        for (int i = 0; i <= this.getVolume(); i+=5){
            System.out.print("|");}
                System.out.print("}");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() <=98){
            this.setVolume(this.getVolume()+ 2);
        }else{
            System.out.println("Erro no volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume()>= 2){
            this.setVolume(this.getVolume()- 2);
        }else{
            System.out.println("Erro no volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(20);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && (this.getTocando() == false)){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando() == true){
            this.setTocando(false);
        }
    }
    
}

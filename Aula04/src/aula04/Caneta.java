
package aula04;


public final class Caneta {
    private String modelo;
    private float ponta; 
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.setTampada(tampada);
        this.setCor(cor);
    }

    

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", ponta=" + ponta + ", tampada=" + tampada + ", cor=" + cor + '}';
    }
    
    
}

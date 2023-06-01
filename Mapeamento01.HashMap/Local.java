public class Local {
    private Coordenada coordenada;
    private String nome;
    private String cidade;
    private String pais;
    private String descricao;
    
    
    public Local(float x, float y, String pais, String cidade, String nome, String descricao) {
        this.descricao = descricao;
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.coordenada = new Coordenada((float)x, (float)y); // Passando os valores de latitude e longitude ao construtor
    }
    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Local{" + "coordenada=" + coordenada.getLatitude()+";"+coordenada.getLongitude() + ", nome=" + nome + ", cidade=" + cidade + ", pais=" + pais + ", descricao=" + descricao + '}';
    }
    
    
}

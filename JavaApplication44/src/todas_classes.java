import java.util.*;
class LocaisTuristicos {
    private String pais;
    
    HashMap <Coordenada,Local>locaisTuristicos;
    
    public LocaisTuristicos(){
        this.locaisTuristicos = new <Coordenada,Local>HashMap();
    }
    
    public void setLocalTuristico(Local x){
        this.locaisTuristicos.put(x.getCoordenada(),x);
        
    }
    
    public Local getLocalTuristico(Local x){
        if(this.locaisTuristicos.containsKey(x.getCoordenada())){
            return this.locaisTuristicos.get(x.getCoordenada());
        }else{System.out.println("Nao tem nenhuma atracao nesse ponto");}
    return null;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public HashMap<Coordenada, Local> getLocaisTuristicos() {
        return locaisTuristicos;
    }

    public void setLocaisTuristicos(HashMap<Coordenada, Local> locaisTuristicos) {
        this.locaisTuristicos = locaisTuristicos;
    }
}



class Coordenada {
    
    private float latitude;
    private float longitude;

    public Coordenada() {
    }
    
    
    public Coordenada(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    



    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Coordenada other = (Coordenada) obj;
        return Float.compare(other.latitude, latitude) == 0 &&
                Float.compare(other.longitude, longitude) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}


class Local {
    private Coordenada coordenada;
    private String nome;
    private String cidade;
    private String pais;
    private String descricao;
    
    public Local(){}
    
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

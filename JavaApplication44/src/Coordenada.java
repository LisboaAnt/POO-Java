import java.util.*;
public class Coordenada {
    
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

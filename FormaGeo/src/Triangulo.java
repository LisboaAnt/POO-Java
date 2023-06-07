
public class Triangulo extends FormaGeometrica {
    private float lado1;
    private float lado2;
    private float lado3;
    
    public float area(){
        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
                if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                float p = (perimetro())/2;
                float area = (float)Math.sqrt(p*(p - lado1)*(p-lado2)*(p-lado3));
                return area;
            }
        }
        return 0;
    }
    
    public float perimetro(){
        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
                if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                float perimetr = lado1+lado2+lado3;
                return perimetr;
            }
        }
    return 0;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
    
    
}

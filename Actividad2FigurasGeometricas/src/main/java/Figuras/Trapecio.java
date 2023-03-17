package Figuras;
public class Trapecio {
    int base1, base2, altura, lado1, lado2;
    
    public Trapecio(int base1, int base2, int altura, int lado1, int lado2) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;   
    }
    
    double calcularArea(){
        return ((base1 + base2)/2)*altura;
    }
    double calcularPerimetro(){
        return(base1 + base1 + lado1 + lado2);
        
    }
}

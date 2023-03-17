package Figuras;
public class Rombo {
    int lado, diagonalmayor, diagonalmenor;
    
    public Rombo(int lado, int diagonalmayor, int diagonalmenor){
        this.lado = lado;
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
    }
    
    double calcularArea(){
        return (diagonalmayor * diagonalmenor / 2);      
    }
    
    double calcularPerimetro(){
        return (lado * 4);
    }
        
    
}

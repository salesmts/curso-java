package classe;

public class AreaCirc {
    
    double raio;
    static final double PI = 3.14; // Tornando a variável associada à classe, e não mais às instâncias.

    AreaCirc(double raioInicial) {
        
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}

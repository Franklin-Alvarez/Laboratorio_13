package Proyecto13;

public class CalculadoraR {
    
    double sumar(double n1,double n2) {
        double s;
        s = n1 + n2;
        return s;
    }
    
    double restar(double n1,double n2) {
        double r;
        r = n1 - n2;
        return r;
    }
    
    double multiplicar(double n1,double n2) {
        double m;
        m = n1 * n2;
        return m;
    }
    
    double dividir(double n1,double n2) {
        double d;
        d = n1 / n2;
        return d;
    }
    
    void mostrarResultado(double s,double r, double m,double d) {
        System.out.println("La suma es: " + s);
        System.out.println("La resta es: " + r);
        System.out.println("La multiplicacion es: " + m);
        System.out.println("La division es: "+ d);
                
    }
}

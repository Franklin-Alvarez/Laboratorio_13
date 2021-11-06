package Proyecto13;

public class Calculadora {

    int s,r,m,d;
    
    void sumar(int n1,int n2){
        s = n1 + n2;
    }
    
    void restar(int n1,int n2){
        r = n1 - n2;
    }
    
    void multiplicar(int n1,int n2){
        m = n1 * n2;
    }
    
    void dividir(int n1,int n2){
        d = n1 / n2;
    }
    
    void mostrarResultado(int n1,int n2) {
        System.out.println(n1 + " + " + n2 + " = " + s);
        System.out.println(n1 + " - " + n2 + " = " + r);
        System.out.println(n1 + " * " + n2 + " = " + m);
        System.out.println(n1 + " / " + n2 + " = " + d);

    }
}

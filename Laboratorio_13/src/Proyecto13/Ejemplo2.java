package Proyecto13;
import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double n1,n2,s,r,m;
        double d;
        System.out.println("Ingrese el primer número: ");
        n1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        n2 = sc.nextInt();
        
        CalculadoraR c = new CalculadoraR();
        s = c.sumar(n1, n2);
        r = c.restar(n1, n2);
        m = c.multiplicar(n1, n2);
        d = c.dividir(n1, n2);
        c.mostrarResultado(s, r, m, d);
    }
    
}

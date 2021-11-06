package Proyecto13;
import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1,n2;
        
        System.out.println("Ingrese el primer número: ");
        n1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        n2 = sc.nextInt();
        
        Calculadora c = new Calculadora();
        
        c.sumar(n1, n2);
        c.restar(n1, n2);
        c.multiplicar(n1, n2);
        c.dividir(n1, n2);
        c.mostrarResultado(n1, n2);
    }
    
}

package Proyecto13.Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sumc,pc,tc,uc,N;
        
        System.out.println("Ingrese un número de 5 cifras: ");
        N = sc.nextInt();
        
        SumadeCifras s = new SumadeCifras();
        
        pc = s.primeraCifra(N);
        tc = s.terceraCifra(N);
        uc = s.ultimaCifra(N);
        sumc = s.sumadeCifras(pc, tc, uc);
        
        s.mostrarResultado(N, pc, tc, uc, sumc);
    }
    
}

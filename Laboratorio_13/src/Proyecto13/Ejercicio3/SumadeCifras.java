package Proyecto13.Ejercicio3;

public class SumadeCifras {

    int primeraCifra(int N){
        int pc;
        pc = N / 10000;
        return pc;
    }
    
    int terceraCifra(int N){
        int tc;
        tc = (N / 100) - (N / 1000) * 10;
        return tc;
    }
    
    int ultimaCifra(int N){
        int uc;
        uc = N % 10;
        return uc;
    }
    
    int sumadeCifras(int pc,int tc,int uc){
        int sumc;
        sumc = pc + tc + uc;
        return sumc;
    }
    
    void mostrarResultado(int N,int pc,int tc,int uc,int sumc){
        System.out.println("");
        System.out.println("Número : " + N);
        System.out.println("Suma   :" + pc + " + " + tc + " + " + uc + " = " + sumc);
    }
}

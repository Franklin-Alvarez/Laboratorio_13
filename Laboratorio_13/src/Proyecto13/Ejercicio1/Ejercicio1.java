package Proyecto13.Ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int h,fal,preg = 1;
        double sb,des,sn,tar;
        String ape,mes;
        
        Scanner sc = new Scanner(System.in);
        
        while(preg == 1){
            System.out.println("Ingresar el apellido del trabajador: ");
            ape = sc.next();
            System.out.println("Ingresar el mes: ");
            mes = sc.next();
            System.out.println("Ingrese las horas trabajadas: ");
            h = sc.nextInt();
            System.out.println("Ingrese la tarifa: ");
            tar = sc.nextDouble();
            System.out.println("Ingrese número de faltas: ");
            fal = sc.nextInt();

            Empleado e = new Empleado();

            sb = e.calcularPagoBruto(h, tar);
            des = e.calcularDescuento(fal);
            sn = e.calcularPagoNeto(sb, des);
            e.imprimirBoletadePago(ape, mes, sb, des, sn);
            
            System.out.println("¿Desea ingresar el pago de otro trabajador? [1]SI o [2]NO");
            preg = sc.nextInt();
        }
    }
    
}

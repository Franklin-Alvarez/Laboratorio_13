package Proyecto13.Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int rubro,costo,preg = 1;
        String nom;
        double mdes,des = 0,mimp,imp = 0,pf;
        boolean bd = true;
        
        while (preg == 1){
            
            System.out.println("Ingrese el nombre del cliente: ");
            nom = sc.nextLine();
            System.out.println("");
            
            System.out.println("Ingrese un costo de compra (mayor o igual a 100): ");
            costo = sc.nextInt();
            System.out.println("");
            
            if (costo >= 501){
                des = 0.10;
                bd = true;
            }
            else if (costo >= 251){
                des = 0.05;
                bd = true;
            }
            else if (costo >= 100){
                des = 0.03;
                bd = true;
            }
            else {
                System.out.println("¡¡¡INGRESE UN MONTO DE COMPRA VÁLIDO!!!");
                bd = false;
            }
            
            if (bd == true){
                System.out.println("Ingrese el rubro: [1]COMESTIBLES o [2]ARTEFACTOS");
                rubro = sc.nextInt();
                System.out.println("");

                if (rubro == 1)
                    imp = 0.15;
                else if (rubro == 2)
                    imp = 0.30;
                else {
                    System.out.println("¡¡¡INGRESE UN RUBRO VÁLIDO!!!");
                    bd = false;
                }

                if (bd == true){

                    SuperMercado s = new SuperMercado();

                    mdes = s.calculoMontodeDescuento(des, costo);
                    mimp = s.calculoMontoImpuesto(imp, costo);
                    pf   = s.calculoPagoFinal(mimp, mdes, costo);
                    s.imprimirBoleta(nom, mimp, mdes, pf, costo);   
                    System.out.println("");

                    System.out.println("¿Desea ingresar otra venta? [1]SI o [2}NO");
                    preg = sc.nextInt();
                    sc.nextLine();//Para corregir el bug del nextLine

                }

                System.out.println("");
                
            }
            if (bd == false)
                sc.nextLine();//Para corregir el bug del nextLine
        }
        
        System.out.println("Fin del día!!!");
            
    }
    
}

package Proyecto13.Ejercicio1;

public class Empleado {
    
    double calcularPagoBruto(int h,double tar){
        double sb;
        sb = h * tar;
        return sb;
    }
    
    double calcularDescuento(int fal){
        double des;
        des = fal * 12.3;
        return des;
    }
    
    double calcularPagoNeto(double sb,double des){
        double sn;
        sn = sb - des;
        return sn;
    }
    
    void imprimirBoletadePago(String ape,String mes,double sb,double des,double sn){
        System.out.print("******Boleta de Pago******\n");
        System.out.print("Trabajador  : " + ape + "\n");
        System.out.print("Mes         : " + mes + "\n");
        System.out.print("Sueldo Bruto: S/" + sb  + "\n");
        System.out.print("Descuento   : S/" + des + "\n");
        System.out.print("--------------------------\n");
        System.out.print("Sueldo Neto : S/" + sn  + "\n");
        System.out.print("**************************\n");
    }
}

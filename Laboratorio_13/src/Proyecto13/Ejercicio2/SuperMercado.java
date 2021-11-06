package Proyecto13.Ejercicio2;

public class SuperMercado {
    
    double calculoMontodeDescuento(double des,int costo){
        double mdes;
        mdes = des * costo;
        return mdes;
    }
    
    double calculoMontoImpuesto(double imp,int costo){
        double mimp;
        mimp = imp * costo;
        return mimp;
    }
    double calculoPagoFinal(double mimp, double mdes,int costo){
        double pf;
        pf = costo + mimp - mdes;
        return pf;
    }
    
    void imprimirBoleta(String nom,double mimp,double mdes,double pf,int costo){
        System.out.println("***********BOLETA*************");
        System.out.println("Cliente     : " + nom);
        System.out.println("Monto       : S/" + costo);
        System.out.println("Impuesto    : S/" + mimp);
        System.out.println("Descuento   : S/" + mdes);
        System.out.println("------------------------");
        System.out.println("Monto Final : S/" + pf);
        System.out.println("******************************");
    }
}

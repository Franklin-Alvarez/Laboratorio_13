package Proyecto13.Ejercicio4;

public class ClubelBosque {

    double incrementoComida(double pm){
        double micrmC;
        micrmC = 0.05 * pm;
        return micrmC;
    }
    
    double incrementoSauna(double pm){
        double micrmS;
        micrmS = 0.07 * pm;
        return micrmS;
    }
    
    double incrementoHospedaje(double pm){
        double micrmH;
        micrmH = 0.09 * pm;
        return micrmH;
    }
    
    double pagoTotal(double micrmC, double micrmS, double micrmH,double pm){
        double pT;
        pT = pm + micrmC + micrmS + micrmH;
        return pT;
    }
    
    void mostrarBoletaMensual(String nom,double pm,double micrmC, double micrmS, double micrmH,double pT){
        System.out.println("**************BOLETA**************");
        System.out.println("Socio      : " + nom);
        System.out.println("Pago Mensual      : S/" + pm);
        System.out.println("Uso del Comedor   : S/" + micrmC);
        System.out.println("Uso del Sauna     : S/" + micrmS);
        System.out.println("Uso del Hospedaje : S/" + micrmH);
        System.out.println("----------------------------------");
        System.out.println("Pago Total : S/" + pT);
        System.out.println("**********************************");
        
    }
    
}

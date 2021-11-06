package Proyecto13.Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClubelBosque m = new ClubelBosque();
        
        String nom;
        double pm = 1000,micrmC = 0,micrmS = 0,micrmH = 0,pT;
        int preg,op = 1;
        boolean bd = false;
        
        while(op == 1){
            System.out.println("Ingrese el nombre del socio: ");
            nom = sc.nextLine();

            

            while(bd == false){
                System.out.println("¿El socio uso el servicio de COMIDA? [1]SI o [2]NO");
                preg = sc.nextInt();
                switch(preg) {
                    case 1: {
                        micrmC = m.incrementoComida(pm);
                        bd = true;
                    } break;
                    case 2: {
                        micrmC = 0;
                        bd = true;
                    } break;
                    default: {
                        System.out.println("¡¡¡Ingrese una respuesta correcta!!!");
                        bd = false;
                    }
                }
            }
            
            

            while(bd == true){
                System.out.println("¿El socio uso el servicio de SAUNA? [1]SI o [2]NO");
                preg = sc.nextInt();
                switch(preg) {
                    case 1: {
                        micrmS = m.incrementoSauna(pm);
                        bd = false;
                    }  break;
                    case 2:{
                        micrmS = 0;
                        bd = false;
                    } break;
                    default:{
                        System.out.println("¡¡¡Ingrese una respuesta correcta!!!");
                        bd = true;
                    }
                }
            }
            

            while(bd == false){
                System.out.println("¿El socio uso el servicio de HOSPEDAJE? [1]SI o [2]NO");
                preg = sc.nextInt();
                switch(preg) {
                    case 1: {
                        micrmH = m.incrementoHospedaje(pm);
                        bd = true;
                    } break;
                    case 2:{
                        micrmH = 0;
                        bd = true;
                    } break;
                    default:{
                        System.out.println("¡¡¡Ingrese una respuesta correcta!!!");
                        bd = false;
                    }
                }
            }
            bd = false;
            
            pT = m.pagoTotal(micrmC, micrmS, micrmH,pm);

            m.mostrarBoletaMensual(nom, pm, micrmC, micrmS, micrmH, pT);
            
            System.out.println("¿Desea ingresar otro pago? [1]SI o [2]NO");
            op = sc.nextInt();
            sc.nextLine();//Para corregir el bug del nextLine
        }
        
        System.out.println("Fin del Día!!!");
    }
    
}

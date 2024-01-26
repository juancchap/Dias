
package dias;
import java.util.Scanner;

public class Dias {

    public static void main(String[] args) {
       Scanner  entrada= new Scanner(System.in);
       int Horastotales,semanas,dias,horas;
        System.out.println("Digite un numero de horas");
        Horastotales=entrada.nextInt();
        semanas=Horastotales/168;
        dias =Horastotales%168/24;
        horas=Horastotales%24;
        System.out.println("El equivalente es :");
        System.out.println("Semanas "+semanas); 
        System.out.println("Dias "+dias);
        System.out.println("Horas "+ horas);
       
    }
    
}

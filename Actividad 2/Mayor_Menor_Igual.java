import java.util.Scanner;

public class Mayor_Menor_Igual {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double A, B;
        
        System.out.println("Ingrese el valor de A:");
        A = leer.nextDouble();
        
        System.out.println("Ingrese el valor de B:");
        B = leer.nextDouble();
        
        if (A > B) {
            System.out.println("A es mayor que B");
            }
        else if (A < B) {
            System.out.println("A es menor que B");
        }
        else {
            System.out.println("A es igual a B");
        }                
    }
}

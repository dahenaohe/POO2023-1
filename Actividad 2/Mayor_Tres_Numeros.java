

import java.util.Scanner;

public class Mayor_Tres_Numeros {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3, mayor;
        
        System.out.println("Ingrese el primer número:");
        n1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        n2 = leer.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        n3 = leer.nextInt();
              
        if (n1 > n2 && n1 > n3) {
            mayor = n1;
            }
        else if (n2 > n3) {
            mayor = n2;
            }
        else {
            mayor = n3;
            }
        
        System.out.println("El valor mayor entre "+n1+", "+n2+" y "+n3+" es "+mayor);        
    }
}

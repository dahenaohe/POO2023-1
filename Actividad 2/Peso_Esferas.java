

import java.util.Scanner;

public class Peso_Esferas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double esfera_a, esfera_b, esfera_c, esfera_d;
        
        System.out.println("Ingrese el peso de la esfera A:");
        esfera_a = leer.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera B:");
        esfera_b = leer.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera C:");
        esfera_c = leer.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera D:");
        esfera_d = leer.nextDouble();
        
        if (esfera_a == esfera_b && esfera_a == esfera_c) {
            if (esfera_d > esfera_a) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
                }
            else {
                System.out.println("La esfera D es la diferente y es de menor peso");
                }
            }
        
        else if (esfera_a == esfera_b && esfera_a == esfera_d) {
            if (esfera_c > esfera_a) {
                System.out.println("La esfera C es la diferente y es de mayor peso");
                }
            else {
                System.out.println("La esfera C es la diferente y es de menor peso");
                }
            }
        
        else if (esfera_a == esfera_c && esfera_a == esfera_d) {
            if (esfera_b > esfera_a) {
                System.out.println("La esfera B es la diferente y es de mayor peso");
                }
            else {
                System.out.println("La esfera B es la diferente y es de menor peso");
                }
            }
        
        else {
            if (esfera_a > esfera_b) {
                System.out.println("La esfera A es la diferente y es de mayor peso");
                }
            else {
                System.out.println("La esfera A es la diferente y es de menor peso");
                }
            }
    }    
}

import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String[] args){
        double r, a, l;

        System.out.println("Ingrese el radio del circulo:");
        Scanner entrada = new Scanner(System.in);
        r = entrada.nextDouble();

        a = Math.PI * Math.pow(r, 2);
        l = 2 * Math.PI * r;

        System.out.println("El área del circulo es: " + Math.round(a));
        System.out.println("El perímetro del circulo es: " + Math.round(l));
    }
}

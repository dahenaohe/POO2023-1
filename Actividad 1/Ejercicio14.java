import java.util.Scanner;
public class Ejercicio14 {

    public static void main (String[] args) {

        int n;
        double cubo, cuadrado;
        System.out.println("Ingrese el número:");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();

        cubo = Math.pow(n, 3);
        cuadrado = Math.pow(n, 2);

        System.out.println("El cubo del número es: " + Math.round(cubo));
        System.out.println("El cuadrado del número es : " + Math.round(cuadrado));

    }
    
}

//how do i round a number inside a print in Java?
//https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java





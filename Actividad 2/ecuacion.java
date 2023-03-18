import java.util.Scanner;
public class ecuacion {

    public static void main(String[] args){

        double a,b,c, discriminante, sol1, sol2, raiz;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese A:");
        a = sc.nextDouble();

        System.out.println("Ingrese B:");
        b = sc.nextDouble();

        System.out.println("Ingrese C:");
        c = sc.nextDouble();

        discriminante = b*b - 4*a*c;

        if (discriminante>0) {

            sol1 = (-b + Math.sqrt(discriminante)) / (2*a);
            sol2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("Las soluciones son " + sol1 + " y " + sol2);
        }
        else if (discriminante == 0) {
            raiz = -b / (2*a);
            System.out.println("La solución es " + raiz);
        }
    }
}

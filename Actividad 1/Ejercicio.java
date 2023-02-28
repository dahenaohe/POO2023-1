import java.util.Scanner;
public class Ejercicio {

    public static void main (String[] args){
        int age_juan, age_ana, age_alber, age_mama;

        System.out.println("Ingrese la edad de Juan");
        Scanner entrada = new Scanner(System.in);
        age_juan = entrada.nextInt();

        age_alber = 2 * (age_juan/3);
        age_ana = 4 * (age_juan/3);
        age_mama = age_juan + age_alber + age_ana;

        System.out.println("Las edades son: ");
        System.out.println("Juan: " + age_juan);
        System.out.println("Alberto: " + age_alber);
        System.out.println("Ana: " + age_ana);
        System.out.println("Mamá: " + age_mama);


    }
}
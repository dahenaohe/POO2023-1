import java.util.Scanner;

public class Pago_Matricula_Estudiante {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double numero_inscripcion, patrimonio, estrato, pago_matricula=50000;
        String nombre;
        
        System.out.println("Ingrese el número de inscripción del estudiante:");
        numero_inscripcion = leer.nextDouble();
        
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese el patrimonio del estudiante:");
        patrimonio = leer.nextDouble();
        
        System.out.println("Ingrese el estrato del estudiante::");
        estrato = leer.nextDouble();
        
        if (patrimonio > 2000000 && estrato > 3) {
            pago_matricula =+(0.03*patrimonio);
        }
        
        System.out.println("El estudiante con número de inscripción "+numero_inscripcion+" y nombre "+nombre+" debe pagar $"+pago_matricula);
    }
}
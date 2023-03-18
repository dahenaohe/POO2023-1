package poo.actividad.pkg2;

import java.util.Scanner;

public class Nombre_Salario {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int valor_hora, horas_trabajadas, salario;
        
        System.out.println("Ingrese el nombre del empleado:");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese el salario básico por hora:");
        valor_hora = leer.nextInt();
        
        System.out.println("Ingrese el número de horas trabajadas:");
        horas_trabajadas = leer.nextInt();
        
        salario = valor_hora * horas_trabajadas;
        
        if (salario > 450000) {
            System.out.println("Nombre: "+nombre);
            System.out.println("Salario mensual: $"+salario);
            }
        else {
            System.out.println("Nombre: "+nombre);
            }
    }
}

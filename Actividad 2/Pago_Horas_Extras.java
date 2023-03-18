package poo.actividad.pkg2;

import java.util.Scanner;

public class Pago_Horas_Extras {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int horas_trabajadas, valor_hora, horas_extra, horas_extra_excedentes, salario;
        
        System.out. println("Ingrese el nombre del trabajador:");
        nombre = leer.nextLine();
        
        System.out. println("Ingrese la cantidad de horas trabajadas:");
        horas_trabajadas = leer.nextInt();
        
        System.out. println("Ingrese el valor de una hora:");
        valor_hora = leer.nextInt();
        
        if (horas_trabajadas > 40) {
            horas_extra = horas_trabajadas - 40;
            
            if (horas_extra > 8) {
                horas_extra_excedentes = horas_extra - 8;
                salario = 40 * valor_hora + 16 * valor_hora + horas_extra_excedentes * 3 * valor_hora;
                }
            else {
                salario = 40 * valor_hora + horas_extra * 2 * valor_hora;
                }
            
            }
        else {
            salario = horas_trabajadas * valor_hora;
            }
        
        System.out.println("El trabajador "+nombre+" devengó $"+salario);
    }
}

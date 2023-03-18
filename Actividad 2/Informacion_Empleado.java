

import java.util.Scanner;

public class Informacion_Empleado {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int codigo, horas_trabajadas, valor_hora;
        double porcentaje_retencion, salario_bruto, retencion_fuente, salario_neto;
        
        System.out.println("Ingrese su nombre completo:");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese su código de empleado:");
        codigo = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de horas trabajadas:");
        horas_trabajadas = leer.nextInt();
        
        System.out.println("Ingrese el valor de las horas trabajadas:");
        valor_hora = leer.nextInt();
        
        System.out.println("Ingrese el porcentaje de retención de la fuente:");
        porcentaje_retencion = leer.nextDouble();
        
        salario_bruto = horas_trabajadas*valor_hora;
        retencion_fuente = salario_bruto*(porcentaje_retencion/100);
        salario_neto = salario_bruto-retencion_fuente;
        
        System.out.println("Código: "+codigo);
        System.out.println("Nombre: "+nombre);      
        System.out.println("Salario bruto: "+salario_bruto);      
        System.out.println("Salario neto: "+salario_neto);      
    }
}

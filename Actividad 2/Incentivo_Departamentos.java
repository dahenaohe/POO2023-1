package poo.actividad.pkg2;

import java.util.Scanner;

public class Incentivo_Departamentos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double ventas1, ventas2, ventas3, salario_basico, ventas_totales, porcentaje_ventas, salario1, salario2, salario3;
        
        System.out.println("Ingrese las ventas del departamento 1:");
        ventas1 = leer.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 2:");
        ventas2 = leer.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 3:");
        ventas3 = leer.nextDouble();
        
        System.out.println("Ingrese el salario básico de los departamentos:");
        salario_basico = leer.nextDouble();
        
        ventas_totales = ventas1 + ventas2 + ventas3;
        porcentaje_ventas = 0.33 * ventas_totales;
        
        if (ventas1 > porcentaje_ventas) {
            salario1 = salario_basico + 0.2 * salario_basico;
            }
        else {
            salario1 = salario_basico;
            }
        
        if (ventas2 > porcentaje_ventas) {
            salario2 = salario_basico + 0.2 * salario_basico;
            }
        else {
            salario2 = salario_basico;
            }
        
        if (ventas3 > porcentaje_ventas) {
            salario3 = salario_basico + 0.2 * salario_basico;
            }
        else {
            salario3 = salario_basico;
            }
        
        System.out.println("Salario de los vendedores del departamento 1: $"+salario1);
        System.out.println("Salario de los vendedores del departamento 2: $"+salario2);
        System.out.println("Salario de los vendedores del departamento 3: $"+salario3);
    }
}

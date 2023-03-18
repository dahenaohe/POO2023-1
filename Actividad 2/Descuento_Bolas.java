package poo.actividad.pkg2;

import java.util.Scanner;

public class Descuento_Bolas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double valor_compra, valor_pago, descuento;
        String color;
        
        System.out.println("Ingrese el valor de la compra:");
        valor_compra = leer.nextDouble();
        
        System.out.println("Ingrese el color de la bola:");
        color = leer.nextLine();
        
        if (color == "blanco") {
            descuento = 0;
            }
        else if (color == "verde") {
            descuento = 10;
            }
        else if (color == "amarillo") {
            descuento = 25;
            }
        else if (color == "azul") {
            descuento = 50;
            }
        else {
            descuento = 100;
            }
        
        valor_pago = valor_compra - descuento * valor_compra / 100;
        
        System.out.println("El cliente debe pagar $"+valor_pago);
    }    
}

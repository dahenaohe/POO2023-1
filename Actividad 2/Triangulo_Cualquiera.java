import java.util.Scanner;

public class Triangulo_Cualquiera {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double lado1, lado2, lado3, perimetro, semiperimetro, area;
        
        System.out.println("Ingrese el valor del primer lado del triángulo:");
        lado1 = leer.nextDouble();
        
        System.out.println("Ingrese el valor del segundo lado del triángulo:");
        lado2 = leer.nextDouble();
        
        System.out.println("Ingrese el valor del tercer lado del triángulo:");
        lado3 = leer.nextDouble();
        
        perimetro = lado1+lado1+lado3;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Semiperímetro: "+semiperimetro);
        System.out.println("Área: "+area);
    }
}

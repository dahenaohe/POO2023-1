import java.util.Scanner;

public class Triangulo_Equilatero {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double lado, perimetro, altura, area;
        
        System.out.println("Ingrese el valor de uno de los lados de un triángulo equilatero:");
        lado = leer.nextDouble();
        
        perimetro = lado*3;
        altura = Math.sqrt(Math.pow(lado,2)-Math.pow((lado/2),2));
        area = (lado*altura)/2;
        
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Altura: "+altura);
        System.out.println("Área: "+area);
    }
}

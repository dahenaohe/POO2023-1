import java.util.Scanner;
public class pesobolas {
    public static void main(String[] args){
    double a,b,c;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese peso de A");
    a = sc.nextDouble();
    
    System.out.println("Ingrese peso de B");
    b = sc.nextDouble();

    System.out.println("Ingrese peso de C");
    c = sc.nextDouble();

    if (a > b && a > c) {
        System.out.println("La esfera A es la más pesada");
    }
    else if (b>c){
        System.out.println("La esfera B es la más pesada");
    }
    else{
        System.out.println("La esfera C es la más pesada");
    }
} 
}

public class Ejercicio12 {
    
    public static void main (String[] args){

        int s, h, sb;
        double rf, sn;
        h = 48;
        s = 5000;
        rf = ((h*s)*12.5)/100;
        sb = h*s;
        sn = sb - rf;

        System.out.println("El salario bruto es: " + sb);
        System.out.println("El salario neto es: " + sn);
        System.out.println("El valor de la retención es: " + rf);
}
}
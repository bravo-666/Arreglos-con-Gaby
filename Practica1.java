import java.util.Scanner;

public class Practica1{

    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double b, a, r;

        System.out.println("Escribe el valor de la base: ");
        b = myScanner.nextDouble();
        System.out.println("Escribe el valor de la altura: ");
        a = myScanner.nextDouble();
        double triangulo = b * a / 2;
        
        System.out.println("El area del triangulo es: " + triangulo);

        System.out.println("Escribe el valor del radio: ");
        r = myScanner.nextDouble();
        double circulo = 3.1416 * r*r;
        System.out.println("El area del circulo es: "  + circulo);
    myScanner.close();
    } 
}
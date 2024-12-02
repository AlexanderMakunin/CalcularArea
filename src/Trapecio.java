// Trapecio.java
//package figuras;

import java.util.Scanner;

public class Trapecio {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del Trapecio menor: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Ingrese la base del Trapecio Mayor: ");
        double baseMayor = scanner.nextDouble();
        System.out.print("Ingrese la altura del Trapecio: ");
        double height = scanner.nextDouble();
        double area = baseMenor + baseMayor / 2 * height;
        System.out.println("El área del Trapecio es: " + area);
    }
}
package lab1;

import java.util.Scanner;

public class Principal {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Ingrese las coordenadas del Rectangulo A");
 
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
 
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
 
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
 
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
 
        Coordenadas c1 = new Coordenadas(x1, y1);
        Coordenadas c2 = new Coordenadas(x2, y2);
 
        Rectangulo r1 = new Rectangulo(c1, c2);
 
 
        System.out.println("\nIngrese las coordenadas del Rectangulo B");
 
        System.out.print("x1: ");
        double x3 = sc.nextDouble();
 
        System.out.print("y1: ");
        double y3 = sc.nextDouble();
 
        System.out.print("x2: ");
        double x4 = sc.nextDouble();
 
        System.out.print("y2: ");
        double y4 = sc.nextDouble();
 
        Coordenadas c3 = new Coordenadas(x3, y3);
        Coordenadas c4 = new Coordenadas(x4, y4);
 
        Rectangulo r2 = new Rectangulo(c3, c4);
 
 
        System.out.println("\nRectangulo A: " + r1);
        System.out.println("Rectangulo B: " + r2);
 
 
        if (Verificador.esSobrePos(r1, r2)) {
            System.out.println("Los rectángulos se sobreponen.");
        }
        else if (Verificador.esJunto(r1, r2)) {
            System.out.println("Los rectángulos están juntos.");
        }
        else if (Verificador.esDisjunto(r1, r2)) {
            System.out.println("Los rectángulos son disjuntos.");
        }
 
        sc.close();
    }
}


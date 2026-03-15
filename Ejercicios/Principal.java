package lab1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número máximo de rectángulos: ");
        int n = sc.nextInt();

        ContainerRect contenedor = new ContainerRect(n);

        for (int i = 0; i < n; i++) {

            System.out.println("\nRectángulo " + (i + 1));

            System.out.println("Ingrese la primera esquina:");
            Coordenada c1 = new Coordenada(sc.nextDouble(), sc.nextDouble());

            System.out.println("Ingrese la esquina opuesta:");
            Coordenada c2 = new Coordenada(sc.nextDouble(), sc.nextDouble());

            Rectangulo r = new Rectangulo(c1, c2);

            contenedor.addRectangulo(r);
        }

        System.out.println("\nContenido del contenedor:");
        System.out.println(contenedor);

        sc.close();
    }
}

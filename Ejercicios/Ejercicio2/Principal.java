package lab2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese tamaño de subregion k:");
            int k = sc.nextInt();

            Terreno t = new Terreno("datos.txt");

            t.analizarRegion(k);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

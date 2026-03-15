package lab2;

import java.io.*;
import java.util.*;

public class Terreno {

    private Zona[][] matriz;
    private int filas;
    private int columnas;

    public Terreno(String archivo) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(archivo));

        String linea = br.readLine();
        String[] partes = linea.split(" ");

        filas = Integer.parseInt(partes[0]);
        columnas = Integer.parseInt(partes[1]);

        matriz = new Zona[filas][columnas];

        int i = 0;
        int j = 0;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(" ");

            String mineral = datos[0];
            double cantidad = Double.parseDouble(datos[1]);
            double pureza = Double.parseDouble(datos[2]);

            matriz[i][j] = new Zona(mineral, cantidad, pureza);

            j++;

            if (j == columnas) {
                j = 0;
                i++;
            }
        }

        br.close();
    }

    public void analizarRegion(int k) {

        double maxValor = 0;
        int mejorFila = 0;
        int mejorCol = 0;

        for (int i = 0; i <= filas - k; i++) {
            for (int j = 0; j <= columnas - k; j++) {

                double suma = 0;

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {

                        suma += matriz[x][y].valorEconomico();
                    }
                }

                if (suma > maxValor) {
                    maxValor = suma;
                    mejorFila = i;
                    mejorCol = j;
                }
            }
        }

        System.out.println("Valor economico maximo: " + maxValor);
        System.out.println("Posicion inicial: (" + mejorFila + "," + mejorCol + ")");

        mostrarRegion(mejorFila, mejorCol, k);
    }

    private void mostrarRegion(int f, int c, int k) {

        Map<String, Integer> contador = new HashMap<>();

        System.out.println("\nZonas de la region:");

        for (int i = f; i < f + k; i++) {
            for (int j = c; j < c + k; j++) {

                Zona z = matriz[i][j];

                System.out.println("(" + i + "," + j + ") -> " + z);

                contador.put(z.getMineral(),
                        contador.getOrDefault(z.getMineral(), 0) + 1);
            }
        }

        String mineralPred = "";
        int max = 0;

        for (String m : contador.keySet()) {

            if (contador.get(m) > max) {
                max = contador.get(m);
                mineralPred = m;
            }
        }

        System.out.println("\nMineral predominante: " + mineralPred);
    }
}

package lab1;


public class ContainerRect {

    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;

    public static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
    }

    public void addRectangulo(Rectangulo r) {

        if (numRec < n) {

            rectangulos[numRec] = r;

            // calcular distancia entre esquinas
            Coordenada c1 = r.getEsquina1();
            Coordenada c2 = r.getEsquina2();

            distancias[numRec] = Coordenada.distancia(c1, c2);

            // calcular área
            areas[numRec] = r.calculoArea();

            numRec++;

        } else {
            System.out.println("No es posible guardar más rectángulos.");
        }
    }

    public String toString() {

        String texto = "Rectangulo\tCoordenadas\t\tDistancia\tArea\n";

        for (int i = 0; i < numRec; i++) {

            texto += (i + 1) + "\t(" +
                    rectangulos[i].getEsquina1() + ", " +
                    rectangulos[i].getEsquina2() + ")\t";

            texto += String.format("%.3f", distancias[i]) + "\t";
            texto += String.format("%.2f", areas[i]) + "\n";
        }

        return texto;
    }
}

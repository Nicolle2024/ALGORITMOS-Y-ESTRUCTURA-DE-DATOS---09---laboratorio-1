package lab1;

public class Principal {

    public static void main(String[] args) {

        Coordenadas c1 = new Coordenadas(1, 1);
        Coordenadas c2 = new Coordenadas(4, 4);

        Coordenadas c3 = new Coordenadas(3, 3);
        Coordenadas c4 = new Coordenadas(6, 6);

        Rectangulo r1 = new Rectangulo(c1, c2);
        Rectangulo r2 = new Rectangulo(c3, c4);

        System.out.println("Rectangulo 1: " + r1);
        System.out.println("Rectangulo 2: " + r2);

        if (Verificador.esSobrePos(r1, r2)) {
            System.out.println("Los rectángulos se sobreponen.");
        }
        else if (Verificador.esJunto(r1, r2)) {
            System.out.println("Los rectángulos están juntos.");
        }
        else if (Verificador.esDisjunto(r1, r2)) {
            System.out.println("Los rectángulos son disjuntos.");
        }
    }
}

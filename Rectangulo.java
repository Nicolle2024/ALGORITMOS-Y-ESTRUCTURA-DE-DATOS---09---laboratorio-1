package lab1;

public class Rectangulo {

    private Coordenadas esquina1;
    private Coordenadas esquina2;

    public Rectangulo(Coordenadas c1, Coordenadas c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public void setEsquina1(Coordenadas coo) {
        esquina1 = new Coordenadas(coo);
    }

    public void setEsquina2(Coordenadas coo) {
        esquina2 = new Coordenadas(coo);
    }

    public Coordenadas getEsquina1() {
        return esquina1;
    }

    public Coordenadas getEsquina2() {
        return esquina2;
    }

    public String toString() {
        return "Rectangulo: Esquina1 = " + esquina1 + ", Esquina2 = " + esquina2;
    }
}

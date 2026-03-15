package lab1;

public class Coordenadas {
    private double x;
    private double y;
    public Coordenadas() {
        this.x = 0;
        this.y = 0;
    }
    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Coordenadas(Coordenadas c) {
        this.x = c.x;
        this.y = c.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distancia(Coordenadas c) {
        double dx = this.x - c.x;
        double dy = this.y - c.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static double distancia(Coordenadas c1, Coordenadas c2) {
        double dx = c1.x - c2.x;
        double dy = c1.y - c2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


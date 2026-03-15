public class Verificador {
	 
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
 
        double r1Left = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Right = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Bottom = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double r1Top = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());
 
        double r2Left = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double r2Right = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double r2Bottom = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
        double r2Top = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());
 
        return (r1Right > r2Left && r1Left < r2Right &&
                r1Top > r2Bottom && r1Bottom < r2Top);
    }
 
    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
 
        double r1Left = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Right = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Bottom = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double r1Top = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());
 
        double r2Left = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double r2Right = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double r2Bottom = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
        double r2Top = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());
 
        return (r1Right < r2Left || r1Left > r2Right ||
                r1Top < r2Bottom || r1Bottom > r2Top);
    }
 
    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
 
        if (!esSobrePos(r1, r2) && !esDisjunto(r1, r2)) {
            return true;
        }
 
        return false;
    }
}

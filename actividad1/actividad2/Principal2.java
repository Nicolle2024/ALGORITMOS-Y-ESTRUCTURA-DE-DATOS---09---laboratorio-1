package lab1;
import java.util.Scanner;
 
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Creación de Rectángulo A 
        System.out.println("Prueba 1:");
        System.out.println("Ingrese una esquina del 1er rectángulo:");
        Coordenada a1 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        System.out.println("Ingrese la esquina opuesta del 1er rectángulo:");
        Coordenada a2 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Rectangulo A = new Rectangulo(a1, a2);
 
        // Creación de Rectángulo B
        System.out.println("Ingrese una esquina del 2do rectángulo:");
        Coordenada b1 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        System.out.println("Ingrese la esquina opuesta del 2do rectángulo:");
        Coordenada b2 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Rectangulo B = new Rectangulo(b1, b2);
 
        mostrarRectangulo("A", A);
        mostrarRectangulo("B", B);
 
        // Determinar mediante Verificador 
        if (Verificador.esSobrePos(A, B)) {
            // Sobrepuestos 
            System.out.println("Rectangulos A y B se sobreponen.");
            // Mostrar área de sobreposición 
            Rectangulo sobre = rectanguloSobre(A, B); 
            System.out.println("Area de sobreposicion = " + sobre.calculoArea()); 
        } else if (Verificador.esJunto(A, B)) {
            System.out.println("Rectangulos A y B se juntan");
        } else if (Verificador.esDisjunto(A, B)) {
        	
            System.out.println("Rectangulos A y B son separados");
        }
        sc.close();
    }
 
    // mostrar información de cualquier rectángulo 
    public static void mostrarRectangulo(String nombre, Rectangulo r) {
        System.out.println("Rectangulo " + nombre + "=" + r.toString());
    }
 
    // calcular el rectángulo de sobreposición 
    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        // Hallar los límites de la intersección
        double xIzq = Math.max(Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX()), 
                               Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX()));
        double xDer = Math.min(Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX()), 
                               Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX()));
        double yInf = Math.max(Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY()), 
                               Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY()));
        double ySup = Math.min(Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY()), 
                               Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY()));
 
        return new Rectangulo(new Coordenada(xIzq, yInf), new Coordenada(xDer, ySup));
    }
}

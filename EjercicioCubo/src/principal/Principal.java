
//calcular el volumen de un cubo

package principal;

import dominio.Cubo;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    
    static Scanner ent = new Scanner(System.in);
    static Cubo cubo = new Cubo(12, 12, 12);
    
    public static void main(String[] args) {
        int alto;
        int ancho;
        int profundo;
        System.out.println("HALLAR EL VOLUMEN DEL CUBO");
        System.out.println("================================");
        System.out.println("");
        System.out.println("");
        System.out.print("Introduzca el alto del cubo:  ");
        alto = ent.nextInt();
        System.out.print("Introduzca el ancho del cubo:  ");
        ancho = ent.nextInt();
        System.out.print("Introduzca el profundo del cubo:  ");
        profundo = ent.nextInt();
        System.out.println("");
        
        cubo.calcularVolumenCubo(alto, alto, profundo);
        cubo.calcularVolumenCubo(cubo.getAlto(), cubo.getAncho(), cubo.getProfundo());
    }
}

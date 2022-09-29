
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Cubo {
    
    private int alto;
    private int ancho;
    private int profundo;

    
    //getter and setter
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    
    //constructores
    public Cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public Cubo() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alto: ").append(alto);
        sb.append(", ancho: ").append(ancho);
        sb.append(", profundo: ").append(profundo);
        sb.append(' ');
        return sb.toString();
    }
    
    
    public void calcularVolumenCubo(int alto, int largo, int profundo){
        System.out.println("El volumen del cubo es: " +(alto*largo*profundo));
    }
    
}


package es9.esercizio9;


public class Camera {
    
    private static int numCamere = 0;
    
    private int num;
    private String tipo;
    private boolean occupata;

    public Camera(String tipo, boolean occupata) {
        this.num = numCamere;
        
        numCamere ++;
        
        this.tipo = tipo;
        this.occupata = occupata;
    }
 
    public static int getNumCamere() {
        return numCamere;
    }

    public static void setNumCamere(int numCamere) {
        Camera.numCamere = numCamere;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }

    
    
}

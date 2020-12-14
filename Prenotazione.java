
package es9.esercizio9;
import java.util.GregorianCalendar;

public class Prenotazione {
    
    private String nomeCliente;
    private String cognomeCliente;
    
    private Camera camera;
    private GregorianCalendar dataPrenotazione;
    private GregorianCalendar dataFinePrenotazione;
    

    //COSTRUTTORI
     
    public Prenotazione(String nomeCliente, String cognomeCliente, Camera camera, GregorianCalendar dataPrenotazione, GregorianCalendar dataFinePrenotazione) {
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        
        this.camera = camera;
        camera.setOccupata(true);
        
        this.dataPrenotazione = dataPrenotazione;
        this.dataFinePrenotazione = dataFinePrenotazione;
    }

    public Prenotazione(String nomeCliente, String cognomeCliente) {
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
    }
    
    public Prenotazione() {
        this.nomeCliente = "";
        this.cognomeCliente = "";
    }
    
    //GETTERS E SETTERS

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public GregorianCalendar getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(GregorianCalendar dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public GregorianCalendar getDataFinePrenotazione() {
        return dataFinePrenotazione;
    }

    public void setDataFinePrenotazione(GregorianCalendar dataFinePrenotazione) {
        this.dataFinePrenotazione = dataFinePrenotazione;
    }
    
    
    
}

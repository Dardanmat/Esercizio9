
package es9.esercizio9;
import java.util.ArrayList;


public class Albergo {
    
    private String nome;
    private ArrayList<Camera> camere;
    private ArrayList<Prenotazione> prenotazioni;

    public Albergo(String nome, ArrayList<Camera> camere, ArrayList<Prenotazione> prenotazioni) {
        this.nome = nome;
        this.camere = (ArrayList)camere.clone();
        this.prenotazioni = (ArrayList)prenotazioni.clone();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }

    public void setCamere(ArrayList<Camera> camere) {
        this.camere = camere;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }
    
    public boolean addPrenotazione(Prenotazione p){
        
        if(prenotazioni.add(p)){
            
            return true;
            
        }
        return false;
    }
    
    public boolean removePrenotazione(Prenotazione p){
        
        if(prenotazioni.remove(p)){
            
            return true;
            
        }
        return false;
    }
    
    public ArrayList<Prenotazione> listaPrenotazioniPerGiorno(int giorno, int mese, int anno){
        
        ArrayList<Prenotazione> pren = new ArrayList<>();
        
        for(int i = 0; i < prenotazioni.size(); i++){
            
            if(prenotazioni.get(i).getDataPrenotazione().get(5) == giorno && prenotazioni.get(i).getDataPrenotazione().get(2) == mese && prenotazioni.get(i).getDataPrenotazione().get(1) == anno){
                
                pren.add(prenotazioni.get(i));
                
            }
            
        }
        
        if(pren.isEmpty()) return null;
        
        return pren;
    } 
    
    public ArrayList<Camera> listaCamereLibere(){
        
        ArrayList<Camera> cam = new ArrayList<>();
        
        for(int i = 0; i < camere.size(); i++){
            
            if(camere.get(i).isOccupata() == false){
                
                cam.add(camere.get(i));
                
            }
            
        }
        if(cam.isEmpty()) return null;       
                
        return cam;
    }
    
}

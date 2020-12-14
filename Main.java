
package es9.esercizio9;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Main {
    
    public static void main(String[] args){
        
        Camera cam1 = new Camera("singola", false);
        Camera cam2 = new Camera("singola", false);
        Camera cam3 = new Camera("singola", false);
        Camera cam4 = new Camera("matrimoniale", false);
        Camera cam5 = new Camera("matrimoniale", false);
        Camera cam6 = new Camera("matrimoniale", false);
        Camera cam7 = new Camera("matrimoniale", false);
        Camera cam8 = new Camera("matrimoniale", false);
        
        GregorianCalendar data1 = new GregorianCalendar();
        GregorianCalendar data2 = new GregorianCalendar();
        
        data1.set(2021, 1, 20);
        data2.set(2021, 2, 25);
        
        GregorianCalendar data3 = new GregorianCalendar();
        GregorianCalendar data4 = new GregorianCalendar();
        
        data3.set(2021, 2, 20);
        data4.set(2021, 3, 3);
        
        GregorianCalendar data5 = new GregorianCalendar();
        GregorianCalendar data6 = new GregorianCalendar();
        
        data5.set(2021, 2, 20);
        data6.set(2021, 2, 24);
        

        Prenotazione pren1 = new Prenotazione("Gianni", "Tappo", cam1, data1, data2);
        Prenotazione pren2 = new Prenotazione("Giovanni", "Bottigliasenzatappo", cam2, data3, data4);
        Prenotazione pren3 = new Prenotazione("Gionni", "Bottigliacoltappo", cam4, data5, data6);
        
        ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
        ArrayList<Camera> camere = new ArrayList<>();
        
        prenotazioni.add(pren1);
        prenotazioni.add(pren2);
        prenotazioni.add(pren3);
        
        camere.add(cam1);
        camere.add(cam2);
        camere.add(cam3);
        camere.add(cam4);
        camere.add(cam5);
        camere.add(cam6);
        camere.add(cam7);
        camere.add(cam8);
        
        Albergo alberto = new Albergo("Hotel Giovanni", camere, prenotazioni);
        
        if(alberto.removePrenotazione(pren2)){
            
            System.out.println("Prenotazione rimossa");
            
        }else System.out.println("Prenotazione non rimossa");
        
        if(alberto.addPrenotazione(pren2)){
            
            System.out.println("Prenotazione aggiunta");
            
        }else System.out.println("Errore, non è possibile aggiungere altre prenotazioni");
        
        ArrayList<Camera> camereLibere = new ArrayList<>();
        camereLibere = alberto.listaCamereLibere();
        
        if(camereLibere != null){
            
            for(int i = 0; i < camereLibere.size(); i++){
                
                System.out.println(i+1 + ": " + camereLibere.get(i).getTipo());
                
            }
            
        }else System.out.println("Non ci sono camere libere");
        
        prenotazioni = alberto.listaPrenotazioniPerGiorno(20,2,2021);
        
        if(prenotazioni != null){
            
            for(int i = 0; i < prenotazioni.size(); i++){
                
                System.out.println(prenotazioni.get(i).getCognomeCliente());
                
            }
            
        }else System.out.println("Non ci sono prenotazioni per questo giorno");
        
        
        
    }
    
}

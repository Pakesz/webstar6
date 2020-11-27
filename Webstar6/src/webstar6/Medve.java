
package webstar6;

public class Medve extends Emlos{
    // Tulajdonságok rögzítése
    // láthatóság, adattípus, tulajdonságnév
  private String kedvencKaja;
    private Boolean szelid;
    private Boolean uszas;
    //konstruktor
    public Medve() {
        super();
    }
    
    public Medve(String nev, String kedvencKaja) {
        super(nev,1,false);
        this.kedvencKaja = kedvencKaja;
        this.szelid= true;
    }
    //getter
    public String getKedvencKaja() {
        return this.kedvencKaja;
    }

    public Boolean getSzelid() {
        return this.szelid;
    }

    public Boolean getUszas() {
        return uszas;
    }
    
    
    
    //setter
    
    public void setKedvencKaja(String kaja){
        this.kedvencKaja = kaja;
    }
    
    // Boolean
    public void szelid(){
        this.szelid = true;
    }
    
    public void vad(){
        this.szelid = false;
    }
    
    public void uszik(){
        this.uszas = true;
    }
    
    public void nemUszik(){
        this.uszas = false;
    }
    
    // korlátozott setter
    

    //saját metódus
    
    
}


package webstar6;

public class Medve {
    // Tulajdonságok rögzítése
    // láthatóság, adattípus, tulajdonságnév
    private String nev;
    private Integer kor; // int semmi = 0, Integer semmi = null;
    private Boolean oshonos;
    
    private String kedvencKaja;
    private Boolean szelid;
    private Boolean uszas;
    //konstruktor
    public Medve() {
    }
    
    public Medve(String nev, String kedvencKaja) {
        this.nev = nev;
        this.kedvencKaja = kedvencKaja;
        this.kor=1;
        this.szelid= true;
    }
    //getter
    
    public String getNev() {
        return this.nev;
    }

    public Integer getKor() {
        return this.kor;
    }

    public String getKedvencKaja() {
        return this.kedvencKaja;
    }

    public Boolean getSzelid() {
        return this.szelid;
    }

    public Boolean getOshonos() {
        return oshonos;
    }

    public Boolean getUszas() {
        return uszas;
    }
    
    
    
    //setter
    
    

    public void setNev(String nev) {
        this.nev = nev;
    }
    
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
    
    public void oshonos(){
        this.oshonos = true;
    }
    
    public void idegen(){
        this.oshonos = false;
    }
    
    public void uszik(){
        this.uszas = true;
    }
    
    public void nemUszik(){
        this.uszas = false;
    }
    
    // korlátozott setter
    
    public void szuletesnap(){
        this.kor++;
    }

    //saját metódus
    
    public void morog(){
        System.out.println("grgrgr");
    }
}

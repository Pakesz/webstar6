
package webstar6;

public class Medve {
    // Tulajdonságok rögzítése
    // láthatóság, adattípus, tulajdonságnév
    private String nev;
    private Integer kor; // int semmi = 0, Integer semmi = null;
    private String kedvencKaja;
    private Boolean szelid;
    
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
    
    // korlátozott setter
    
    public void szuletesnap(){
        this.kor++;
    }

    //saját metódus
    
    public void morog(){
        System.out.println("grgrgr");
    }
}


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

    //saját metódus
    
}

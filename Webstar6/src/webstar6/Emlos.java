package webstar6;

public abstract class Emlos {
    protected String nev;
    protected Integer kor;
    protected Boolean oshonos;

    public Emlos() {
    }

    public Emlos(String nev, Integer kor, Boolean oshonos) {
        this.nev = nev;
        this.kor = kor;
        this.oshonos = oshonos;
    }
    
    public String getNev() {
        return this.nev;
    }

    public Integer getKor() {
        return this.kor;
    }

    public Boolean getOshonos() {
        return this.oshonos;
    }
    
    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public void oshonos(){
        this.oshonos = true;
    }
    
    public void idegen(){
        this.oshonos = false;
    }
    
    
    public void szuletesnap(){
        this.kor++;
    }
    
    public void hang(){
        System.out.println("grgrgr");
    }
    
}

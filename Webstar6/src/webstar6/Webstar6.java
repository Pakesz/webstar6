
package webstar6;


public class Webstar6 {

    
    public static void main(String[] args) {
        Medve m = new Medve("Maci","Méz");
        System.out.println(m.getNev());
        System.out.println(m.getKor());
        System.out.println(m.getKedvencKaja());
        System.out.println(m.getSzelid()+"\n");
        
        
        m.setNev("Brumi");
        m.setKedvencKaja("Lazac");
        m.szuletesnap(); // 2
        m.szuletesnap(); // 3
        m.szuletesnap(); // 4
        m.vad();
        System.out.println(m.getNev());
        System.out.println(m.getKor());
        System.out.println(m.getKedvencKaja());
        System.out.println(m.getSzelid());
        
        m.morog();
    }
    
}

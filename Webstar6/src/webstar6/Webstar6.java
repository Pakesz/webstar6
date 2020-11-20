
package webstar6;


public class Webstar6 {

    
    public static void main(String[] args) {
        Medve m = new Medve("Maci","Méz");
        System.out.println(m.getNev());
        m.setNev("Brumi");
        System.out.println(m.getNev());
    }
    
}

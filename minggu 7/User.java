/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastambahanw7;

/**
 *
 * @author ingee
 */
public class User {
    public static void main(String[] args) {
        Televisi1 tv = new Televisi1 ("TV Tempoe Doeloe, 14 inches", 10);
        String[] semuachanel = {"RCTI","SCTV","INDOSIAR","LA TV","METRO TV","TRANSTV","TPI","TV 7","TVRI","TV G","ANTV"};
        String[] chanelfavorit ={"RCTI","SCTV","INDOSIAR","LA TV","METRO TV", "TRANSTV","TPI","TV 7"};
        
        System.out.println("Pak lukman, membeli Televisi : " +tv.getDeskripsi ());
        
        tv.getchanel();
        tv.setchanel(semuachanel);
        tv.setchanel(chanelfavorit);
        
        tv.setChanelAktif(3);
        tv.setvolume(10);
        tv.setChanelAktif(10);
        tv.setChanelAktif(1);
        
        
    }
}

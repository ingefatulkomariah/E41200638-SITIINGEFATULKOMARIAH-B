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
public class UserTvModern {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern ("TV Modern, 29 inc", 100);
        String[] semuachanel = {"RCTI","SCTV","INDOSIAR","LA TV","METRO TV","TRANSTV","TPI","TV 7","TVRI","TV G","ANTV"};
        
        System.out.println("Pak lukman, membeli Televisi : " +tv.getDeskripsi ());
        
        tv.getchanel();
        tv.setchanel(semuachanel);
        
        
        tv.setChanelAktif(3);
        tv.setvolume(10);
        tv.setChanelAktif(10);
        tv.setChanelAktif(1);
        tv.setmodustampilan(TelevisiModern.TELETEXT);
        tv.sethalamanteletext(250);
        tv.setmodustampilan(TelevisiModern.TV);
        tv.PlayCD();
        tv.setdisctray("The Matrix");
        tv.PlayCD();
    }
}

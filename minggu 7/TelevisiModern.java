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
public class TelevisiModern extends Televisi1 {
    public static final int TV = 0;
     public static final int TELETEXT = 1;
     int modustampilan = TV;
     int halamanteletext = 100;
     String disctray = null;
     public TelevisiModern(String Deskripsi,int JumlahChanel) {
     super(Deskripsi, JumlahChanel) ;
     
         
     }
     public void sethalamanteletext(int halamanteletext) {
         this.halamanteletext = halamanteletext;
         System.out.println ("Berpindah ke halaman teletext " + halamanteletext);
         
     }
     public void setmodustampilan(int modustampilan) {
         switch (modustampilan) {
             case TV:
                 System.out.println("Modus tampilan : Televisi ");
                 break;
             case TELETEXT:
                 System.out.println("Modus tampilan : Teletext ");
                 
         }
     }
     public String getdisctray () {
         return disctray;
         
     }
     public void setdisctray(String disctray) {
         this.disctray = disctray;
         
     }
     public void PlayCD(){
         if (disctray == null) {
             System.out.println("Tidak ada CD di dalam disc tray");
             return;
             
         }
         System.out.println("Memutar file " + disctray);
         
     }
}

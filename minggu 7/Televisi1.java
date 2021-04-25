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
public class Televisi1 {
    private String Deskripsi; // untuk menyimpan nama/deskripsi televisi
    private int JumlahChanel; // untuk menyimpan banyaknya chanel yang dapat di simpan televisi
    private String [] chanel = null; // untuk menyimpan chanel stasiun televisi yang sudah di set
    private int ChanelAktif; // untuk menyimpan nomor chanel yang sedang aktif saat ini
    private int volume ; // untuk menyimpan informasi volume televisi
    
    public Televisi1 (String Deskripsi, int JumlahChanel){
        this.Deskripsi = Deskripsi;
        this.JumlahChanel = JumlahChanel;
        
    }
    public String getDeskripsi () {
        return Deskripsi;
        
    }
   public int getJumlahChanel () {
return JumlahChanel;
   }
   public String [] getchanel () {
       if (chanel == null) {
           System.out.println("Belum ada chanel yang di set");
           
       }
   return chanel;
   
   }
   public void setchanel (String [] chanel) {
       if (chanel.length > JumlahChanel) {
           System.out.println("Maaf Tv ini hanya dapat menyimpan " + JumlahChanel + "chanel");
       }
       else{ 
           this.chanel = chanel;
           System.out.println("Informasi chanel berhasil di update");
           
       } 
   }
   public int getChanelAktif () {
       return ChanelAktif;
   }
   public void setChanelAktif (int ChanelAktif) {
       if (ChanelAktif > chanel.length) {
           System.out.println("Chanel yang anda inginkan belum di set");
           return;
           
       }
       this.ChanelAktif = ChanelAktif;
       System.out.println("Pindah chanel ke : " + chanel[ChanelAktif]);
   }
   
   public int getvolume () {
       return volume;
   }
   public void setvolume(int volume) {
       this.volume = volume;
       System.out.println("intensitas volume sekarang : " + volume);
   }
}



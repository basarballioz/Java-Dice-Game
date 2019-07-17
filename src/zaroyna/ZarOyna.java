package zaroyna;
import java.util.Random;
import java.util.Scanner;
public class ZarOyna {
    public static void main(String[] args) {
    //Author: Başar Ballıöz - WarpFlare
    Scanner input = new Scanner(System.in);
    System.out.println("Zar Oyununa Hoşgeldiniz. İyi Oyunlar!");
    
    
    //ROUND SAYACI AYARLAMA
    int round = 1;
    
    //RANDOM OLUSTURMA VE PUANLARI SIFIRLAMA (STARTUP)
    Random player1 = new Random();
    int oyuncu_puanı = 0;
    int bilgisayar_puanı = 0;
    
    //DEVAM ETTİRME DÖNGÜSÜ START
    String answer = "e";
    while(answer.equalsIgnoreCase("e")) {
    
        
    
    
   
    int zar1 = player1.nextInt(6);        //{0,1,2,3,4,5,6} SAYILARINI KAPSAR
    int zar2 = player1.nextInt(6);
    int player_value;
    
    
    
 
    System.out.println("");
    System.out.println("--------------"+round+".Tur"+"--------------");
    round++;
    System.out.println("");
    System.out.println("*********** OYUNCU ***********");
    System.out.println("Birinci Zar: " + (zar1+1));
    System.out.println("İkinci Zar: " + (zar2+1));
    player_value = ((zar1+1) + (zar2+1));                   //Oyuncunun Puanı Hesaplama
    System.out.println("Zarların Toplamı: " + player_value);
    
    System.out.println(" ");
    
    System.out.println(" ");
    
    
    Random cpu = new Random();
    int cpu_zar1 = cpu.nextInt(6);
    int cpu_zar2 = cpu.nextInt(6);
    int cpu_value;
        
    System.out.println("*********** BİLGİSAYAR ***********");
    System.out.println("Birinci Zar: " + (cpu_zar1+1));
    System.out.println("İkinci Zar: " + (cpu_zar2+1));
    cpu_value = ((cpu_zar1+1)+(cpu_zar2+1));                //Bilgisayarın Puanı Hesaplama
    System.out.println("Zarların Toplamı: " + cpu_value);
    System.out.println("---------------------------------");
     
    
    
    //SKOR TABLOSU
        if (player_value > cpu_value) {
        oyuncu_puanı++;
        }
        else if (cpu_value > player_value) {
             bilgisayar_puanı++;
        }       
        
        
    System.out.println("");
    System.out.println("Skor Tablosu: " + "Bilgisayar: " + bilgisayar_puanı + " - Oyuncu: " + oyuncu_puanı);
    System.out.println("");
    
    
    //DEVAM ETTİRME END
    
    System.out.print("Bir Tur Daha Oynamak İster Misiniz ? (E/H):");
   
    answer = input.nextLine();
    
    }
    System.out.println("");
    System.out.println("OYUN SONUCU: " + "Bilgisayar: " + bilgisayar_puanı + " - Oyuncu: " + oyuncu_puanı);
    if (bilgisayar_puanı > oyuncu_puanı) {
        System.out.println("KAZANAN: BİLGİSAYAR! OYUNU KAYBETTİNİZ...");
    }
    else if (oyuncu_puanı > bilgisayar_puanı) {
        System.out.println("KAZANAN: SİZ! TEBRİKLER... ");
    }
    else {
        System.out.println("SONUÇ: BERABERE!");
    
        }
    }
}
   
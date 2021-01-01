
/**
 * @author (Sausan Nabilah)
 * @version (30/12/20)
 */

import java.util.Scanner;

public class Promo extends Pelayanan
{

    Public Promo()
    {
          Super();
    }  
    
    public void Beranda()
    {
         System.out.println(" ============== Promo yang kami miliki adalah : =============");
         System.out.println(" ||                                                        ||");
         System.out.println(" || *> Beli 3 dessert box dapat 5 donat gratis             ||");
         System.out.println(" || *> Potongan harga 25k dengan minimum transaksi 150k    ||");
         System.out.println(" ||                                                        ||");
         System.out.println(" ============================================================");
    }

    public void promoDB()
    {
          Scanner p = new Scanner (System.in);     
          int pilihanDonat = 0;

          System.out.println(" Selamat anda mendapatkan promo beli 3 dessert box dapat 5 donat gratis!! ");
          System.out.println(" Silahkan pilih 5 donat yang anda inginkan! \n\n");
          super.menuDonat();
          super.topingDonat();
          System.out.println("Pilihan donat 1 :");
          pilihanDonat = p.nextInt();
          System.out.println("Pilihan donat 2 :");
          pilihanDonat = p.nextInt();
          System.out.println("Pilihan donat 3 :");
          pilihanDonat = p.nextInt();
          System.out.println("Pilihan donat 4 :");
          pilihanDonat = p.nextInt();
          System.out.println("Pilihan donat 5 :");
          pilihanDonat = p.nextInt();
    }

    public void persen(int biaya)
    {
          System.out.println(" Selamat anda mendapatkan promo potongan harga sebesar 25k dengan transaksi min. 150k  ");
          System.out.println(" Total biaya belanja anda adalah : " + (biaya - 25000));
            
    }
}
    

    


/**
 * @author (Sausan Nabilah)
 * @version (1/01/21)
 */

import java.util.Scanner;

public class Promo 
{

      private Pelayanan pelayanan;
      private Penyimpanan penyimpanan;
      private int biaya;

    Public Promo()
    {
          pelayanan = new Pelayanan();
          penyimpanan = new Penyimpanan();
          biaya = 0;
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
            System.out.println(" Selamat anda mendapatkan promo beli 3 dessert box dapat 5 donat gratis!! ");
            System.out.println(" Silahkan pilih 5 donat yang anda inginkan! \n\n");

        pelayanan.menuDonat();

    }

    public void kurangiStok(int s)
      {
            // Kurangi stok donat
            if(s == 1) {
                  penyimpanan.getStokDonat("Donat Gula", 1);
            }
            else if(s == 2) {
                  penyimpanan.getStokDonat("Donat Cokelat", 1);
            }
            else if(s == 3) {
                  penyimpanan.getStokDonat("Donat Cokelat Putih", 1);
            }
            else if(s == 4) {
                  penyimpanan.getStokDonat("Donat Matcha", 1);
            }
            else if(s == 5) {
                  penyimpanan.getStokDonat("Donat Strawberry", 1);
            }
            else if(s == 6) {
                  penyimpanan.getStokDonat("Donat Blueberry", 1);
            }
            else if(s == 7) {
                  penyimpanan.getStokDonat("Donat Tiramisu", 1);
            }
            else if(s == 8) {
                  penyimpanan.getStokDonat("Donat Cappuchino", 1);
            }
            else if(s == 9) {
                  penyimpanan.getStokDonat("Donat Bomboloni Isi Cokelat", 1);
            }
            else if(s == 10) {
                  penyimpanan.getStokDonat("Donat Bomboloni Isi Strawberry", 1);
            }
            else if(s == 11) {
                  penyimpanan.getStokDonat("Donat Bomboloni Isi Blueberry", 1);
            }
            else if(s == 12) {
                  penyimpanan.getStokDonat("Donat Selai Strawberry", 1);         
            }
            else if(s == 13) {
                  penyimpanan.getStokDonat("Donat Selai Blueberry", 1);
            }
      }

      public void pilihDonat(){

            System.out.println("Pilihan donat 1 :");
            pilihanDonat = p.nextInt();   
            if(pilihanDonat >= 2 && pilihanDonat <= 8) {
                  pelayanan.topingDonat();
                  System.out.println("silahkan masukkan toping yang anda inginkan : ");
                  pilihanToping = p.nextInt();
            }
            kurangiStok(pilihDonat);

            System.out.println("Pilihan donat 2 :");
            pilihanDonat = p.nextInt();   
            if(pilihanDonat >= 2 && pilihanDonat <= 8) {
                  pelayanan.topingDonat();
                  System.out.println("silahkan masukkan toping yang anda inginkan : ");
                  pilihanToping = p.nextInt();
            }
            kurangiStok(pilihDonat);
      
          
            System.out.println("Pilihan donat 3 :");
            pilihanDonat = p.nextInt();   
            if(pilihanDonat >= 2 && pilihanDonat <= 8) {
                  pelayanan.topingDonat();
                  System.out.println("silahkan masukkan toping yang anda inginkan : ");
                  pilihanToping = p.nextInt();
            }
            kurangiStok(pilihDonat);
      
          
            System.out.println("Pilihan donat 4 :");
            pilihanDonat = p.nextInt();   
            if(pilihanDonat >= 2 && pilihanDonat <= 8) {
                  pelayanan.topingDonat();
                  System.out.println("silahkan masukkan toping yang anda inginkan : ");
                  pilihanToping = p.nextInt();
            }
            kurangiStok(pilihDonat);

            System.out.println("Pilihan donat 5 :");
            pilihanDonat = p.nextInt();   
            if(pilihanDonat >= 2 && pilihanDonat <= 8) {
                  pelayanan.topingDonat();
                  System.out.println("silahkan masukkan toping yang anda inginkan : ");
                  pilihanToping = p.nextInt();
            }
            kurangiStok(pilihDonat);
      
      }

      public void potonganHarga(int biaya)
      {
            if (biaya > 150000) {
                  setBiaya(biaya);
                  System.out.println(" Selamat anda mendapatkan promo potongan harga sebesar 25k dengan transaksi min. 150k  ");
            }         
      }

      public void setBiaya(int biaya)
      {
          this.biaya = biaya;
      }

      public int getBiaya()
      {
          return this.biaya -= 25000;
      }
}
    

    

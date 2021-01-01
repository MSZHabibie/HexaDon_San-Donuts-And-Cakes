
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
      
    public Promo()
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

    public int cekPromo(int banyakDB, int biayaBelanjaan)
    {
        Scanner p = new Scanner(System.in);
        int pilihanPromo = 0;
        this.biaya = biayaBelanjaan;

        if(banyakDB >= 3 || biayaBelanjaan >= 150000) {

            if(banyakDB >= 3) {
                // Klo beli >= 3 DB tp biaya belanjaan < 150K
                promoDB();
            }
            else if(biayaBelanjaan >= 150000) {
                // Klo biaya belanjaan >= 150K tp beli < 3 DB
                promoPotonganHarga();
            }
            else {
                // Klo dia beli >= 3 DB dan biaya belanjaan >= 150K
                System.out.println("Selamat ! Anda mendapatkan promo !\nSilahkan pilih promo yang diinginkan !\n1. Promo 5 donat gratis\n2. Promo potongan harga");
                System.out.print("Pilihan Anda : ");
                pilihanPromo = p.nextInt();

                // Exception handling pilihan promo
                while(pilihanPromo < 1 || pilihanPromo > 2) {
                    System.out.println("\nMaaf, mohon pilih antara 1 atau 2 !");
                    System.out.print("Pilihan Anda : ");
                    pilihanPromo = p.nextInt();
                }

                if(pilihanPromo == 1) {
                    promoDB();
                }
                else {
                    promoPotonganHarga();
                }
            }
        }

        p.close();
        return this.biaya;
    }
    
    /*
    Promo beli minimal 3 dessert box dapat 5 donat gratis
    */
    public void promoDB()
    {
        System.out.println("\n\n Selamat Anda mendapatkan promo beli minimal 3 dessert box dapat 5 donat gratis!! ");
        System.out.println(" Silahkan pilih 5 donat yang anda inginkan!\n");

        // Tekan enter untuk lanjut memilih 5 donat
        System.out.print("Tekan enter untuk lanjut memilih 5 donat... ");
        try {
            System.in.read();
        }
        catch(Exception e) {}

        System.out.println("\n\n");
        pilihDonat();
    }

    public void kurangiStok(int s)
    {
        // Kurangi stok donat
        if(s == 1) {
            penyimpanan.kurangiStokDonat("Donat Gula", 1);
        }
        else if(s == 2) {
            penyimpanan.kurangiStokDonat("Donat Cokelat", 1);
        }
        else if(s == 3) {
            penyimpanan.kurangiStokDonat("Donat Cokelat Putih", 1);
        }
        else if(s == 4) {
            penyimpanan.kurangiStokDonat("Donat Matcha", 1);
        }
        else if(s == 5) {
            penyimpanan.kurangiStokDonat("Donat Strawberry", 1);
        }
        else if(s == 6) {
            penyimpanan.kurangiStokDonat("Donat Blueberry", 1);
        }
        else if(s == 7) {
            penyimpanan.kurangiStokDonat("Donat Tiramisu", 1);
        }
        else if(s == 8) {
            penyimpanan.kurangiStokDonat("Donat Cappuchino", 1);
        }
        else if(s == 9) {
            penyimpanan.kurangiStokDonat("Donat Bomboloni Isi Cokelat", 1);
        }
        else if(s == 10) {
            penyimpanan.kurangiStokDonat("Donat Bomboloni Isi Strawberry", 1);
        }
        else if(s == 11) {
            penyimpanan.kurangiStokDonat("Donat Bomboloni Isi Blueberry", 1);
        }
        else if(s == 12) {
            penyimpanan.kurangiStokDonat("Donat Selai Strawberry", 1);  
        }
        else if(s == 13) {
            penyimpanan.kurangiStokDonat("Donat Selai Blueberry", 1);
        }
    }

    public void pilihDonat()
    {
        Scanner p = new Scanner(System.in);
        int pilihanDonat = 0;
        int pilihanToping = 0;

        pelayanan.menuDonat();
        System.out.print("Pilihan donat 1 : ");
        pilihanDonat = p.nextInt();

        // Exception handling pemilihan donat
        while(pilihanDonat < 1 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 1-13 !");
            System.out.print("Pilihan donat 1 : ");
            pilihanDonat = p.nextInt();
        }

        kurangiStok(pilihanDonat);
        System.out.println("\n");
        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            pelayanan.topingDonat();
            System.out.print("Silahkan masukkan toping yang anda inginkan : ");
            pilihanToping = p.nextInt();
            System.out.println("\n");
        }

        pelayanan.menuDonat();
        System.out.print("Pilihan donat 2 : ");
        pilihanDonat = p.nextInt();

        // Exception handling pemilihan donat
        while(pilihanDonat < 1 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 1-13 !");
            System.out.print("Pilihan donat 2 : ");
            pilihanDonat = p.nextInt();
        }
 
        kurangiStok(pilihanDonat);
        System.out.println("\n");  
        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            pelayanan.topingDonat();
            System.out.print("Silahkan masukkan toping yang anda inginkan : ");
            pilihanToping = p.nextInt();
            System.out.println("\n");
        }
      
        pelayanan.menuDonat();
        System.out.print("Pilihan donat 3 : ");
        pilihanDonat = p.nextInt();

        // Exception handling pemilihan donat
        while(pilihanDonat < 1 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 1-13 !");
            System.out.print("Pilihan donat 3 : ");
            pilihanDonat = p.nextInt();
        }

        kurangiStok(pilihanDonat); 
        System.out.println("\n");  
        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            pelayanan.topingDonat();
            System.out.print("Silahkan masukkan toping yang anda inginkan : ");
            pilihanToping = p.nextInt();
            System.out.println("\n");
        }

        pelayanan.menuDonat();
        System.out.print("Pilihan donat 4 : ");
        pilihanDonat = p.nextInt();

        // Exception handling pemilihan donat
        while(pilihanDonat < 1 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 1-13 !");
            System.out.print("Pilihan donat 4 : ");
            pilihanDonat = p.nextInt();
        }
 
        kurangiStok(pilihanDonat); 
        System.out.println("\n"); 
        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            pelayanan.topingDonat();
            System.out.print("Silahkan masukkan toping yang anda inginkan : ");
            pilihanToping = p.nextInt();
            System.out.println("\n");
        }

        pelayanan.menuDonat();
        System.out.print("Pilihan donat 5 : ");
        pilihanDonat = p.nextInt();

        // Exception handling pemilihan donat
        while(pilihanDonat < 1 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 1-13 !");
            System.out.print("Pilihan donat 5 : ");
            pilihanDonat = p.nextInt();
        }

        kurangiStok(pilihanDonat);   
        System.out.println("\n");
        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            pelayanan.topingDonat();
                System.out.print("Silahkan masukkan toping yang anda inginkan : ");
                pilihanToping = p.nextInt();
                System.out.println("\n");
        }

        p.close();
    }

    /*
    Promo potongan harga 25K untuk total biaya belanja minimal 150K
    */
    public void promoPotonganHarga()
    {
        System.out.println("\n\n Selamat Anda mendapatkan promo potongan harga sebesar 25k dengan total biaya belanja mininmal 150k !");
        this.biaya -= 25000;
    }
}
    

    

    

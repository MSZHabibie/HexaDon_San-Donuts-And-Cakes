
/**
 * @author (Sausan Nabilah)
 * @version (1/01/21)
 */

import java.util.Scanner;

public class Promo 
{
    private Scanner p;
    private Penyimpanan penyimpanan;
    private int biaya;
    private int donatPromo;
      
    public Promo()
    {
        p = new Scanner(System.in);
        penyimpanan = new Penyimpanan();
        biaya = 0;
        donatPromo = 0;
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
        int pilihanPromo = 0;
        this.biaya = biayaBelanjaan;

        if(banyakDB >= 3 || biayaBelanjaan >= 150000) {

            if(banyakDB >= 3 && biayaBelanjaan < 150000) {
                // Klo beli >= 3 DB tp biaya belanjaan < 150K
                promoDB();
            }
            else if(biayaBelanjaan >= 150000 && banyakDB < 3) {
                // Klo biaya belanjaan >= 150K tp beli < 3 DB
                promoPotonganHarga();
            }
            else {
                // Klo dia beli >= 3 DB dan biaya belanjaan >= 150K
                System.out.println("\nSelamat ! Anda mendapatkan promo !\nSilahkan pilih promo yang diinginkan !\n1. Promo 5 donat gratis\n2. Promo potongan harga\n");
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

    public void menuDonat()
    {
        // Tampilan daftar menu donat
        System.out.println(" ___________________________________________________________________");
        System.out.println("|   📝 \t\t\t      San's Donuts\t\t     🍩   |");
        System.out.println("|\t\t                Menu Donat\t\t\t    |");
        System.out.println("|\t\t     ______________________________\t\t    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|\t\tMenu\t\t\t\tStok\t  Harga\t    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   1. Donat Gula\t\t\t\t " + penyimpanan.getStokDonat("Donat Gula") + "\tRp 2.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   2. Donat Cokelat\t\t\t\t " + penyimpanan.getStokDonat("Donat Cokelat") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   3. Donat Cokelat Putih\t\t\t " + penyimpanan.getStokDonat("Donat Cokelat Putih") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   4. Donat Matcha\t\t\t\t " + penyimpanan.getStokDonat("Donat Matcha") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   5. Donat Strawberry\t\t\t\t " + penyimpanan.getStokDonat("Donat Strawberry") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   6. Donat Blueberry\t\t\t\t " + penyimpanan.getStokDonat("Donat Blueberry") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   7. Donat Tiramisu\t\t\t\t " + penyimpanan.getStokDonat("Donat Tiramisu") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   8. Donat Cappuchino\t\t\t\t " + penyimpanan.getStokDonat("Donat Cappuchino") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   9. Donat Bomboloni Isi Cokelat\t\t " + penyimpanan.getStokDonat("Donat Bomboloni Isi Cokelat") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   10. Donat Bomboloni Isi Strawberry\t\t " + penyimpanan.getStokDonat("Donat Bomboloni Isi Strawberry") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   11. Donat Bomboloni Isi Blueberry\t\t " + penyimpanan.getStokDonat("Donat Bomboloni Isi Blueberry") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   12. Donat Selai Strawberry\t\t\t " + penyimpanan.getStokDonat("Donat Selai Strawberry") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   13. Donat Selai Blueberry\t\t\t " + penyimpanan.getStokDonat("Donat Selai Blueberry") + "\tRp 3.000    |");
        System.out.println("|___________________________________________________________________|\n");
    }

    public void topingDonat()
    {
        // Tampilan daftar toping untuk donat nomor 2 sampai 8
        System.out.println(" _______________________________________________________________");
        System.out.println("|   📝 \t\t\t    San's Donuts \t\t 🍩   |");
        System.out.println("|\t\t              Menu Toping \t\t\t|");
        System.out.println("|\t\t   ______________________________\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   1. Tanpa toping\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   2. Kacang\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   3. Kacang Almond\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   4. Ceres\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   5. Crispy Ball Cokelat\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   6. Sprinkle Warna\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   7. Meses Warna\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   8. Keju\t\t\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________|\n");
    }

    public int cekStokDonat(String donat)
    {
        if(penyimpanan.getStokDonat(donat) < 1) {
            // Klo stok gk tersedia sebanyak diinginkan, lalu balik ke menu pilih donat
            System.out.println("Maaf, stok tidak tersedia !");

            // Tekan enter untuk balik ke menu pilih donat
            System.out.print("Tekan enter untuk kembali ke menu pemilihan donat... ");
            try {
                System.in.read();
            }
            catch(Exception e) {}

            pilihDonat();
            return 0;
        }
        else {
            penyimpanan.kurangiStokDonat(donat, 1);
        }

        return 0;
    }

    public int kurangiStok(int pilihDonat)
    {
        // Kurangi stok donat
        if(pilihDonat == 1) {
            cekStokDonat("Donat Gula");
        }
        else if(pilihDonat == 2) {
            cekStokDonat("Donat Cokelat");
        }
        else if(pilihDonat == 3) {
            cekStokDonat("Donat Cokelat Putih");
        }
        else if(pilihDonat == 4) {
            cekStokDonat("Donat Matcha");
        }
        else if(pilihDonat == 5) {
            cekStokDonat("Donat Strawberry");
        }
        else if(pilihDonat == 6) {
            cekStokDonat("Donat Blueberry");
        }
        else if(pilihDonat == 7) {
            cekStokDonat("Donat Tiramisu");
        }
        else if(pilihDonat == 8) {
            cekStokDonat("Donat Cappuchino");
        }
        else if(pilihDonat == 9) {
            cekStokDonat("Donat Bomboloni Isi Cokelat");
        }
        else if(pilihDonat == 10) {
            cekStokDonat("Donat Bomboloni Isi Strawberry");
        }
        else if(pilihDonat == 11) {
            cekStokDonat("Donat Bomboloni Isi Blueberry");
        }
        else if(pilihDonat == 12) {
            cekStokDonat("Donat Selai Strawberry");
        }
        else if(pilihDonat == 13) {
            cekStokDonat("Donat Selai Blueberry");
        }

        return 0;
    }

    public void pilihDonat()
    {
        int pilihanDonat = 0;
        int pilihanToping = 0;

        if(donatPromo == 0) {
            menuDonat();
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
                topingDonat();
                System.out.print("Silahkan masukkan toping yang anda inginkan : ");
                pilihanToping = p.nextInt();
                System.out.println("\n");
            }

            donatPromo++;
        }
        
        if(donatPromo == 1) {
            menuDonat();
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
                topingDonat();
                System.out.print("Silahkan masukkan toping yang anda inginkan : ");
                pilihanToping = p.nextInt();
                System.out.println("\n");
            }

            donatPromo++;
        }
        
        if(donatPromo == 2) {
            menuDonat();
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
                topingDonat();
                System.out.print("Silahkan masukkan toping yang anda inginkan : ");
                pilihanToping = p.nextInt();
                System.out.println("\n");
            }    
            
            donatPromo++;
        }
      
        if(donatPromo == 3) {
            menuDonat();
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
                topingDonat();
                System.out.print("Silahkan masukkan toping yang anda inginkan : ");
                pilihanToping = p.nextInt();
                System.out.println("\n");
            }

            donatPromo++;
        }
        
        if(donatPromo == 4) {
            menuDonat();
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
                topingDonat();
                System.out.print("Silahkan masukkan toping yang anda inginkan : ");
                pilihanToping = p.nextInt();
                System.out.println("\n");
            }

            donatPromo++;
        }  
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
    

    

    

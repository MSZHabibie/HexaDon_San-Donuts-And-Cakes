/**
 * @author (M. Saifullah Sani)
 * @version (1.0)
 */

import java.util.Scanner;

public class Pelayanan
{



    public Pelayanan()
    {

    }

    public void welcome()
    {
        Scanner in = new Scanner(System.in);
        String nama = " ";

        System.out.println("\n\n\n");
        System.out.println("\t╰(*°▽°*)╯\t\t               WELCOME  \t\t\t╰(*°▽°*)╯");  
        System.out.println("\t\t   (☞ﾟヮﾟ)☞\t                 TO\t\t      ☜(ﾟヮﾟ☜)");  
        System.out.println("\t\t\t      ^_^\t SAN_DONUTSANDCAKES \t^_^");
        System.out.println("\t\t\t\t\t   🥯 🍩 🎂 🍰");
        System.out.println("\n\n\n");
        System.out.print("Masukkan nama Anda : ");
        nama = in.nextLine();

        System.out.println("\n\nHai " + nama + " !\nSelamat datang di San Donuts And Cakes !\n");

        System.out.println("1. Promo");
        System.out.println("2. Donat");
        System.out.println("3. Dessert Box");

        System.out.print("\nPilihan Anda : ");
        int pilihan = in.nextInt();

        //Exception handling
        while(pilihan < 1 || pilihan > 3) {
            System.out.println("\nMaaf, mohon pilih antara 1-3 !");
            System.out.print("Pilihan Anda : ");
            pilihan = in.nextInt();
        }
        

        if(pilihan == 1) {
            //promo
            System.out.println("\nKami punya promo ...\n");
            
            // press any key to continue
            // welcome();
        }
        else if(pilihan == 2) {
            menuDonat();
        }
        else if(pilihan == 3) {
            menuDB();
        }
        
        in.close();
    }

    public void menuDonat()
    { 
        Scanner in = new Scanner(System.in);
        int stok = 5;
        int banyak = 0;
        int pilihanDonat = 0;
        int pilihanToping = 0;
        char beliLain = 'n';

        System.out.println(" _______________________________________________________________");
        System.out.println("|   📝 \t\t\t    San's Donuts \t\t 🍩   |");
        System.out.println("|\t\t              Menu Utama \t\t\t|");
        System.out.println("|\t\t   ______________________________\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   1. Donat Gula ( " + stok + " )\t\t\t\t    Rp 2.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   2. Donat Cokelat ( " + stok + " )\t\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   3. Donat Cokelat Putih ( " + stok + " )\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   4. Donat Matcha ( " + stok + " )\t\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   5. Donat Strawberry ( " + stok + " )\t\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   6. Donat Blueberry ( " + stok + " )\t\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   7. Donat Tiramisu ( " + stok + " )\t\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   8. Donat Cappuchino ( " + stok + " )\t\t\t    Rp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   9. Donat Bomboloni Isi Cokelat ( " + stok + " )\t    Rp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   10. Donat Bomboloni Isi Strawberry ( " + stok + " )\t    Rp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   11. Donat Bomboloni Isi Blueberry ( " + stok + " )\t    Rp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   12. Donat Selai Strawberry ( " + stok + " )\t\t    Rp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   13. Donat Selai Blueberry ( " + stok + " )\t\t    Rp 3.000    |");
        System.out.println("|_______________________________________________________________|");
        
        System.out.println("\nPilih 0 untuk kembali ke tampilan awal !");
        System.out.print("Pilihan Anda : ");
        pilihanDonat = in.nextInt();

        //Exception handling
        while(pilihanDonat < 0 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 0-13 !");
            System.out.print("Pilihan Anda : ");
            pilihanDonat = in.nextInt();
        }


        if(pilihanDonat == 0) {
            welcome();
        }
        else if(pilihanDonat >= 1 && pilihanDonat <= 13) {
            System.out.print("\nBanyak donat jenis ini yang ingin dibeli : ");
            banyak = in.nextInt();

            if(banyak > stok) {
                System.out.println("Maaf, stok tidak tersedia !\n\n");
                menuDonat();
            }
        }        


        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            System.out.println(" _______________________________________________________________");
            System.out.println("|   📝 \t\t\t    San's Donuts \t\t 🍩   |");
            System.out.println("|\t\t              Menu Toping \t\t\t|");
            System.out.println("|\t\t   ______________________________\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   1. Tanpa toping ( " + stok + " )\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   2. Kacang ( " + stok + " )\t\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   3. Kacang Almond ( " + stok + " )\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   4. Ceres ( " + stok + " )\t\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   5. Crispy Ball Cokelat ( " + stok + " )\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   6. Sprinkle Warna ( " + stok + " )\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   7. Meses Warna ( " + stok + " )\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t|");
            System.out.println("|   8. Keju ( " + stok + " )\t\t\t\t\t\t|");
            System.out.println("|_______________________________________________________________|\n");

            for(int i = 1; i <= banyak; i++) {
                System.out.println();
                System.out.print("Toping untuk donat " + i + " : ");
                pilihanToping = in.nextInt();

                //Exception handling
                while(pilihanToping < 1 || pilihanToping > 8) {
                    System.out.println("\nMohon pilih antara 1-8 !");
                    System.out.print("Pilihan Anda : ");
                    pilihanToping = in.nextInt();
                }
            }
        }

        //Apa mw beli yg lain ?
        System.out.print("\n\nApa Anda ingin membeli yang lain lagi ? (y/n) : ");
        beliLain = in.next().charAt(0);

        while(beliLain != 'y' && beliLain != 'Y' && beliLain != 'n' && beliLain != 'N') {
            System.out.println("\nMohon input y atau n !");
            System.out.print("Apa Anda ingin membeli yang lain lagi ? (y/n) : ");
            beliLain = in.next().charAt(0);
        }

        if(beliLain == 'y' || beliLain == 'Y') {
            welcome();
        }
        else {
            //Masuk ke transaksi
            penutup();
        }

        in.close();
    }

    public void menuDB()
    {
        Scanner in = new Scanner(System.in);
        int stok = 5;
        int banyak = 0;
        int pilihanDB = 0;
        char beliLain = 'n';

        System.out.println(" _______________________________________________________________");
        System.out.println("|   📝 \t\t\t    San's Dessert Box \t\t 🍩   |");
        System.out.println("|\t\t                   Menu \t\t\t|");
        System.out.println("|\t\t   ______________________________\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   1. Turkish ( " + stok + " )\t\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   2. Red Velvet ( " + stok + " )\t\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   3. Lotus ( " + stok + " )\t\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   4. Chocolate ( " + stok + " )\t\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   5. Cadburry ( " + stok + " )\t\t\t\t    Rp 35.000   |");
        System.out.println("|_______________________________________________________________|");

        System.out.println("\nPilih 0 untuk kembali ke tampilan awal !");
        System.out.print("Pilihan Anda : ");
        pilihanDB = in.nextInt();

        //Exception handling
        while(pilihanDB < 0 || pilihanDB > 5) {
            System.out.println("\nMohon pilih antara 0-5 !");
            System.out.print("Pilihan Anda : ");
            pilihanDB = in.nextInt();
        }


        if(pilihanDB == 0) {
            welcome();
        }
        else if(pilihanDB >= 1 && pilihanDB <= 5) {
            System.out.print("\nBanyak Dessert Box jenis ini yang ingin dibeli : ");
            banyak = in.nextInt();

            if(banyak > stok) {
                System.out.println("Maaf, stok tidak tersedia !");
            }
        }

        //Apa mw beli yg lain ?
        System.out.print("\n\nApa Anda ingin membeli yang lain lagi ? (y/n) : ");
        beliLain = in.next().charAt(0);

        while(beliLain != 'y' && beliLain != 'Y' && beliLain != 'n' && beliLain != 'N') {
            System.out.println("\nMohon input y atau n !");
            System.out.print("Apa Anda ingin membeli yang lain lagi ? (y/n) : ");
            beliLain = in.next().charAt(0);
        }

        if(beliLain == 'y' || beliLain == 'Y') {
            menuDB();
        }
        else {
            //Masuk ke transaksi
            t.fikrul();
            penutup();
        }

        in.close();
    }

    public void penutup()
    {
        //kasi kata kata yg keren dungz !
        System.out.println("\n\nTerima kasih !\nDatang lagi yoo...\n");
    }












}


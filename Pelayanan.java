/**
 * @author (M. Saifullah Sani)
 * @version (22/12/2020)
 */

import java.util.Scanner;

public class Pelayanan
{
    private static Transaksi transaksi;
    private static Scanner in;


    public Pelayanan()
    {
        transaksi = new Transaksi();
        in = new Scanner(System.in);
    }

    public void welcome()
    {
        System.out.println("\n\n\n");
        System.out.println("\t╰(*°▽°*)╯\t\t               WELCOME  \t\t\t╰(*°▽°*)╯");  
        System.out.println("\t\t   (☞ﾟヮﾟ)☞\t                 TO\t\t      ☜(ﾟヮﾟ☜)");  
        System.out.println("\t\t\t      ^_^\t SAN_DONUTSANDCAKES \t^_^");
        System.out.println("\t\t\t\t\t   🥯 🍩 🎂 🍰");
        System.out.println("\n\n\n");
        System.out.print("Masukkan nama Anda : ");;
        transaksi.setNama(in.nextLine());
        System.out.println("\n\nHai " + transaksi.getNama() + " !\nSelamat datang di San Donuts And Cakes !");

        System.out.print("\nPress enter to continue...");
            try {
                System.in.read();
            }
            catch(Exception e) {}

        menuUtama();
    }

    public void menuUtama()
    {
        int kembali = 1;
        int uang = 0;

        System.out.println("\nMenu utama :");
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

            System.out.print("Press enter to continue...");
            try {
                System.in.read();
            }
            catch(Exception e) {}

            /*
            System.out.print("Input 1 untuk kembali ke menu awal ! ");
            kembali = in.nextInt();

            while(kembali != 1) {
                System.out.print("\nMaaf, mohon input 1 ! ");
                kembali = in.nextInt();
            }
            */
            menuUtama();
        }
        else if(pilihan == 2) {
            menuDonat();
        }
        else if(pilihan == 3) {
            menuDB();
        }

        // kuarangi stok ke menu transaksi
        // cek promo. Klo dpt promo, panggil class promo

        System.out.print("Masukkan uang Anda : ");
        uang = in.nextInt();
        
        /*
        transaksi.setJumlahUang(uang);
        */
    }

    public void menuDonat()
    {
        int banyak = 0;
        int pilihanDonat = 0;
        int pilihanToping = 0;
        char beliLain = 'n';

        System.out.println(" ___________________________________________________________________");
        System.out.println("|   📝 \t\t\t      San's Donuts\t\t     🍩   |");
        System.out.println("|\t\t                Menu Donat\t\t\t    |");
        System.out.println("|\t\t     ______________________________\t\t    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|\t\tMenu\t\t\t\tStok\t  Harga\t    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        
        int stok = 5;
        
        System.out.println("|   1. Donat Gula\t\t\t\t " + stok + "\tRp 2.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   2. Donat Cokelat\t\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   3. Donat Cokelat Putih\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   4. Donat Matcha\t\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   5. Donat Strawberry\t\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   6. Donat Blueberry\t\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   7. Donat Tiramisu\t\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   8. Donat Cappuchino\t\t\t\t " + stok + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   9. Donat Bomboloni Isi Cokelat\t\t " + stok + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   10. Donat Bomboloni Isi Strawberry\t\t " + stok + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   11. Donat Bomboloni Isi Blueberry\t\t " + stok + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   12. Donat Selai Strawberry\t\t\t " + stok + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   13. Donat Selai Blueberry\t\t\t " + stok + "\tRp 3.000    |");
        System.out.println("|___________________________________________________________________|");
        
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
            menuUtama();
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
            menuUtama();
        }
        else {
            //Masuk ke transaksi
            penutup();
        }
    }

    public void menuDB()
    {
        int banyak = 0;
        int pilihanDB = 0;
        char beliLain = 'n';

        System.out.println(" _______________________________________________________________");
        System.out.println("|   📝 \t\t\t    San's Dessert Box \t\t 🍩   |");
        System.out.println("|\t\t              Menu Dessert Box\t\t\t|");
        System.out.println("|\t\t   ______________________________\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|\tMenu\t\t\tStok\t\t\tHarga\t|");
        System.out.println("|\t\t\t\t\t\t\t\t|");

        int stok = 5;

        System.out.println("|   1. Turkish\t\t\t " + stok + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   2. Red Velvet\t\t " + stok + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   3. Lotus\t\t\t " + stok + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   4. Chocolate\t\t " + stok + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   5. Cadburry\t\t\t " + stok + "\t\t    Rp 35.000   |");
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
            menuUtama();
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
            //t.fikrul();
            penutup();
        }
    }

    public void penutup()
    {
        String feedback;

        System.out.println("Sebaris feedback dari Anda sangat kami harapkan !");
        System.out.print("Feedback : ");
        in.nextLine();
        feedback = in.nextLine();
        //kasi kata kata yg keren dungz !
        System.out.println("\n\nTerima kasih !\nDatang lagi yoo...\n");
    }












}









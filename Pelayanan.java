/**
 * @author (M. Saifullah Sani)
 * @version (31/12/2020)
 */

import java.util.Scanner;

public class Pelayanan
{
    private Transaksi transaksi;
    private Scanner in;
    private Scanner input;


    public Pelayanan()
    {
        transaksi = new Transaksi();
        in = new Scanner(System.in);
        input = new Scanner(System.in);
        welcome();
    }

    public void welcome()
    {
        // Tampilan pembuka
        System.out.println("\n\n\n");
        System.out.println("\t╰(*°▽°*)╯\t\t               WELCOME  \t\t\t╰(*°▽°*)╯");  
        System.out.println("\t\t   (☞ﾟヮﾟ)☞\t                 TO\t\t      ☜(ﾟヮﾟ☜)");  
        System.out.println("\t\t\t      ^_^\t SAN_DONUTSANDCAKES \t^_^");
        System.out.println("\t\t\t\t\t   🥯 🍩 🎂 🍰");
        System.out.println("\n\n\n");
        System.out.print("Masukkan nama Anda : ");;
        transaksi.setNama(in.nextLine());
        System.out.println("\n\nHai " + transaksi.getNama() + " !\nSelamat datang di San Donuts And Cakes !");

        // Tekan enter untuk lanjut ke Main menu
        System.out.print("\nPress enter to continue...");
            try {
                System.in.read();
            }
            catch(Exception e) {}

        menuUtama();
    }

    public void menuUtama()
    {
        char beliLain = 'n';

        // Main menu
        System.out.println("\nMenu utama :");
        System.out.println("1. Promo");
        System.out.println("2. Donat");
        System.out.println("3. Dessert Box");

        System.out.print("\nPilihan Anda : ");
        int pilihan = in.nextInt();

        // Exception handling Main menu
        while(pilihan < 1 || pilihan > 3) {
            System.out.println("\nMaaf, mohon pilih antara 1-3 !");
            System.out.print("Pilihan Anda : ");
            pilihan = in.nextInt();
        }
        
        if(pilihan == 1) {
            // Panggil list promo dr class Promo
            System.out.println("\nKami punya promo ...\n");

            // Tekan enter untuk balik ke Main menu
            System.out.print("Press enter to continue...");
            try {
                System.in.read();
            }
            catch(Exception e) {}

            menuUtama();
        }
        else if(pilihan == 2) {
            pilihDonat();
        }
        else if(pilihan == 3) {
            pilihDB();
        }

        // Apa mw beli yg lain ?
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

        // kuarangi stok ke penyimpanan
        // cek promo. Klo dpt promo, panggil class promo
        // setelah kalkulasi promo, kirim var biaya ke Transaksi untuk bon

        // Peoses transaksi sampe kembalian
        System.out.println("\nTotal biaya belanjaan Anda : Rp. " + transaksi.getBiaya());
        System.out.print("Masukkan uang Anda         : Rp. ");
        transaksi.setJumlahUang(in.nextInt());

        while(transaksi.getJumlahUang() - transaksi.getBiaya() < 0) {
            System.out.println("\nMaaf, nominal uang yang Anda masukkan kurang sejumlah Rp. " + (transaksi.getJumlahUang() - transaksi.getBiaya()));
            System.out.print("Masukkan tambahan uang : Rp. ");
            transaksi.setJumlahUang(in.nextInt());
        }

        // Kembalian
        System.out.println("\nKembalian Anda             : Rp. " + transaksi.kembalian());
        penutup();
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

    public void pilihDonat()
    {        
        int banyak = 0;
        int pilihanDonat = 0;
        int pilihanToping = 0;
        int stok = 5;

        // Menampilkan tampilan daftar menu donat
        menuDonat();

        System.out.println("\nPilih 0 untuk kembali ke tampilan awal !");
        System.out.print("Pilihan Anda : ");
        pilihanDonat = in.nextInt();

        // Exception handling pemilihan menu donat
        while(pilihanDonat < 0 || pilihanDonat > 13) {
            System.out.println("\nMohon pilih antara 0-13 !");
            System.out.print("Pilihan Anda : ");
            pilihanDonat = in.nextInt();
        }


        if(pilihanDonat == 0) {
            // Balik ke Main menu
            menuUtama();
        }
        else if(pilihanDonat >= 1 && pilihanDonat <= 13) {
            // Banyak donat ini yang ingin dibeli
            System.out.print("\nBanyak donat jenis ini yang ingin dibeli : ");
            banyak = in.nextInt();

            if(banyak > stok) {
                // Klo stok gk tersedia sebanyak diinginkan, lalu balik ke menu donat
                System.out.println("Maaf, stok tidak tersedia !\n\n");
                menuDonat();
            }
        } 

        // Pilih toping untuk donat tertentu
        if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            // Menampilkan tampilan daftar toping untuk donat nomor 2 sampai 8
            topingDonat();

            for(int i = 1; i <= banyak; i++) {
                System.out.println();
                System.out.print("Toping untuk donat " + i + " : ");
                pilihanToping = in.nextInt();

                // Exception handling pemilihan toping
                while(pilihanToping < 1 || pilihanToping > 8) {
                    System.out.println("\nMohon pilih antara 1-8 !");
                    System.out.print("Pilihan Anda : ");
                    pilihanToping = in.nextInt();
                }
            }
        }       
        
        // Hitung total biaya belanjaan donat
        if(pilihanDonat == 1) {
            transaksi.tambahBiaya(banyak, 2000);
        }
        else if(pilihanDonat >= 2 && pilihanDonat <= 8) {
            transaksi.tambahBiaya(banyak, 2500);
        }
        else {
            transaksi.tambahBiaya(banyak, 3000);
        }
    }

    public void menuDB()
    {
        // Tampilan daftar menu dessert box
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
    }

    public void pilihDB()
    {
        int banyak = 0;
        int pilihanDB = 0;
        int stok = 5;

        // Menampilkan daftar tampilan menu dessert box
        menuDB();

        System.out.println("\nPilih 0 untuk kembali ke tampilan awal !");
        System.out.print("Pilihan Anda : ");
        pilihanDB = in.nextInt();

        // Exception handling pemilihan menu dessert box
        while(pilihanDB < 0 || pilihanDB > 5) {
            System.out.println("\nMohon pilih antara 0-5 !");
            System.out.print("Pilihan Anda : ");
            pilihanDB = in.nextInt();
        }


        if(pilihanDB == 0) {
            // Kembali ke main menu
            menuUtama();
        }
        else if(pilihanDB >= 1 && pilihanDB <= 5) {
            // Banyak dessert box ini yang ingin dibeli
            System.out.print("\nBanyak Dessert Box jenis ini yang ingin dibeli : ");
            banyak = in.nextInt();

            if(banyak > stok) {
                // Klo stok gk tersedia sebanyak diinginkan, lalu balik ke menu dessert box
                System.out.println("Maaf, stok tidak tersedia !");
                menuDB();
            }
        }

        // Menghitung total biaya belanjaan dessert box
        transaksi.tambahBiaya(banyak, 35000);
    }

    /*
    Cetak Bon
    public void Bon()
    {
        System.out.println(getDate());
        System.out.println("Kode Transaksi = " + getKodeTransaksi());
        System.out.println("Nama = " + getNama());
        System.out.println("Jumlah Uang " + getJumlahUang());
        System.out.println("Total = " + totalTransaksi());
        System.out.println("Kembalian =  " + Kembalian());
    }
    */

    public void penutup()
    {
        String feedback;

        System.out.println("\nSebaris feedback dari Anda sangat kami harapkan !");
        System.out.print("Feedback : ");
        feedback = input.nextLine();
        //kasi kata kata yg keren dungz !
        System.out.println("\n\nTerima kasih !\nDatang lagi yoo...\n");
    }












}












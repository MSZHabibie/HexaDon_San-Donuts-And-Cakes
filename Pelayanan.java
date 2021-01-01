/**
 * @author (M. Saifullah Sani)
 * @version (01/01/2021)
 */

import java.util.Scanner;

public class Pelayanan extends Penyimpanan
{
    private Promo promo;
    private Transaksi transaksi;
    private Scanner in;
    private Scanner input;
    private int banyakDB;

    public Pelayanan()
    {
        super();
        promo = new Promo();
        transaksi = new Transaksi();
        in = new Scanner(System.in);
        input = new Scanner(System.in);
        banyakDB = 0;
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
        System.out.println("\n\nHai " + transaksi.getNama() + " !\nSelamat datang di San Donuts And Cakes !\n");

        // Tekan enter untuk lanjut ke Main menu
        System.out.print("Tekan enter untuk lanjut ke menu utama... ");
            try {
                System.in.read();
            }
            catch(Exception e) {}

        menuUtama();
    }

    public int menuUtama()
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
            System.out.println("\n\n");
            promo.Beranda();
            System.out.println("\n\n");

            // Tekan enter untuk kembali ke Main menu
            System.out.print("Tekan enter untuk kembali ke menu utama... ");
            try {
                System.in.read();
            }
            catch(Exception e) {}

            menuUtama();
            return 0;
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
            return 0;
        }

        // cek promo. Klo dpt promo, panggil class promo
        // setelah kalkulasi promo, kirim var biaya ke Transaksi untuk bon

        transaksi.setBiaya(promo.cekPromo(banyakDB, transaksi.getBiaya()));



        // Proses transaksi sampai kembalian
        System.out.println("\nTotal biaya belanjaan Anda : Rp. " + transaksi.getBiaya());
        System.out.print("Masukkan uang Anda         : Rp. ");
        transaksi.setJumlahUang(in.nextInt());

        // Meminta tambahan uang ketika uang yang dimasukkan kurang dari total biaya belanjaan
        if(transaksi.getJumlahUang() - transaksi.getBiaya() < 0) {
            while(transaksi.getJumlahUang() - transaksi.getBiaya() < 0) {
                System.out.println("\nMaaf, nominal uang yang Anda masukkan kurang sejumlah Rp. " + Math.abs((int) (transaksi.getJumlahUang() - transaksi.getBiaya())));
                System.out.print("Masukkan tambahan uang                              : Rp. ");
                transaksi.setJumlahUang(in.nextInt());
            }

            // Cetak kembalian
            System.out.println("Kembalian Anda                                      : Rp. " + transaksi.kembalian());
        }
        else {
            // Cetak kembalian
            System.out.println("Kembalian Anda             : Rp. " + transaksi.kembalian());
        }
        
        penutup();

        // Tekan enter untuk lanjut ke pencetakan bon
        System.out.print("Tekan enter untuk lanjut ke pencetakan bon... ");
        try {
            System.in.read();
        }
        catch(Exception e) {}


        cetakBon();
        return 0;
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
        System.out.println("|   1. Donat Gula\t\t\t\t " + super.getStokDonat("Donat Gula") + "\tRp 2.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   2. Donat Cokelat\t\t\t\t " + super.getStokDonat("Donat Cokelat") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   3. Donat Cokelat Putih\t\t\t " + super.getStokDonat("Donat Cokelat Putih") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   4. Donat Matcha\t\t\t\t " + super.getStokDonat("Donat Matcha") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   5. Donat Strawberry\t\t\t\t " + super.getStokDonat("Donat Strawberry") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   6. Donat Blueberry\t\t\t\t " + super.getStokDonat("Donat Blueberry") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   7. Donat Tiramisu\t\t\t\t " + super.getStokDonat("Donat Tiramisu") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   8. Donat Cappuchino\t\t\t\t " + super.getStokDonat("Donat Cappuchino") + "\tRp 2.500    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   9. Donat Bomboloni Isi Cokelat\t\t " + super.getStokDonat("Donat Bomboloni Isi Cokelat") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   10. Donat Bomboloni Isi Strawberry\t\t " + super.getStokDonat("Donat Bomboloni Isi Strawberry") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   11. Donat Bomboloni Isi Blueberry\t\t " + super.getStokDonat("Donat Bomboloni Isi Blueberry") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   12. Donat Selai Strawberry\t\t\t " + super.getStokDonat("Donat Selai Strawberry") + "\tRp 3.000    |");
        System.out.println("|\t\t\t\t\t\t\t\t    |");
        System.out.println("|   13. Donat Selai Blueberry\t\t\t " + super.getStokDonat("Donat Selai Blueberry") + "\tRp 3.000    |");
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

    public void cekStokDonat(String donat, int banyak)
    {
        if(banyak > super.getStokDonat(donat)) {
            // Klo stok gk tersedia sebanyak diinginkan, lalu balik ke menu pilih donat
            System.out.println("Maaf, stok tidak tersedia !");

            // Tekan enter untuk balik ke menu pilih donat
            System.out.print("Tekan enter untuk kembali ke menu pemilihan donat... ");
            try {
                System.in.read();
            }
            catch(Exception e) {}

            pilihDonat();
        }
        else {
            super.kurangiStokDonat(donat, banyak);
        }
    }

    // Pilih toping untuk donat tertentu
    public void pilihToping(int banyak)
    {
        int pilihanToping = 0;

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

    public int pilihDonat()
    {        
        int banyak = 0;
        int pilihanDonat = 0;

        // Menampilkan tampilan daftar menu donat
        menuDonat();

        System.out.println("Pilih 0 untuk kembali ke tampilan awal !");
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
            return 0;
        }
        else {
            // Banyak donat ini yang ingin dibeli
            System.out.print("\nBanyak donat jenis ini yang ingin dibeli : ");
            banyak = in.nextInt();

            // Kurangi stok donat
            if(pilihanDonat == 1) {
                cekStokDonat("Donat Gula", banyak);
            }
            else if(pilihanDonat == 2) {
                cekStokDonat("Donat Cokelat", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 3) {
                cekStokDonat("Donat Cokelat Putih", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 4) {
                cekStokDonat("Donat Matcha", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 5) {
                cekStokDonat("Donat Strawberry", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 6) {
                cekStokDonat("Donat Blueberry", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 7) {
                cekStokDonat("Donat Tiramisu", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 8) {
                cekStokDonat("Donat Cappuchino", banyak);
                pilihToping(banyak);
            }
            else if(pilihanDonat == 9) {
                cekStokDonat("Donat Bomboloni Isi Cokelat", banyak);
            }
            else if(pilihanDonat == 10) {
                cekStokDonat("Donat Bomboloni Isi Strawberry", banyak);
            }
            else if(pilihanDonat == 11) {
                cekStokDonat("Donat Bomboloni Isi Blueberry", banyak);
            }
            else if(pilihanDonat == 12) {
                cekStokDonat("Donat Selai Strawberry", banyak);
            }
            else if(pilihanDonat == 13) {
                cekStokDonat("Donat Selai Blueberry", banyak);
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

        return 0;
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
        System.out.println("|   1. Turkish\t\t\t " + super.getStokDessert("Turkish") + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   2. Red Velvet\t\t " + super.getStokDessert("Red Velvet") + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   3. Lotus\t\t\t " + super.getStokDessert("Lotus") + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   4. Chocolate\t\t " + super.getStokDessert("Chocolate") + "\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t\t|");
        System.out.println("|   5. Cadburry\t\t\t " + super.getStokDessert("Cadburry") + "\t\t    Rp 35.000   |");
        System.out.println("|_______________________________________________________________|");
    }

    public void cekStokDB(String db, int banyak)
    {
        if(banyak > super.getStokDessert(db)) {
            // Klo stok gk tersedia sebanyak diinginkan, lalu balik ke menu pilih dessert box
            System.out.println("Maaf, stok tidak tersedia !");

            // Tekan enter untuk balik ke menu pilih dessert box
            System.out.print("Tekan enter untuk kembali ke menu pemilihan dessert box... ");
            try {
                System.in.read();
            }
            catch(Exception e) {}

            pilihDB();
        }
        else {
            super.kurangiStokDessert(db, banyak);
        }
    }

    public int pilihDB()
    {
        int banyak = 0;
        int pilihanDB = 0;

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
            return 0;
        }
        else {
            // Banyak dessert box ini yang ingin dibeli
            System.out.print("\nBanyak Dessert Box jenis ini yang ingin dibeli : ");
            banyak = in.nextInt();

            // Kurangi stok dessert box
            if(pilihanDB == 1) {
                cekStokDB("Turksih", banyak);
            }
            else if(pilihanDB == 2) {
                cekStokDB("Red Velvet", banyak);
            }
            else if(pilihanDB == 3) {
                cekStokDB("Lotus", banyak);
            }
            else if(pilihanDB == 4) {
                cekStokDB("Chocolate", banyak);
            }
            else if(pilihanDB == 5) {
                cekStokDB("Cadburry", banyak);
            }
        }

        // Menghitung total biaya belanjaan dessert box
        transaksi.tambahBiaya(banyak, 35000);

        return 0;
    }

    public void penutup()
    {
        String feedback;

        System.out.println("\nSebaris feedback dari Anda sangat kami harapkan !");
        System.out.print("Feedback : ");
        feedback = input.nextLine();
        //kasi kata kata yg keren dungz !
        System.out.println("\n\nTerima kasih !\nDatang lagi yoo...\n");
    }

    public void cetakBon()
    {
        System.out.println("\n\n    =========== BON ===========\n");
        System.out.println("   " + transaksi.getDate() + "\n");
        System.out.println("Kode Transaksi          : " + transaksi.getKodeTransaksi());
        System.out.println("Nama pelanggan          : " + transaksi.getNama());
        System.out.println("Total biaya belanjaan   : " + transaksi.getBiaya());
        System.out.println("Jumlah uang             : " + transaksi.getJumlahUang());
        System.out.println("Kembalian               : " + transaksi.kembalian());
        System.out.println("\n\n");
    }












}












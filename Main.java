/**
 * @author (Muhammad Syah Zichrullah Habibie (1908107010025))
 * @version (1.0)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        temporary();
    }
//
    public static void temporary(){
      Scanner sc = new Scanner(System.in);
        Transaksi trx = new Transaksi();
        int pilihDonat;
        int menu;
        boolean mulai = true, restart;
        String ulang;
        Penyimpanan p = new Penyimpanan(0, "");

        System.out.println("\tSELAMAT DATANG DI SAN DONUTS AND CAKES");

        while(mulai) {
            System.out.println("1. Beli");
            System.out.println("2. Pre Order");
            System.out.println("3. Ambil");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("Silahkan Pilih Donat : ");
                System.out.println("1. Donat Coklat (Rp2.500)");
                System.out.println("2. Donat Matcha (Rp3.000)");
                System.out.println("3. Donat Strawberry (Rp2.500)");
                System.out.println("4. Donat Cappuchino (Rp2.500)");
                System.out.println("5. Donat Tiramisu (Rp3.000)");
                System.out.println("6. Donat Blueberry (Rp3.000)");
                pilihDonat = sc.nextInt();

                switch (pilihDonat) {
                    case 1:
                        p = new Penyimpanan(2500, "Donat Coklat");
                        System.out.println("Anda Akan Membeli Donat Coklat Seharga " + p.getHargaDonat());
                        break;
                    case 2:
                        p = new Penyimpanan(3000, "Donat Matcha");
                        System.out.println("Anda Akan Membeli Donat Matcha Seharga " + p.getHargaDonat());
                        break;
                    case 3:
                        p = new Penyimpanan(2500, "Donat Strawberry");
                        System.out.println("Anda Akan Membeli Donat Strawberry Seharga " + p.getHargaDonat());
                        break;
                    case 4:
                        p = new Penyimpanan(2500, "Donat Cappuchino");
                        System.out.println("Anda Akan Membeli Donat Cappuchino Seharga " + p.getHargaDonat());
                        break;
                    case 5:
                        p = new Penyimpanan(3000, "Donat Tiramisu");
                        System.out.println("Anda Akan Membeli Donat Tiramisu Seharga " + p.getHargaDonat());
                        break;
                    case 6:
                        p = new Penyimpanan(3000, "Donat Blueberry");
                        System.out.println("Anda Akan Membeli Donat Blueberry Seharga " + p.getHargaDonat());
                        break;
                }
                System.out.println("Masukkan Jumlah Donat = ");
                int total = sc.nextInt();
                trx.totalTransaksi(total, p.getHargaDonat());
                System.out.println("Masukkan Jumlah Uang = ");
                trx.setJumlahUang(sc.nextInt());

                System.out.println("Kode Transaksi : " + trx.getKodeTransaksi());
                System.out.println("Jumlah Uang Anda : " + trx.getJumlahUang());
                System.out.println("Jumlah Pembelian : " + p.getNamaDonat() + " Sebanyak " + total + " Donat");
                System.out.println("Total Harga : " + trx.totalTransaksi(total, p.getHargaDonat()));
                System.out.println("Kembalian : " + trx.Kembalian(trx.getJumlahUang(), trx.totalTransaksi(total, p.getHargaDonat())));
                System.out.println("Terimakasih, ditunggu next order.\n");

            } else if (menu == 2) {
                System.out.println("Terimakasih telah melakukan preorder.");
                System.out.println("Kode Transaksi : " + trx.getKodeTransaksi());
                System.out.println("Untuk melakukan pengambilan donat silahkan ambil di menu 'Ambil'\n");

            } else if (menu == 3) {
                System.out.println("Untuk melakukan pengambilan donat, harap memasukkan kode transaksi yang didapat\nketika melakukan preorder");
                System.out.println("Masukkan Kode Transaksi : ");
                trx.setKodeTransaksi(sc.next());
                trx.preOrder(trx.getKodeTransaksi());

                System.out.println("Terimakasih, ditunggu next order.\n");
            }

            do {
                System.out.println("Apakah anda ingin membuka menu lagi ?(y/n)");
                ulang = sc.next();
                if (ulang.equalsIgnoreCase("y")) {
                    restart = false;
                } else if (ulang.equalsIgnoreCase("n")) {
                    mulai = false;
                    restart = false;
                } else {
                    System.out.println("Pilihan tidak tersedia");
                    restart = true;
                }
            } while (restart);
        }
    }
}

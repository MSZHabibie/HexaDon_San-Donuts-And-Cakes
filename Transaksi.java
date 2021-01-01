/**
 * @author (Fikrul Akhyar)
 * @version (5.0)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi
{
    private int jumlahUang;
    private int biaya;
    private String kodeTransaksi;
    private String nama;

    /**
     * Method constructor tanpa parameter
     */
    public Transaksi()
    {
        jumlahUang = 0;
        biaya = 0;
        kodeTransaksi = "";
        nama = "";

        // Generate kode transaksi
        setKodeTransaksi();
    }

    /**
     * Method untuk mereturn jumlah uang.
     * @return
     */
    public int getJumlahUang()
    {
        return jumlahUang;
    }

    /**
     * Method untuk memasukkan nilai jumlah uang.
     */
    public void setJumlahUang(int jumlahUang)
    {
        this.jumlahUang += jumlahUang;
    }

    /**
     * Method untuk mereturn kode transaksi
     * @return
     */
    public String getKodeTransaksi()
    {
        return this.kodeTransaksi;
    }

    /**
     * Method untuk membuat kode transaksi
     */
    public void setKodeTransaksi()
    {
        this.kodeTransaksi = "Don" + (int) (1 + (Math.random() * (10000 - 1)));
    }

    /**
     * Method untuk mereturn nama
     * @return
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Method untuk memasukkan nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Method untuk melakukan tambah biaya
     */
    public void tambahBiaya(int banyak, int harga)
    {
        this.biaya += banyak * harga;
    }

    /**
     * Method untuk mereturn biaya
     * @return
     */
    public int getBiaya()
    {
        return this.biaya;
    }

    /**
     * Method untuk menghitung uang kembalian
     * @return
     */
    public int kembalian()
    {
        return this.jumlahUang - this.biaya;
    }

    /**
     * Method untuk mereturn date
     * @return
     */
    public String getDate()
    {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("E, dd.MM.yyy | hh.mm.ss a");
        return df.format(date);
    }
}

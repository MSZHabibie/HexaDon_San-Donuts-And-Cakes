/**
 * @author (Fikrul Akhyar)
 * @version (5.0)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi
{
    private int jumlahUang;
    private int harga;
    private int jumlah;
    private String kodeTransaksi;
    private String nama;

    /**
     * Method constructor tanpa parameter
     */
    public Transaksi()
    {
        jumlahUang = 0;
        harga = 0;
        jumlah = 0;
        kodeTransaksi = "";
        nama = "";

    }

    /**
     * Method untuk mereturn jumlah uang.
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

    public int getHarga()
    {
        return harga;
    }

    public void setHarga(int harga)
    {
        this.harga = harga;
    }

    public int getJumlah()
    {
        return jumlah;
    }

    public void setJumlah(int jumlah)
    {
        this.jumlah = jumlah;
    }

    /**
     * Method untuk mengembalikan kode transaksi
     */
    public String getKodeTransaksi()
    {
        return kodeTransaksi;
    }

    /**
     * Method untuk memasukkan kode transaksi
     */
    public void setKodeTransaksi(String kodeTransaksi)
    {

        this.kodeTransaksi = kodeTransaksi;
    }

    public String buatKodeTransaksi()
    {
        return "Don" + (int) (1 + (Math.random() * (10000 + 1)));
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Method untuk menghitung total transaksi
     */
    public int totalTransaksi()
    {
        return jumlah * harga;
    }

    /**
     * Method untuk menghitung uang kembalian
     * @return
     */
    public int Kembalian()
    {
        return jumlahUang - totalTransaksi();
    }

    /**
     * Method untuk mereturn date
     */
    public String getDate()
    {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("E, dd.MM.yyy | hh.mm.ss a");
        return df.format(date);
    }

    public void Bon()
    {
        System.out.println(\tgetDate());
        System.out.println("Kode Transaksi = " + getKodeTransaksi());
        System.out.println("Nama = " + getNama());
        System.out.println("Jumlah Uang " + getJumlahUang());
        System.out.println("Total = " + totalTransaksi());
        System.out.println("Kembalian =  " + Kembalian());
    }

}


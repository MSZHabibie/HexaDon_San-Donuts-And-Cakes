/**
 * @author (Fikrul Akhyar)
 * @version (1.0)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi
{
    private int jumlahUang;
    private String kodeTransaksi;

    /**
     * Method constructor tanpa parameter
     */
    public Transaksi()
    {
        jumlahUang = 0;
        kodeTransaksi = "";
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
        this.jumlahUang = jumlahUang;
    }

    /**
     * Method untuk mendapatkan kode transaksi
     */
    public String getKodeTransaksi()
    {
        return "Don" + (int) (1 + (Math.random() * (10000 + 1)));
    }

    /**
     * Method untuk memasukkan kode transaksi
     */
    public void setKodeTransaksi(String kodeTransaksi)
    {

        this.kodeTransaksi = kodeTransaksi;
    }

    /**
     * Method untuk menghitung total transaksi
     */
    public int totalTransaksi(int jumlahDonat, int hargaDonat)
    {
        return jumlahDonat * hargaDonat;
    }

    /**
     * Method untuk menghitung uang kembalian
     */
    public int Kembalian(int jumlahUang, int totalTransaksi)
    {
        return jumlahUang - totalTransaksi;
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
}

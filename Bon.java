/* sayidatul sufur
  mauriza humaira
  */

import java.time.LocalDate;


public class Bon {

    private String codeTransaksi;
    private int jumlahUang;
    private int kembalian;
    protected String nama;
    private LocalDate tanggal;
    private int totalBelanja;

    public Bon()
    {

    }

    public Bon(String nama,int totalBelanja, int jumlahUang, int kembalian)
    {
        tanggal = LocalDate.now();
        this.nama = nama;
        this.totalBelanja = totalBelanja;//total harga belanjaan pelanggan
        this.jumlahUang = jumlahUang;
        this.kembalian = kembalian;

    }

    public void setCodeTransaksi(String codeTransaksi)
    {
        this.codeTransaksi = codeTransaksi;
    }

    public void setJumlahUang(int jumlahUang)
    {
        this.jumlahUang = jumlahUang;
    }

    public void setKembalian(int kembalian)
    {
        this.kembalian = kembalian;
    }

    public String getCodeTransaksi()
    {
        return this.codeTransaksi;
    }

    public int getJumlahUang()
    {
        return this.jumlahUang;
    }

    public int getKembalian()
    {
        return this.kembalian;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }

    public LocalDate tanggal()
    {
        return tanggal;
    }

    public String toString()
    {
        return "\n" + tanggal +"\n"+nama+"\n"+totalBelanja+"\n"+jumlahUang+"\n"+kembalian;
    }
}

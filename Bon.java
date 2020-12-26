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
    private String p1;
    private String p2;
    private String p3;
    private int totalbelanja;

    public Bon(){

    }

    public Bon(String nama,String p1,String p2,String p3,int totalbelanja, int jumlahUang, int kembalian){
        tanggal = LocalDate.now();
        this.nama = nama;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.totalbelanja = ttlbelanja;
        this.jumlahUang = jumlahUang;
        this.kembalian = kembalian;

    }

    public void setCodeTransaksi(String codeTransaksi){
        this.codeTransaksi = codeTransaksi;
    }

    public void setJumlahUang(int jumlahUang){
        this.jumlahUang = jumlahUang;
    }

    public void setKembalian(int kembalian){
        this.kembalian = kembalian;
    }

    public String getCodeTransaksi(){
        return this.codeTransaksi;
    }

    public int getJumlahUang(){
        return this.jumlahUang;
    }

    public int getKembalian(){
        return this.kembalian;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public LocalDate tanggal(){
        return tanggal;
    }

    public String toString(){
        return "\n" + tanggal +"\n"+nama+"\n"+p1+"\n"+p2+"\n"+p3+"\n"+totalbelanja+"\n"+jumlahUang+"\n"+kembalian;
    }
}

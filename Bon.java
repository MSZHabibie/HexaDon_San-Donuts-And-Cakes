/* sayidatul sufur
  mauriza humaira
  */

public class Bon {

    private String codeTransaksi;
    private int jumlahUang;
    private int kembalian;

    public Bon(){

    }

    public Bon(String codeTransaksi, int jumlahUang, int kembalian){
        this.codeTransaksi = codeTransaksi;
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
}

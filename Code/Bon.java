/* sayidatul sufur
  mauriza humaira
  */


public class Bon
{
    private String tgl;
    private String kodeTransaksi;
    private String nama;
    private int totalBiaya;
    private int jumlahUang;
    private int kembalian;
    private String feedback;

    public Bon(String tgl, String kodeTransaksi, String nama, int totalBiaya, int jumlahUang, int kembalian, String feedback)
    {
        this.tgl = tgl;
        this.kodeTransaksi = kodeTransaksi;
        this.nama = nama;
        this.totalBiaya = totalBiaya;
        this.jumlahUang = jumlahUang;
        this.kembalian = kembalian;
        this.feedback = feedback;
    }

    public String getTgl()
    {
        return this.tgl;
    }

    public String getKodeTransaksi()
    {
        return this.kodeTransaksi;
    }

    public String getNama()
    {
        return this.nama;
    }

    public int getTotalBiaya()
    {
        return this.totalBiaya;
    }

    public int getJumlahUang()
    {
        return this.jumlahUang;
    }

    public int getKembalian()
    {
        return this.kembalian;
    }

    public String getFeedback()
    {
        return this.feedback;
    }

    public String toString(){
        return "\n\n    =========== BON ===========\n" +
        "   " + this.tgl + "\n" +
        "Kode Transaksi          : " + this.kodeTransaksi +
        "Nama pelanggan          : " + this.nama +
        "Total biaya belanjaan   : " + this.totalBiaya +
        "Jumlah uang             : " + this.jumlahUang +
        "Kembalian               : " + this.kembalian +
        "Feedback                : " + this.feedback +
        "\n\n";
    }
}

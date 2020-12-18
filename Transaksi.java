/**
 * @author (Fikrul Akhyar)
 * @version (1.0)
 */

public class Transaksi
{
    private int jumlahUang;
    private String kodeTransaksi;

    public Transaksi()
    {
        jumlahUang = 0;
        kodeTransaksi = "";
    }

    public Transaksi(String kodeTransaksi)
    {
        getJumlahUang();

    }

    public Transaksi(int jumlahUang, String kodeTransaksi)
    {
        this.jumlahUang = jumlahUang;
        this.kodeTransaksi = kodeTransaksi;
    }

    public int getJumlahUang()
    {
        return jumlahUang;
    }

    public void setJumlahUang(int jumlahUang)
    {
        this.jumlahUang = jumlahUang;
    }

    public String getKodeTransaksi()
    {
        return "Don" + (int) (1 + (Math.random() * (10000 + 1)));
    }

    public void setKodeTransaksi(String kodeTransaksi)
    {

        this.kodeTransaksi = kodeTransaksi;
    }

    public int Kembalian(int jumlahUang, int hargaDonat)
    {
        return jumlahUang - hargaDonat;
    }

    public void preOrder(String kodeTransaksi)
    {
        Penyimpanan p = new Penyimpanan(0, "");
        System.out.println("Pesanan : " + p.getNamaDonat());
        System.out.print("Total Harga : " + p.getHargaDonat());


    }
}

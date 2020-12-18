/**
 * @author (Sayidatul Sufur)
 * @version (1.0)
 */
 
 public class Penyimpanan {

  private int hargaDonat;
  private String namaDonat;

  public Penyimpanan(int hargaDonat, String namaDonat) {
    this.hargaDonat = hargaDonat;
    this.namaDonat = namaDonat;
  }

  // public Penyimpanan(int hargaDonat, String namaDonat, String kodeTransaksi) {
  // this.hargaDonat = hargaDonat;
  // this.namaDonat = namaDonat;
  // Transaksi trx = new Transaksi();
  // trx.setKodeTransaksi(kodeTransaksi);
  // }

  public int getHargaDonat() {
    return hargaDonat;
  }

  public void setHargaDonat(int hargaDonat) {
    this.hargaDonat = hargaDonat;
  }

  public String getNamaDonat() {
    return namaDonat;
  }
}

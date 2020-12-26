/**
 * @author (Sayidatul Sufur)
 * @version (1.0)
 */
 
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

public class Penyimpanan {
 
 private HashMap<String, Integer> menuDonat;
    private HashMap<String, Integer> menuDessert;
    private int stok;
    private HashMap<String,Bon> simpanBon;
    //private Iterator<Bon> cekBon;
    private int pemasukan;
    private int modal;
    private int untungrugi;


    public Penyimpanan(){
        //membuat HashMap
        menuDonat = new HashMap<String, Integer>();
        menuDessert = new HashMap<String, Integer>();
        simpanBon = new HashMap<String,Bon>();

        setMenuDonat();
        setMenuDessert();
    }

    // stok dan jenis donat
    public void setMenuDonat(){
        menuDonat.put("Donat Gula", 20);
        menuDonat.put("Donat Coklat", 20);
        menuDonat.put("Donat Coklat Putih", 20);
        menuDonat.put("Donat Matcha", 20);
        menuDonat.put("Donat Strawberry", 20);
        menuDonat.put("Donat Blueberry", 20);
        menuDonat.put("Donat Tiramisu", 20);
        menuDonat.put("Donat Cappuchino", 20);
        menuDonat.put("Donat Bomboloni isi Coklat", 20);
        menuDonat.put("Donat Bomboloni isi Strawberry", 20);
        menuDonat.put("Donat Bomboloni isi Blueberry", 20);
        menuDonat.put("Donat Selai Strawberry", 20);
        menuDonat.put("Donat Selai Bluberry", 20);
    }

    // stok dan jenis Dessert
    public void setMenuDessert(){
        menuDessert.put("Turkish", 20);
        menuDessert.put("Red Velvet", 20);
        menuDessert.put("Lotus", 20);
        menuDessert.put("Chocolate", 20);
        menuDessert.put("Cadburry", 20);
    }


    // menambah Stok Donat
    public void tambahDonat(String Donat, int x){
        for(String i : menuDonat.keySet()) {
            if(i.equals(Donat)) {
                Integer a = menuDonat.get(i) + x;
                menuDonat.replace(i, a);
            }
        }
    }

    // menambah Stok Dessert
    public void tambahDessert(String Dessert, int x){
        for(String i : menuDessert.keySet()) {
            if(i.equals(Dessert)) {
                Integer a = menuDessert.get(i) + x;
                menuDessert.replace(i, a);
            }
        }
    }

    // pengurangan Stok Donat
    public void kurangiStokDonat(String Donat, int x){
        for(String i : menuDonat.keySet()) {
            if(i.equals(Donat)) {
                Integer a = menuDonat.get(i) - x;
                menuDonat.replace(i, a);
            }
        }
    }

    // pengurangan Stok Dessert
    public void kurangiStokDessert(String Dessert, int x){
        for(String i : menuDessert.keySet()) {
            if (i.equals(Dessert)) {
                Integer a = menuDessert.get(i) - x;
                menuDessert.replace(i, a);
            }
        }
        //promo += x;
    }

    //mengecek jumlah stok dessert
    public int cekStokDessert(String Dessert){
        for(String i : menuDessert.keySet()) {
            if (i.equals(Dessert)) {
                 stok = menuDessert.get(i);
            }
        }
        return stok;
    }

    //mengecek jumlah stok donat
    public int cekStokDonat(String Donat){
        for(String i : menuDonat.keySet()) {
            if (i.equals(Donat)) {
                stok = menuDonat.get(i);
                break;
            }
        }
        return stok;
    }

    public void tambahBon(String kodeTransaksi, Bon temp){
        this.simpanBon.put(kodeTransaksi,temp);
    }

    //menghitung total pemasukan
    public void setPemasukan(int pemasukan){
        this.pemasukan += pemasukan ;
    }

    public void setModal(int modal){
        this.modal = modal;
    }

    // menghitung keuntungan atau kerugian toko
    public String getUntungRugi(){
        if (pemasukan>=modal){
            untungrugi = pemasukan - modal;
            return "keuntungan: " + untungrugi;
        }else{
            untungrugi = modal - pemasukan;
            return "kerugian: " + untungrugi;
        }
    }

    public int getPemasukan(){
        return pemasukan;
    }

    public int getModal(){
        return modal;
    }


    public void cetakBon(String kdTransaksi){
        for (String i : simpanBon.keySet()) {
            if (i.equalsIgnoreCase(kdTransaksi)) {
                //String key = i.toString();
                String value = simpanBon.get(i).toString();
                System.out.println("kode Transaksi: " + i + " " + value);
            }
        }
    }
}

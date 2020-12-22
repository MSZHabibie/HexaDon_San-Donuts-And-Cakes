/**
 * @author (Sayidatul Sufur)
 * @version (1.0)
 */
 
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

public class Penyimpanan {

    protected HashMap<String, Integer> menuDonat;
    protected HashMap<String, Integer> menuDessert;
    private int stok;
    private ArrayList<Bon> simpanBon;
   // private Iterator<Bon> cetakBon;

    public Penyimpanan(){
        //membuat HashMap
        menuDonat = new HashMap<String, Integer>();
        menuDessert = new HashMap<String, Integer>();
        //membuat ArrayList
        simpanBon = new ArrayList<Bon>();
       
        setMenuDonat();
        setMenuDessert();
    }
 
    // stok dan jenis donat
    public void setMenuDonat(){
        menuDonat.put("Donat Gula", 5);
        menuDonat.put("Donat Coklat", 5);
        menuDonat.put("Donat Coklat Putih", 5);
        menuDonat.put("Donat Matcha", 5);
        menuDonat.put("Donat Strawberry", 5);
        menuDonat.put("Donat Blueberry", 5);
        menuDonat.put("Donat Tiramisu", 5);
        menuDonat.put("Donat Cappuchino", 5);
        menuDonat.put("Donat Bomboloni isi Coklat", 5);
        menuDonat.put("Donat Bomboloni isi Strawberry", 5);
        menuDonat.put("Donat Bomboloni isi Blueberry", 5);
        menuDonat.put("Donat Selai Strawberry", 5);
        menuDonat.put("Donat Selai Bluberry", 5);
    }

    // stok dan jenis Dessert
    public void setMenuDessert(){
        menuDessert.put("Turkish", 5);
        menuDessert.put("Red Velvet", 5);
        menuDessert.put("Lotus", 5);
        menuDessert.put("Chocolate", 5);
        menuDessert.put("Cadburry", 5);
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
            if(i.equals(Dessert)) {
                Integer a = menuDessert.get(i) - x;
                menuDessert.replace(i,a);
            }
        }

    }

    public int cekStokDessert(String Dessert){
        for(String i : menuDessert.keySet()) {
            if (i.equals(Dessert)) {
                 stok = menuDessert.get(i);
            }
        }
        return stok;
    }

    public int cekStokDonat(String Donat){
        for(String i : menuDonat.keySet()) {
            if (i.equals(Donat)) {
                stok = menuDonat.get(i);
                break;
            }
        }
        return stok;
    }

    public void tambahBon(Bon temp){
        this.simpanBon.add(temp);
    }
 
   //mengitung berapa kali pelanggan yang sama melakukan transaksi
    public int cekLangganan(String nama){
        this.cekBon = this.simpanBon.iterator();
        while (cekBon.hasNext()){
            Bon b = cekBon.next();
            if (b.getNama().equalsIgnoreCase(nama)){
                promo +=1;
            }
        }
        return promo;
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
}

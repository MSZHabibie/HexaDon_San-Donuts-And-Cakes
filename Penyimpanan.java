/**
 * @author (Sayidatul Sufur)
 * @version (1.0)
 */
 
import java.util.HashMap;

public class Penyimpanan
{

    private HashMap<String, Integer> menuDonat;
    private HashMap<String, Integer> menuDessert;
    private int stok;
    private HashMap<String,Bon> simpanBon;
    private int pemasukan;
    private int modal;
    private int untungRugi;


    public Penyimpanan()
    {
        //membuat HashMap
        menuDonat = new HashMap<String, Integer>();
        menuDessert = new HashMap<String, Integer>();
        simpanBon = new HashMap<String,Bon>();

        setMenuDonat();
        setMenuDessert();
    }

    // stok dan jenis donat
    public void setMenuDonat()
    {
        menuDonat.put("Donat Gula", 10);
        menuDonat.put("Donat Cokelat", 10);
        menuDonat.put("Donat Cokelat Putih", 10);
        menuDonat.put("Donat Matcha", 10);
        menuDonat.put("Donat Strawberry", 10);
        menuDonat.put("Donat Blueberry", 10);
        menuDonat.put("Donat Tiramisu", 10);
        menuDonat.put("Donat Cappuchino", 10);
        menuDonat.put("Donat Bomboloni Isi Cokelat", 10);
        menuDonat.put("Donat Bomboloni Isi Strawberry", 10);
        menuDonat.put("Donat Bomboloni Isi Blueberry", 10);
        menuDonat.put("Donat Selai Strawberry", 10);
        menuDonat.put("Donat Selai Blueberry", 10);
    }

    // stok dan jenis Dessert
    public void setMenuDessert()
    {
        menuDessert.put("Turkish", 10);
        menuDessert.put("Red Velvet", 10);
        menuDessert.put("Lotus", 10);
        menuDessert.put("Chocolate", 10);
        menuDessert.put("Cadburry", 10);
    }


    // menambah Stok Donat
    public void tambahDonat(String donat, int x)
    {
        for(String i : menuDonat.keySet()) {
            if(i.equalsIgnoreCase(donat)) {
                Integer a = menuDonat.get(i) + x;
                menuDonat.replace(i, a);
            }
        }
    }

    // menambah Stok Dessert
    public void tambahDessert(String dessert, int x)
    {
        for(String i : menuDessert.keySet()) {
            if(i.equalsIgnoreCase(dessert)) {
                Integer a = menuDessert.get(i) + x;
                menuDessert.replace(i, a);
            }
        }
    }

    // pengurangan Stok Donat
    public void kurangiStokDonat(String donat, int x)
    {
        for(String i : menuDonat.keySet()) {
            if(i.equalsIgnoreCase(donat)) {
                Integer a = menuDonat.get(i) - x;
                menuDonat.replace(i, a);
            }
        }
    }

    // pengurangan Stok Dessert
    public void kurangiStokDessert(String dessert, int x)
    {
        for(String i : menuDessert.keySet()) {
            if (i.equalsIgnoreCase(dessert)) {
                Integer a = menuDessert.get(i) - x;
                menuDessert.replace(i, a);
            }
        }
    }

    //mengecek jumlah stok dessert
    public int getStokDessert(String dessert)
    {
        for(String i : menuDessert.keySet()) {
            if (i.equalsIgnoreCase(dessert)) {
                 stok = menuDessert.get(i);
            }
        }
        return stok;
    }

    //mengecek jumlah stok donat
    public int getStokDonat(String donat)
    {
        for(String i : menuDonat.keySet()) {
            if (i.equalsIgnoreCase(donat)) {
                stok = menuDonat.get(i);
                break;
            }
        }
        return stok;
    }

    public void tambahBon(String kodeTransaksi, Bon temp)
    {
        this.simpanBon.put(kodeTransaksi,temp);
    }

    //menghitung total pemasukan
    public void setPemasukan(int pemasukan)
    {
        this.pemasukan += pemasukan ;
    }

    public void setModal(int modal)
    {
        this.modal = modal;
    }

    // menghitung keuntungan atau kerugian toko
    public String getUntungRugi()
    {
        if (pemasukan>=modal){
            untungRugi = pemasukan - modal;
            return "keuntungan: " + untungRugi;
        } else {
            untungRugi = modal - pemasukan;
            return "kerugian: " + untungRugi;
        }
    }

    public int getPemasukan()
    {
        return pemasukan;
    }

    public int getModal()
    {
        return modal;
    }


    public void cetakBon(String kdTransaksi)
    {
        for (String i : simpanBon.keySet()){
            if (i.equals(kdTransaksi)){
                String value = simpanBon.get(i).toString();
                System.out.println("Kode Transaksi: " + i + " " + value);
            }
        }
    }

}

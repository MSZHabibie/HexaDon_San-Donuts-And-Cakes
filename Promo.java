import java.util.Scanner;
/**
 * @author (Sausan Nabilah)
 * @version (1.0)
 */

public class Promo{

    Public Promo()
    {

    }

    public void menudessert()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println(" _______________________________________________________");
        System.out.println("|   📝 \t\t    San's Dessert Box \t\t 🍩   |");
        System.out.println("|\t                    Menu \t\t\t|");
        System.out.println("|\t        _________________________\t\t|");
        System.out.println("|\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t|");
        System.out.println("|   1. Turkish\t\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t|");
        System.out.println("|   2. Red Velvet\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t|");
        System.out.println("|   3. Lotus\t\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t|");
        System.out.println("|   4. Chocolate\t\t\t    Rp 35.000   |");
        System.out.println("|\t\t\t\t\t\t\t|");
        System.out.println("|   5. Cadburry\t\t\t\t    Rp 35.000   |");
        System.out.println("|_______________________________________________________|");

        System.out.print("\nPilihan 1: ");
        System.out.print("\nPilihan 2: ");
        System.out.print("\nPilihan 3: ");
        int pilihanD = in.nextInt();

        in.close();
    }
    
    public void diskon()
    {
        Scanner in = new Scanner(System.in);
    }
    public static void main (String[] args)
   {
        Scanner in = new Scanner(System.in);
        Promo p = new Promo();

        System.out.println("Promo San Donuts And Cakes");
        System.out.println("Promo hari ini adalah :");
        System.out.println("1. Buy 3 Dessert Box Get 5 Donuts");
        System.out.println("2. Birthday Diskon (5%)");

        System.out.print("\nPilihan Anda : ");
        int pilihan = in.nextInt();

        if(pilihan == 1) {
            p.menudessert();
        }
    //else if(pilihan == 2) {
        //   p.menuDonat();
   }


    

}
    

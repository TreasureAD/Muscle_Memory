package overloading_9c;

// TasteTester class to test the Cake, BirthdayCake, and WeddingCake classes
public class TasteTester {

    public static void main(String[] args) {

        // Create a BirthdayCake object with flavor "Chocolate"
        BirthdayCake birthdayCake = new BirthdayCake("Chocolate");
        birthdayCake.setPrice(29.99);  // Set the price of the birthday cake
        birthdayCake.setCandles(12);  // Set the number of candles

        // Print the details of the BirthdayCake
        System.out.println("Birthday Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake Price: $" + birthdayCake.getPrice());
        System.out.println("Number of Candles: " + birthdayCake.getCandles());

        // Create a WeddingCake object with flavor "Vanilla"
        WeddingCake weddingCake = new WeddingCake("Vanilla");
        weddingCake.setPrice(199.99);  // Set the price of the wedding cake
        weddingCake.setTiers(3);  // Set the number of tiers

        // Print the details of the WeddingCake
        System.out.println("\nWedding Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price: $" + weddingCake.getPrice());
        System.out.println("Number of Tiers: " + weddingCake.getTiers());
    }
}


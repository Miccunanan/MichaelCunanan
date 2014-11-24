package p1;

import java.util.Scanner;

public class TrackBandBooster {
    public static void main (String[] args) {    // Heap
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the name of the BandBooster1: ");
        String name1 = scan.nextLine();
        System.out.println("Enter the name of the BandBooster2: ");
        String name2 = scan.nextLine();
        
        BandBooster bandBooster1 = new BandBooster (name1);
        BandBooster bandBooster2 = new BandBooster (name2);
        
        System.out.println("Enter the number of boxes sold by " + name1 + " the first week:");
        int Booster1itemssold = scan.nextInt();
        bandBooster1.updateSales(Booster1itemssold);
        
        System.out.println("Enter the number of boxes sold by " + name1 + " the second week:");
        Booster1itemssold = scan.nextInt();
        bandBooster1.updateSales(Booster1itemssold);
        
        System.out.println("Enter the number of boxes sold by " + name1 + " the third week:");
        Booster1itemssold = scan.nextInt();
        bandBooster1.updateSales(Booster1itemssold);
        
        System.out.println("Enter the number of boxes sold by " + name2 + " the first week:");
        int Booster2itemssold = scan.nextInt();
        bandBooster1.updateSales(Booster2itemssold);
        
        System.out.println("Enter the number of boxes sold by " + name2 + " the second week:");
        Booster2itemssold = scan.nextInt();
        bandBooster1.updateSales(Booster2itemssold);
        
        System.out.println("Enter the number of boxes sold by " + name2 + " the third week:");
        Booster2itemssold = scan.nextInt();
        bandBooster2.updateSales(Booster2itemssold);
        scan.close(); 
        
        
        
        System.out.println("Total: " + bandBooster1.toString());
        System.out.println("Total: " + bandBooster2.toString());
        
    }
}

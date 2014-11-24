package p1;

public class BandBooster { //Blueprint
    public String name;
    public int boxesSold;

    public BandBooster(String bandBooster1){       //Constructor
        name = bandBooster1;
        boxesSold = 0;
    }
    public String getName() {   //Get name method
        return name;
    }
    public int updateSales(int extraboxes) {  //Update Sales method
        boxesSold = extraboxes + boxesSold;
        return boxesSold;
    }
    public String toString() {
        return name + ":" + boxesSold + " boxes";
    }
}

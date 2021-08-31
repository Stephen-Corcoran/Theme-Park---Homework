package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedToRide (Visitor visitor) {
        if (visitor.getAge() >= 12 & (visitor.getHeight() > 145))  return true;
        else return false;
    }
    public double CanGetPrice (Visitor visitor) {
        if (visitor.getHeight() > 200)  return (price*2);
        else return (price);
    }
}

package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
    }

    public double CanGetPrice (Visitor visitor) {
        if (visitor.getAge() < 12)  return (price/2);
        else return (price);
    }
}

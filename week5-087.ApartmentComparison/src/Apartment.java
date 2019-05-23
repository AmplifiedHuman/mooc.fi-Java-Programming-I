
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherAppartment) {
        return this.squareMeters > otherAppartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        return Math.abs(squareMeters * pricePerSquareMeter - otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return squareMeters * pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
    }
    
}

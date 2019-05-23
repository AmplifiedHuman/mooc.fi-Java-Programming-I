public class Product {
    
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + ", amount" + amountAtStart);
    }
}
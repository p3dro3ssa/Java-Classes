public class Product {
    static private double tax = 0.23;
    private double priceNetto;
    private String name;
    private int quantity;
    public Product(){
        priceNetto = 0;
        name = "";
        quantity = 0;
    }
    public Product(String name, double priceNetto, int quantity){
        this.name = name;
        this.priceNetto = priceNetto;
        this.quantity = quantity;
    }
    public double getPriceNetto() {
        return priceNetto;
    }
    public void setPriceNetto(double priceNetto) {
        this.priceNetto = priceNetto;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPriceBrutto(){
        return priceNetto+tax*priceNetto;
    }
}

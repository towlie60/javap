package igorPractice;

public class ShoppingCart {
    private String itemName;
    private double itemPrice;

    public ShoppingCart(String itemName) {
        this.itemName = itemName; }

    public ShoppingCart(String itemName , double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName; }

    public void setItemName(String itemName) { this.itemName = itemName; }
    public double getItemPrice() { return itemPrice; }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}

package estoque;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock () {
        return price * quantity;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

}

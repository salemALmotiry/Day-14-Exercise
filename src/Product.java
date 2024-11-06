import javax.swing.plaf.PanelUI;

public abstract class Product {

    private String name;
    private double price;



    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public Product() {}


    public abstract double getDiscount();



    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}

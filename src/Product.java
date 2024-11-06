import javax.swing.plaf.PanelUI;

public abstract class Product {

    private String name;
    private double price;



    public Product(String name, double price) {
        this.name = name;
        if (price<0){
            this.price = 0;
            System.out.println("Price is negative");
        }else
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
       if (price < 0) {
           this.price = 0;
           System.out.println("Price is negative");
       }else
        this.price = price;
    }

}

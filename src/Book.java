public class Book extends Product {
    private String Author;

    @Override
    public double getDiscount() {
        return super.getPrice() * 0.6;
    }


    public Book (String name, double price, String director) {
        super(name, price);
        this.Author = director;
    }

    public Book() {

    }


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

}

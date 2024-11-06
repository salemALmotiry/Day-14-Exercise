public class Movie extends Product {

    private String director;

    @Override
    public double getDiscount() {
        return super.getPrice() * 0.6;
    }


    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public Movie() {

    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

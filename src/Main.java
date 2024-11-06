public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Grey Wolf: A Novel",15.99,"Louise Penny");

        Movie movie1 = new Movie("The Batman",54.65,"Matt Reeves");

        System.out.println("Book: "+book1.getName()+
                            "\nAuthor: "+book1.getAuthor()+
                            "\nPrice: "+ book1.getPrice());
        System.out.println(book1.getPrice()+" Discount to "+book1.getDiscount());
        System.out.println("--------------------------------------------------");
        System.out.println("Movie: "+movie1.getName()+
                "\nDirector: "+movie1.getDirector()+
                "\nPrice: "+ movie1.getPrice());
        System.out.println(movie1.getPrice()+" Discount to "+movie1.getDiscount());

        System.out.println("-----------------------Moveable----------------------------");
        MoveablePoint arrow = new MoveablePoint(15,5,2,5);

        arrow.moveUp();
        arrow.moveLeft();
        arrow.moveDown();
        arrow.moveDown();
        arrow.moveDown();
        arrow.moveRight();





    }
}
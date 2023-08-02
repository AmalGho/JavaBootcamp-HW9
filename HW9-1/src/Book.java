public class Book extends Product {
    private String author;


    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    @Override
    public double getDiscount() {
        double discountPercent = 30 ;
        super.setPrice(getPrice() - (getPrice() * (discountPercent/100)));
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "\n"
                + "\n book name: " + getName()
                + "\n author: " + author
                + "\n price: " + getPrice()
                +"\n";
    }


    // *************   getters & setters   **********
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

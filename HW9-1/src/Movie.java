public class Movie extends Product{
    private String director;

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }


    @Override
    public double getDiscount() {
        double discountPercent = 20 ;
        super.setPrice(getPrice() - (getPrice() * (discountPercent/100)));
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "\n"
                + "\n movie name: " + getName()
                + "\n director: " + director
                + "\n price: " + getPrice()
                + "\n";
    }


    // *************   getters & setters   **********
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

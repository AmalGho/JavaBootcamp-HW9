import java.util.*;

public class Main {

    static List<Book> books;
    static List<Movie> movies;
    static Scanner user = new Scanner(System.in);
    static int option;
    public static void main(String[] args) {

        do {

            try {
                System.out.println("\n** Store Menu ** \n" +
                        "\n 1. Books" +
                        "\n 2. Movies" +
                        "\n press any other number to exit store.. " +
                        "\n\nSelect a number...");

                option = user.nextInt();

                if (option == 1) {

                    bookList();

                    System.out.println("choose a book now to get 30% discount");
                    option = user.nextInt();

                    for (int i = 1; i <=4 ; i++) {
                        if (option == i) {
                            books.get(i - 1).getDiscount();
                            System.out.println("\nthe discount applied :) \n"
                                    + books.get(i - 1));
                            break;
                        }
                    }
                } else if (option == 2) {
                    movieList();

                    System.out.println("choose a movie now to get 20% discount");
                    option = user.nextInt();

                    for (int i = 1; i <=4 ; i++) {
                        if (option == i) {
                            movies.get(i - 1).getDiscount();
                            System.out.println("\nthe discount applied :) \n"
                                    + movies.get(i - 1));
                            break;
                        }
                    }
                }else{
                    break;
                }
            }catch (InputMismatchException e) {
                System.out.println("enter only number");
                break;
            }

        }while (true);

        System.out.println("Thank you for visiting our store...");
    }



    public static void bookList() {
        Book book1 = new Book("The Possibility of Life", 200, "Jaime Green");
        Book book2 = new Book("Family Lore", 140, "Elizabeth Acevedo");
        Book book3 = new Book("Murder on the Orient Express", 100, "Agatha Christie");
        Book book4 = new Book("Death on The Nile", 300, "Agatha Christie");

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        books = list;
        System.out.println(list);

    }

    public static void movieList() {
        Movie movie1 = new Movie("Oppenheimer", 150, "Christopher Nolan");
        Movie movie2 = new Movie("Fringe", 120, "J.J. Abrams");
        Movie movie3 = new Movie("The Godfather part I", 130, "Francis Ford");
        Movie movie4 = new Movie("The Godfather part II", 150, "Francis Ford");

        List<Movie> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);
        movies = list;
        System.out.println(list);

    }
}
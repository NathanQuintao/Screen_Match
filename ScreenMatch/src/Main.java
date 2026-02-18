//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.yearOfRelease = 1970;
        myMovie.duration = 180;

        myMovie.displayTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(3);
        System.out.println(myMovie.sumOfReviews);
        System.out.println(myMovie.totalReviews);
        System.out.println(myMovie.avarageRating());
    }
}
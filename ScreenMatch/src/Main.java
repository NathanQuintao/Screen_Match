import br.com.alura.screenmatch.modelos.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setYearOfRelease(1970);
        myMovie.setDuration(180);

        myMovie.displayTechnicalSheet(); // chama método da classe br.com.alura.screenmatch.modelos.Movie
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(3);
        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        System.out.println(myMovie.avarageRating());

    }
}
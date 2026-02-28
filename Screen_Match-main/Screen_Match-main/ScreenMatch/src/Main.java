//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setYearOfRelease(1970);
        myMovie.setDuration(180);
        System.out.println("Duração do Filme: " + myMovie.getDuration());

        myMovie.displayTechnicalSheet();
        myMovie.evaluate((double)8.0F);
        myMovie.evaluate((double)5.0F);
        myMovie.evaluate((double)3.0F);
        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        System.out.printf("%.2f\n", myMovie.avarageRating());
        System.out.println("myMovie = " + String.valueOf(myMovie));

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setYearOfRelease(2000);
        lost.displayTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpsBySeason(10);
        lost.setMinByEpisodes(50);
        System.out.println("Total de minutos da Série: " + lost.getDuration());

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setYearOfRelease(2023);
        otherMovie.setDuration(200);
        System.out.println("Duração do Filme: " + otherMovie.getDuration());



        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(otherMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());



    }
}
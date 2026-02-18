public class Movie {
    String name;
    int yearOfRelease;
    boolean includedInPlan;
    double sumOfReviews;
    int totalReviews;
    int duration;

    void displayTechnicalSheet() {

        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento:" + yearOfRelease);
    }

    void evaluate(double note) {
        sumOfReviews += note;
        totalReviews++;
    }

    double avarageRating() {
        return sumOfReviews / totalReviews;
    }

}

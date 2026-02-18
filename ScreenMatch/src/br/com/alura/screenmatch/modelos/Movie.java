package br.com.alura.screenmatch.modelos;

public class Movie {
    private String name;
    private int yearOfRelease;
    private boolean includedInPlan;
    private double sumOfReviews;
    private int totalReviews;
    private int duration;

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean getIncludedInPlan() {
        return includedInPlan;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalReviews() { //getter usado para buscar valores
        return totalReviews;
    }

    public void setName(String name) { // setter usado para setar valores
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void displayTechnicalSheet() {

        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento:" + yearOfRelease);
    }

    public void evaluate(double note) {
        sumOfReviews += note;
        totalReviews++;
    }

    public double avarageRating() {
        return sumOfReviews / totalReviews;
    }


}

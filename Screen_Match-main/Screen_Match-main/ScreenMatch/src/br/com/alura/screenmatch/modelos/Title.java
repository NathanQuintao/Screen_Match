//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int yearOfRelease;
    private boolean includedInPlan;
    private double sumOfReviews;
    private int totalReviews;
    private int duration;

    public String getName() {
        return this.name;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public boolean getIncludedInPlan() {
        return this.includedInPlan;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getTotalReviews() {
        return this.totalReviews;
    }

    public void setName(String name) {
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
        System.out.println("Nome do Filme: " + this.name);
        System.out.println("Ano de Lançamento:" + this.yearOfRelease);
    }

    public void evaluate(double note) {
        this.sumOfReviews += note;
        ++this.totalReviews;
    }

    public double avarageRating() {
        return this.sumOfReviews / (double)this.totalReviews;
    }
}

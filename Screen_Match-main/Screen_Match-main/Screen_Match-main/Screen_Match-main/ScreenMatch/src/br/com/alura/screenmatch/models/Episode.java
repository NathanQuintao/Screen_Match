package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Serie serie;
    private int viewTotals;

    public int getViewTotals() {
        return viewTotals;
    }

    public void setViewTotals(int viewTotals) {
        this.viewTotals = viewTotals;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getClassification() {
        if (viewTotals >= 1000) {
            return 4;
        } else {
            return 2;
        }
    }
}

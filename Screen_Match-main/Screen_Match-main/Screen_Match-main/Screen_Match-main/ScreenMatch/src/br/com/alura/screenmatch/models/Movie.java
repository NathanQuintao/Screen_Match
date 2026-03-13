package br.com.alura.screenmatch.models;


import br.com.alura.screenmatch.calculation.Classification;

public class Movie extends Title implements Classification {
    private String Diretor;

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) avarageRating() / 2 ;
    }
}




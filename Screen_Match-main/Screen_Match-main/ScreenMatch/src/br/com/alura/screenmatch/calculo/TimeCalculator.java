package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Movie m) {
//        totalTime += m.getDuration();
//    }
//    public void include(Serie s) {
//        totalTime += s.getDuration();
//    }

    public void include(Title title) {
        System.out.println("Adicionando duração em minutos de: " + title);
        this.totalTime += title.getDuration();
    }
}

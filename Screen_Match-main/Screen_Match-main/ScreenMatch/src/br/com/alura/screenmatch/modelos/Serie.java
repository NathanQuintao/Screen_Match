//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.alura.screenmatch.modelos;

    public class Serie extends Title {
    private int seasons;
    private int epsBySeason;
    private boolean active;
    private int minByEpisodes;

    public int getSeasons() {
        return this.seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getMinByEpisodes() {
        return this.minByEpisodes;
    }

    public void setMinByEpisodes(int minByEpisodes) {
        this.minByEpisodes = minByEpisodes;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpsBySeason() {
        return this.epsBySeason;
    }

    public void setEpsBySeason(int epsBySeason) {
        this.epsBySeason = epsBySeason;
    }

    @Override
    public int getDuration() {
        return this.seasons * this.epsBySeason * this.minByEpisodes;
    }
}

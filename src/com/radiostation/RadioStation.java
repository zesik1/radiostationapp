package com.radiostation;

public class RadioStation {
    private Song[] songs;

    public RadioStation() {
    }

    public RadioStation(Song[] songs) {
        this.songs = songs;
    }
    public Song[] getSongs() {
        return songs;
    }
    public void setSongs(Song[] songs) {
        this.songs = songs;
    }
    public Song[] getSimilar(String songTitle) {
        for (Song element : songs) {
//        for (int i=0; i < 15; i++){
            if (songTitle.equalsIgnoreCase(element.getTitle())) {
                System.out.println("song exists");
            } else {
                System.out.println("song does not exist");
            }
        }
        return songs;
    }
    protected double distance(Song s1, Song s2) {
// Επιστρέφει την απόσταση δύο τραγουδιών
// με βάση την Ευκλείδεια απόσταση των
// βαρών των μουσικών κατηγοριών τουs
        double s = 0;
        return s;
    }
}

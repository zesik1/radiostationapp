package com.radiostation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        performSongs();

    }

    static void performSongs() {
        Song[] songs = new Song[15];
        songs[0] = create("Wonderwall", "Oasis", new double[]{90, 10, 0, 0, 0, 0});
        songs[1] = create("Don't look back in anger", "Oasis", new double[]{80, 0, 10, 0, 0, 0});
        songs[2] = create("Money", "Pink Floyd", new double[]{50, 20, 10, 0, 20 , 0});
        songs[3] = create("Catholic girls", "Frank Zappa", new double[]{30, 10, 30, 30, 0 , 0});
        songs[4] = create("Stairway to heaven", "Led Zeppelin", new double[]{80, 0, 20, 0, 0 , 0});
        songs[5] = create("Perfect strangers", "Deep Purple", new double[]{100, 0, 0, 0, 0 , 0});
        songs[6] = create("Purple rain", "Prince", new double[]{10, 80, 10, 0, 0 , 0});
        songs[7] = create("Back in black", "AC DC", new double[]{100, 0, 0, 0, 0 , 0});
        songs[8] = create("The thrill is gone", "BB King", new double[]{0, 0, 100, 0, 0 , 0});
        songs[9] = create("I'd rather go blind", "Etta James", new double[]{0, 0, 60, 40, 0 , 0});
        songs[10] = create("With or without you", "U2", new double[]{40, 20, 40, 0, 0 , 0});
        songs[11] = create("Heroes", "David Bowie", new double[]{40, 10, 30, 10, 10 , 0});
        songs[12] = create("Free Bird", "Lynyrd Skynyrd", new double[]{90, 10, 0, 0, 0, 0});
        songs[13] = create("Always", "Bon Jovi", new double[]{50, 30, 20, 0, 0, 0});
        songs[14] = create("Happy when it rains", "The Jesus and Mary Chain", new double[]{40, 60, 0, 0, 0, 0});
        System.out.println(Arrays.toString(songs[1].getWeights()));

    }
    private static Song create(String title, String artist, double[] weights) {
        Song songs = new Song();
        songs.setTitle(title);
        songs.setArtist(artist);
        songs.setWeights(weights);
        return songs;
    }
}
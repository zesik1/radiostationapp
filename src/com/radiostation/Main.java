package com.radiostation;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        performSongs();
        RadioStation radio = new RadioStation();
        Scanner scannerObject = new Scanner(System.in);
        String userChoice = scannerObject.nextLine();
        System.out.println(radio.getSimilar(userChoice));

    }

    static void performSongs() {
        Song[] songs = new Song[15];
        songs[0] = new Song("Wonderwall", "Oasis", new double[]{90, 10, 0, 0, 0, 0});
        songs[1] = new Song("Don't look back in anger", "Oasis", new double[]{80, 0, 10, 0, 0, 0});
        songs[2] = new Song("Money", "Pink Floyd", new double[]{50, 20, 10, 0, 20 , 0});
        songs[3] = new Song("Catholic girls", "Frank Zappa", new double[]{30, 10, 30, 30, 0 , 0});
        songs[4] = new Song("Stairway to heaven", "Led Zeppelin", new double[]{80, 0, 20, 0, 0 , 0});
        songs[5] = new Song("Perfect strangers", "Deep Purple", new double[]{100, 0, 0, 0, 0 , 0});
        songs[6] = new Song("Purple rain", "Prince", new double[]{10, 80, 10, 0, 0 , 0});
        songs[7] = new Song("Back in black", "AC DC", new double[]{100, 0, 0, 0, 0 , 0});
        songs[8] = new Song("The thrill is gone", "BB King", new double[]{0, 0, 100, 0, 0 , 0});
        songs[9] = new Song("I'd rather go blind", "Etta James", new double[]{0, 0, 60, 40, 0 , 0});
        songs[10] = new Song("With or without you", "U2", new double[]{40, 20, 40, 0, 0 , 0});
        songs[11] = new Song("Heroes", "David Bowie", new double[]{40, 10, 30, 10, 10 , 0});
        songs[12] = new Song("Free Bird", "Lynyrd Skynyrd", new double[]{90, 10, 0, 0, 0, 0});
        songs[13] = new Song("Always", "Bon Jovi", new double[]{50, 30, 20, 0, 0, 0});
        songs[14] = new Song("Happy when it rains", "The Jesus and Mary Chain", new double[]{40, 60, 0, 0, 0, 0});
//        System.out.println(Arrays.toString(songs[1].getWeights()));


    }

}
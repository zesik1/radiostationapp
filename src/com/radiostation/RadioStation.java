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
// η μέθοδος αυτήν θα πρέπει να επιστρέφει έναν πίνακα με
// τα τραγούδια του σταθμού διατεταγμένα με βάση την απόστασή
// τους με το τραγούδι με τον τίτλο που δίνεται. Πρώτα θα
// είναι το τραγούδι που δόθηκε,
// δεύτερο αυτό με την μικρότερη απόσταση,
// τρίτο αυτό με την αμέσως μικρότερη απόσταση κ.ο.κ.
// Αν δεν μπορεί να βρεθεί το τραγούδι με αυτόν τον τίτλο
// τότε θα πρέπει να βγαίνει σχετικό μήνυμα λάθους και να
// επιστρέφεται null.
// Η απόσταση υπολογίζεται καλώντας την προστατευμένη βοηθητική
// μέθοδο distance
        return null;
    }
    protected double distance(Song s1, Song s2) {
// Επιστρέφει την απόσταση δύο τραγουδιών
// με βάση την Ευκλείδεια απόσταση των
// βαρών των μουσικών κατηγοριών τουs
        double s = 0;
        return s;
    }
}

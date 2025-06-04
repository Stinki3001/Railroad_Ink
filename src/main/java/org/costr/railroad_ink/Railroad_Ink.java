package org.costr.railroad_ink;

import java.io.IOException;
import java.util.ArrayList;

import javazoom.jl.decoder.JavaLayerException;

public class Railroad_Ink {

    // ArrayList<Integer> Alle_Feld = new ArrayList<>();
    Würfel wuerfel1;

    Würfel wuerfel2;
    private int round;

    Railroad_Ink() {

    }

    void init() throws IOException {
        // Initialize the game state
        System.out.println("Initializing Railroad Ink game...");
        new Thread(new RailroadMusicThread()).start();
        ArrayList<Feld> list1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list1.add(new Feld(i));
        }
        list1.forEach(e -> {
            System.out.println(e.getName());
        });
        wuerfel1 = new Würfel(list1);
        ArrayList<Feld> list2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            list2.add(new Feld(6));
            list2.add(new Feld(7));
            list2.add(new Feld(8));
        }
        list2.forEach(e -> {
            System.out.println(e.getName());
        });
        wuerfel2 = new Würfel(list2);

    }

    int getRunde() {
        return round;
    }

    void setRound(int round) {
        this.round = round;
    }

    private static class RailroadMusicThread extends Thread {

        private RailroadMusicThread() {
            setDaemon(true);
            setName("Play Music In The Background");
        }

        @Override
        public void run() {
            try {
                while (true) {
                    MP3Player player = new MP3Player(
                            Railroad_Ink.class.getResourceAsStream("/Railroad-Ink-Track1.mp3"));
                    player.play();
                }
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }
    }
}
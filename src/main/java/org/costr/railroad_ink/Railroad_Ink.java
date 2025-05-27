package org.costr.railroad_ink;

/**
 *
 * @author costr
 */

// import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;

import javazoom.jl.decoder.JavaLayerException;

public class Railroad_Ink {

    // ArrayList<Integer> Alle_Feld = new ArrayList<>();

    public Feld würfen() throws IOException {
        Random ran = new Random();
        int index = ran.nextInt(Feld.ANZ_FELDER);
        Feld feld = new Feld(index);
        System.out.println("Feld: " + feld.getName());
        return feld;
    }

    Railroad_Ink() {

    }

    void init() {
        // Initialize the game state
        System.out.println("Initializing Railroad Ink game...");
        new Thread(new RailroadMusicThread()).start();
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
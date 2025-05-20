package org.costr.railroad_ink;

/**
 *
 * @author costr
 */

// import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;

public class Railroad_Ink {

    // ArrayList<Integer> Alle_Feld = new ArrayList<>();

    public Feld würfen() throws IOException {
        Random ran = new Random();
        int index = ran.nextInt(Feld.ANZ_FELDER);
        return new Feld(index);
    }

    Railroad_Ink() {

    }
}
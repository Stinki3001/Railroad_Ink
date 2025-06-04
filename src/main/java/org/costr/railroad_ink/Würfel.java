package org.costr.railroad_ink;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Würfel {

    private int anzSeiten;
    private ArrayList<Feld> möglichkeiten;

    public Würfel(ArrayList<Feld> moglichkeiten) {
        this.möglichkeiten = moglichkeiten;
        this.anzSeiten = 6;
    }

    public Feld würfeln() throws IOException {
        Random ran = new Random();
        int index = ran.nextInt(anzSeiten);
        Feld feld = möglichkeiten.get(index);
        System.out.println("Feld: " + feld.getName());
        return feld;
    }

}

// class möglichkeiten {

// }

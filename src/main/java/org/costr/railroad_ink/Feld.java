package org.costr.railroad_ink;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * @author costr
 */
public class Feld {

    private int id;
    private String name;
    private Image image;

    public static final int ANZ_FELDER = 9;

    /**
     * Constructor for the Feld class.
     *
     * @param index The index of the field type to create.
     * @throws IOException If there is an error reading the image file.
     */

    Feld() {
        // Default constructor
    }

    Feld(int index) throws IOException {
        switch (index) {
            case 0 -> ZugKurve();
            case 1 -> ZugKreuzung();
            case 2 -> ZugGerade();
            case 3 -> StraßeKurve();
            case 4 -> StraßeKreuzung();
            case 5 -> StraßeGerade();
            case 6 -> StraßeMitBrücke();
            case 7 -> BahnhofGerade();
            case 8 -> BahnhofKurve();
            default -> throw new IllegalArgumentException("Invalid index: " + index);
        }
    }

    private void ZugKurve() throws IOException {
        this.id = 0;
        this.name = "ZugKurve";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Zug_Kurve.JPG"));
    }

    private void ZugKreuzung() throws IOException {
        this.id = 1;
        this.name = "ZugKreuzung";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Zug_Kreuzung.JPG"));
    }

    private void ZugGerade() throws IOException {
        this.id = 2;
        this.name = "ZugGerade";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Zug_Gerade.JPG"));
    }

    private void StraßeKurve() throws IOException {
        this.id = 3;
        this.name = "StraßeKurve";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Strasse_Kurve.JPG"));
    }

    private void StraßeKreuzung() throws IOException {
        this.id = 4;
        this.name = "StraßeKreuzung";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Strasse_Kreuzung.JPG"));
    }

    private void StraßeGerade() throws IOException {
        this.id = 5;
        this.name = "StraßeGerade";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Strasse_Gerade.JPG"));
    }

    private void StraßeMitBrücke() throws IOException {
        this.id = 6;
        this.name = "Straße mit Brücke";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Strasse_Mit_Bruecke.JPG"));
    }

    private void BahnhofGerade() throws IOException {
        this.id = 7;
        this.name = "BahnhofGerade";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Bahnhof_Gerade.JPG"));
    }

    private void BahnhofKurve() throws IOException {
        this.id = 8;
        this.name = "BahnhofKurve";
        this.image = ImageIO.read(getClass().getResourceAsStream("/Bahnhof_Kurve.JPG"));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }
}
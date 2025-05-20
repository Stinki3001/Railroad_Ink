
// import java.util.ArrayList;
import java.util.Random;

public class Railroad_Ink {

    // ArrayList<Integer> Alle_Feld = new ArrayList<>();

    public Feld würfen() {
        Random ran = new Random();
        int index = ran.nextInt(Feld.ANZ_FELDER);
        return new Feld().Feld(index);
    }

    Railroad_Ink() {

    }
}
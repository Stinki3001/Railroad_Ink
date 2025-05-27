package org.costr.railroad_ink;

/**
 * @author costr
 */
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class MP3Player {

    AdvancedPlayer player;

    @SuppressWarnings("CallToPrintStackTrace")
    public MP3Player(InputStream stream) throws JavaLayerException {

        player = new AdvancedPlayer(stream);
        player.play();
    }

    void play() throws JavaLayerException {
        player.play();
    }

}

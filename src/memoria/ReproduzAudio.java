package memoria;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ReproduzAudio {

    public void playAudio(String strCaractere) {

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(strCaractere)));
            clip.start();

        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }

    }
}

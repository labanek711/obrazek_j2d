package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Muzyka {
    public static void Muza() {
        File muzyka = new File("./Muzyka/pacman.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(muzyka);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            //zapetlenie
          //  clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

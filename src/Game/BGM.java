package Game;

import java.io.*;
import javax.sound.sampled.*;

public class BGM {
    Clip c = null;

    public void play() {
        // 声音文件支持WAV、AU、AIFF、AIFC、SND格式的
        final String f = "src\\BGM\\配乐-宁静舒适.wav";
        try {
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(new File(f)));
            c.start();
        } catch (Exception e) {

        }
    }

    public void stop() {
        try {
            c.stop();
        } catch (Exception e) {

        }
    }
}

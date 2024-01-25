package Main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    Clip clip;
    URL soundURL[] = new URL[30];

    public Sound(){
        soundURL[0] = getClass().getResource("/res/sound/coffee.wav");
        soundURL[1] = getClass().getResource("/res/sound/danceClub.wav");
        soundURL[2] = getClass().getResource("/res/sound/pizzaParlor.wav");
        soundURL[3] = getClass().getResource("/res/sound/giftShop.wav");
    }

    public void setFile(int i){
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro ao carregar o som");
        }

    }
    public void play(){
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        if(clip.isRunning() && clip != null){
            clip.stop();
        } else{
            System.out.println("Não há som para parar");
        }
            
    }
}

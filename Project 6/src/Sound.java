import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.sun.tools.javac.Main;

public class Sound {

	//public static Clip clip;
	//private String soundfile;
	private File soundFile;
	private Clip clip;
	
	public Sound(String filename) {
		soundFile = new File(filename);
		//playClip(soundFile);
		
	}
	
	public void playClip(File sound) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			
			//Thread.sleep(clip.getMicrosecondLength()/1000);
		}
		catch(LineUnavailableException lue ) { lue.printStackTrace(); }
		 catch(UnsupportedAudioFileException lute) { lute.printStackTrace(); }
		 catch(IOException ioe) { ioe.printStackTrace(); }
		
		clip.start();
	}
	public File getFile() {
		return soundFile;
	}
		/**
		Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
		Mixer mixer = AudioSystem.getMixer(mixInfos[4]);
		DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
		try { clip = (Clip)mixer.getLine(dataInfo);}
		 catch(LineUnavailableException lue) { lue.printStackTrace(); }
		try {
			 URL soundURL = Main.class.getResource(soundfile);
			 AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
			 clip.open(audioStream);
		 }
		 catch(LineUnavailableException lue ) { lue.printStackTrace(); }
		 catch(UnsupportedAudioFileException lute) { lute.printStackTrace(); }
		 catch(IOException ioe) { ioe.printStackTrace(); }
		 
		 clip.start();
		 
		 do
		 {
			 try {Thread.sleep(50); }
			 catch(InterruptedException ie) {ie.printStackTrace(); }
		 }
		 while (clip.isActive());
	}*/
}

import java.awt.GridLayout;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.tools.javac.Main;

public class MainFrame extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> names;
	public static Mixer mixer;
	public static Clip clip;
	JLabel voice2hear = new JLabel("Pick the voice you would like to hear:");
	JPanel audioPanel = new JPanel(); 
	private static String[] personSelect = {"Ali", "Beau", "Christian", "Cy", "Dorothy", "Harris", "Jeremy"};
	private JButton phrase1 = new JButton("Phrase 1");
	private JButton phrase2 = new JButton("Phrase 2");
	private JButton phrase3 = new JButton("Phrase 3");
	private JButton phrase4 = new JButton("Phrase 4");
	private JButton phrase5 = new JButton("Phrase 5");
	private JButton phrase6 = new JButton("Phrase 6");
	JPanel stationPanel = new JPanel(new GridLayout(1, 3));
	JLabel pickStations = new JLabel("Pick two Stations:");
	JComboBox<String> stations1;
	JComboBox<String> stations2;
	GridLayout audioLayout = new GridLayout(4, 2);
	JButton aDiff = new JButton("Calc DIfference");
	JButton aSum = new JButton("Calc Sum");
	JButton aProduct = new JButton("Calc Product");
	JButton aQuotient = new JButton("Calc Quotient");
	JTextField answer = new JTextField();
	
	public MainFrame() throws IOException {
		super("Project 6");
		setLayout(new GridLayout(2, 2));
		names = new JComboBox<String>(personSelect);
		names.addActionListener((e) -> {
			if (names.getSelectedItem() == "Ali") {
				FormData fd1 = new FormData();
				fd1.setAliValues();
				String[] aliPhrases = fd1.getAliValues();
				phrase1.setText(aliPhrases[0]);
				phrase2.setText(aliPhrases[1]);
				phrase3.setText(aliPhrases[2]);
				phrase4.setText(aliPhrases[3]);
				phrase5.setText(aliPhrases[4]);
				phrase6.setText(aliPhrases[5]);
			}
			if (names.getSelectedItem() == "Beau") {
				FormData fd2 = new FormData();
				fd2.setBeauValues();
				String[] beauPhrases = fd2.getBeauValues();
				phrase1.setText(beauPhrases[0]);
				phrase2.setText(beauPhrases[1]);
				phrase3.setText(beauPhrases[2]);
				phrase4.setText(beauPhrases[3]);
				phrase5.setText(beauPhrases[4]);
				phrase6.setText(beauPhrases[5]);
			}
			if (names.getSelectedItem() == "Christian") {
				FormData fd3 = new FormData();
				fd3.setChristianValues();
				String[] christianPhrases = fd3.getChristianValues();
				phrase1.setText(christianPhrases[0]);
				phrase2.setText(christianPhrases[1]);
				phrase3.setText(christianPhrases[2]);
				phrase4.setText(christianPhrases[3]);
				phrase5.setText(christianPhrases[4]);
				phrase6.setText(christianPhrases[5]);
			}
			if (names.getSelectedItem() == "Cy") {
				FormData fd4 = new FormData();
				fd4.setCyValues();
				String[] cyPhrases = fd4.getCyValues();
				phrase1.setText(cyPhrases[0]);
				phrase2.setText(cyPhrases[1]);
				phrase3.setText(cyPhrases[2]);
				phrase4.setText(cyPhrases[3]);
				phrase5.setText(cyPhrases[4]);
				phrase6.setText(cyPhrases[5]);
			}
			if (names.getSelectedItem() == "Dorothy") {
				FormData fd5 = new FormData();
				fd5.setDorothyValues();
				String[] dorothyPhrases = fd5.getDorothyValues();
				phrase1.setText(dorothyPhrases[0]);
				phrase2.setText(dorothyPhrases[1]);
				phrase3.setText(dorothyPhrases[2]);
				phrase4.setText(dorothyPhrases[3]);
				phrase5.setText(dorothyPhrases[4]);
				phrase6.setText(dorothyPhrases[5]);
			}
			if (names.getSelectedItem() == "Harris") {
				FormData fd6 = new FormData();
				fd6.setHarrisValues();
				String[] harrisPhrases = fd6.getHarrisValues();
				phrase1.setText(harrisPhrases[0]);
				phrase2.setText(harrisPhrases[1]);
				phrase3.setText(harrisPhrases[2]);
				phrase4.setText(harrisPhrases[3]);
				phrase5.setText(harrisPhrases[4]);
				phrase6.setText(harrisPhrases[5]);
			}
			if (names.getSelectedItem() == "Jeremy") {
				FormData fd7 = new FormData();
				fd7.setJeremyValues();
				String[] jeremyPhrases = fd7.getJeremyValues();
				phrase1.setText(jeremyPhrases[0]);
				phrase2.setText(jeremyPhrases[1]);
				phrase3.setText(jeremyPhrases[2]);
				phrase4.setText(jeremyPhrases[3]);
				phrase5.setText(jeremyPhrases[4]);
				phrase6.setText(jeremyPhrases[5]);
			}
		});
		phrase1.addActionListener((e) -> {
			if (phrase1.getText() == "Come on, guy") {
				//play audio
			}
			if (phrase1.getText() == "What's pop") {
				//play audio
			}
			if (phrase1.getText() == "That's fair") {
				playChristianClip("That's fair");
			}
			if (phrase1.getText() == "Dorothy hungry") {
				//play audio
			}
			if (phrase1.getText() == "Heard that bet") {
				//play audio
			}
			if (phrase1.getText() == "Anime is trash") {
				//play audio
			}
			if (phrase1.getText() == "(insert ali phrase)") {
				//play audio
			}
		});
		phrase2.addActionListener((e) -> {
			if (phrase2.getText() == "Time to get this plata") {
				//play audio
			}
			if (phrase2.getText() == "Bet that") {
				//play audio
			}
			if (phrase2.getText() == "Oh yeah, dawg") {
				playChristianClip("Oh yeah");
			}
			if (phrase2.getText() == "Hold my hand") {
				//play audio
			}
			if (phrase2.getText() == "Big RIP") {
				//play audio
			}
			if (phrase2.getText() == "(insert ali phrase)") {
				//play audio
			}
			if (phrase2.getText() == "(insert jeremy phrase)") {
				//play audio
			}
		});
		phrase3.addActionListener((e) -> {
			if (phrase3.getText() == "That's wild") {
				//play audio
			}
			if (phrase3.getText() == "Oh for sure, no doubt") {
				//play audio
			}
			if (phrase3.getText() == "What's Gucc") {
				//play audio
			}
			if (phrase3.getText() == "You're cancer") {
				//play audio
			}
			if (phrase3.getText() == "RIP") {
				//play audio
			}
			if (phrase3.getText() == "(insert ali phrase)") {
				//play audio
			}
			if (phrase3.getText() == "(insert jeremy phrase)") {
				//play audio
			}
		});
		phrase4.addActionListener((e) -> {
			if (phrase4.getText() == "Trying to make that banko") {
				//play audio
			}
			if (phrase4.getText() == "No complaints") {
				//play audio
			}
			if (phrase4.getText() == "Let's get it") {
				//play audio
			}
			if (phrase4.getText() == "No") {
				//play audio
			}
			if (phrase4.getText() == "Small RIP") {
				//play audio
			}
			if (phrase4.getText() == "(insert ali phrase)") {
				//play audio
			}
			if (phrase4.getText() == "(insert jeremy phrase)") {
				//play audio
			}
		});
		phrase5.addActionListener((e) -> {
			if (phrase5.getText() == "I'm about to K.O.") {
				//play audio
			}
			if (phrase5.getText() == "Don't even trip") {
				//play audio
			}
			if (phrase5.getText() == "Goteeeee") {
				//play audio
			}
			if (phrase5.getText() == "Moreover") {
				//play audio
			}
			if (phrase5.getText() == "Unfortunate") {
				//play audio
			}
			if (phrase5.getText() == "(insert ali phrase)") {
				//play audio
			}
			if (phrase5.getText() == "(insert jeremy phrase)") {
				//play audio
			}
		});
		phrase6.addActionListener((e) -> {
			if (phrase6.getText() == "We are golden") {
				//play audio
			}
			if (phrase6.getText() == "I gotchu, brother") {
				//play audio
			}
			if (phrase6.getText() == "Let me get that thang (JUUL)") {
				//play audio
			}
			if (phrase6.getText() == "Please cuddle me") {
				//play audio
			}
			if (phrase6.getText() == "That's dope") {
				//play audio
			}
			if (phrase6.getText() == "(insert ali phrase)") {
				//play audio
			}
			if (phrase6.getText() == "(insert jeremy phrase)") {
				//play audio
			}
		});
		audioPanel.setLayout(audioLayout);
		audioPanel.add(voice2hear);
		audioPanel.add(names);
		audioPanel.add(phrase1);
		audioPanel.add(phrase2);
		audioPanel.add(phrase3);
		audioPanel.add(phrase4);
		audioPanel.add(phrase5);
		audioPanel.add(phrase6);
		StationCalculator sc = new StationCalculator();
		ArrayList<String> stationIDs = sc.getStations();
		String[] s = new String[stationIDs.size()];
		for (int i = 0; i < stationIDs.size(); ++i) {
			s[i] = stationIDs.get(i);
		}
		stations1 = new JComboBox<String>(s);
		stationPanel.add(pickStations);
		stationPanel.add(stations1);
		stations2 = new JComboBox<String>(s);
		stationPanel.add(stations2);
		answer.setEditable(false);
		stationPanel.add(aDiff);
		stationPanel.add(aSum);
		stationPanel.add(aProduct);
		stationPanel.add(aQuotient);
		stationPanel.add(answer);
		aDiff.addActionListener((e) -> {
				try {
					StationCalculator diff = new StationCalculator();
					int d1 = diff.calAverage(stations1.getSelectedItem().toString());
					int d2 = diff.calAverage(stations2.getSelectedItem().toString());
					int d = d1-d2;
					answer.setText("" + d);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		aSum.addActionListener((e) -> {
				try {
					StationCalculator sum = new StationCalculator();
					int s1 = sum.calAverage(stations1.getSelectedItem().toString());
					int s2 = sum.calAverage(stations2.getSelectedItem().toString());
					int sm = s1 + s2;
					answer.setText("" + sm);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		aProduct.addActionListener((e) -> {
				try {
					StationCalculator product = new StationCalculator();
					int p1 = product.calAverage(stations1.getSelectedItem().toString());
					int p2 = product.calAverage(stations2.getSelectedItem().toString());
					int prod = p1 * p2;
					answer.setText("" + prod);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		aQuotient.addActionListener((e) -> {
				try {
					StationCalculator quotient = new StationCalculator();
					int q1 = quotient.calAverage(stations1.getSelectedItem().toString());
					int q2 = quotient.calAverage(stations2.getSelectedItem().toString());
					int quot = (int) q1/q2;
					answer.setText("" + quot);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		this.add(audioPanel);
		this.add(stationPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		
	}
	public static void playChristianClip(String p) {
		if (p == "That's fair") {
		Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
		 mixer = AudioSystem.getMixer(mixInfos[4]);
		 
		 DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
		 try { clip = (Clip)mixer.getLine(dataInfo);}
		 catch(LineUnavailableException lue) { lue.printStackTrace(); }
		 
		 try {
			 URL soundURL = Main.class.getResource("That_s Fair(Christian).wav");
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
		 }while (clip.isActive());
		}
		if (p == "Oh yeah") {
			Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
			 mixer = AudioSystem.getMixer(mixInfos[4]);
			 
			 DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
			 try { clip = (Clip)mixer.getLine(dataInfo);}
			 catch(LineUnavailableException lue) { lue.printStackTrace(); }
			 
			 try {
				 URL soundURL = Main.class.getResource("Oh yeah, dawg(Christian).wav");
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
			 }while (clip.isActive());
		}
	}
	public static void main(String[] args) throws IOException {
		new MainFrame();
	}
	
	
	

	
}

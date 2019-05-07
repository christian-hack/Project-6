import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> names;
	private ArrayList<FormData> phrases = new ArrayList<FormData>();
	JLabel voice2hear = new JLabel("Pick the voice you would like to hear:");
	JPanel audioPanel = new JPanel(new GridLayout(4, 2)); 
	private static String[] personSelect = {"Ali", "Beau", "Christian", "Cy", "Dorothy", "Harris", "Jeremy"};
	private JButton phrase1;
	private JButton phrase2;
	private JButton phrase3;
	private JButton phrase4;
	private JButton phrase5;
	private JButton phrase6;
	JPanel stationPanel = new JPanel(new GridLayout(1, 3));
	JLabel pickStations = new JLabel("Pick two Stations:");
	JComboBox<String> stations;
	
	public MainFrame() {
		super("Project 6");
		setLayout(new GridLayout(4, 2));
		names = new JComboBox<String>(personSelect);
		audioPanel.add(voice2hear);
		audioPanel.add(names);
		audioPanel.add(phrase1);
		audioPanel.add(phrase2);
		audioPanel.add(phrase3);
		audioPanel.add(phrase4);
		audioPanel.add(phrase5);
		audioPanel.add(phrase6);
		this.add(audioPanel);
		
		
		
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		
	}
	
	
	

	
}

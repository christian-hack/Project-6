import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StationCalculator {

	private ArrayList<String> stations = new ArrayList<String>();
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	File file = new File("Mesonet.txt");
	
	public StationCalculator() throws IOException 
	{
		read();
		
	}
	
	public void read() throws IOException
	{
		Scanner bw = new Scanner(file);
		String temp = "";
		bw.nextLine();
		bw.nextLine();
		bw.nextLine();
		bw.nextLine();
		
		while (bw.hasNextLine())
		{
			temp = bw.next();
			stations.add(temp);
			bw.nextLine();
		}
		bw.close();
	}
	public ArrayList<String> getStations() {
		return stations;
	}
public int calAverage(String station) {
	
		int a = alphabet.indexOf(station.charAt(0)) + 64;
		int b = alphabet.indexOf(station.charAt(1)) + 64;
		int c = alphabet.indexOf(station.charAt(2)) + 64;
		int d = alphabet.indexOf(station.charAt(3)) + 64;
		
		double ave = (a + b + c + d)/4;
		int average = (int)(Math.ceil(ave) + 2);
		
		return average;
	}
}

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.Main;

public class StationCalculator {

	private ArrayList<String> stations = new ArrayList<String>();
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
}

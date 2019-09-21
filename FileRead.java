package bankaccountapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileRead {
	private static BufferedReader br;

	public static List<String[]> reader(String file){
		List<String[]> data = new LinkedList<>();

		try {
			br = new BufferedReader(new FileReader(file));
			String dataLine;
			while((dataLine = br.readLine()) != null) {
				String[] dataRecords = dataLine.split(",");
				data.add(dataRecords);
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("FILE NOT FOUND! Enter the correct path") ;
				e.printStackTrace();
			}
			catch (IOException e) {
				System.out.println("UNABLE TO READ FILE!") ;
				e.printStackTrace();
			}
		
		
			return data;
	}
}

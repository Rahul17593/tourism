import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PlaceList {

	
	public String[] WBplaceList() {
		String fileName = "masterFile.txt";
		int i = 1;
		String placeName[] = new String[21];
		
		ArrayList<String> placeName1 = new ArrayList<>();
		
		String line = null;
		placeName[0] = "";
		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);


			while ((line = bufferedReader.readLine()) != null) {

				// \\s+ means any number of whitespaces between tokens
				String[] tokens = line.split("\\s+");
				float lat = Float.parseFloat(tokens[0]);
				
				float lon = Float.parseFloat(tokens[1]);
			
				String place = tokens[2];
				
				
				//System.out.println(station);
				placeName1.add(place);
				
				placeName[i]= place;
				//System.out.println(stName[i]);
				i++;
			}
			
		
	

			// Always close files.
			bufferedReader.close();
		
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			 ex.printStackTrace();
		}
       Arrays.sort(placeName);
		//System.out.println();
		
		placeName[0] = "---Select---";
		
		return placeName;

	
}
}
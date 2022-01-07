package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadDataFromCSV {
	
	private String[] serverDetails;
	private String[] lineData;
	//as per the server name getting the url, user name and password
	public String[] getUrlfromCSV(String server) {
		
		try {
			FileReader obj_FileReader=new FileReader(System.getProperty("user.dir")+"/src/test/resources/docments/data.csv");
			CSVReader obj_CsvReader=new CSVReader(obj_FileReader);
			
		lineData=obj_CsvReader.readNext();
		
		while(lineData!=null) {
			
			if(lineData[0].equalsIgnoreCase(server)) {
				serverDetails[0]=lineData[1];
				serverDetails[1]=lineData[2];
				serverDetails[2]=lineData[3];
				
				break;
			}
			lineData=obj_CsvReader.readNext();			
		}
		
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return serverDetails;
		
	}

}

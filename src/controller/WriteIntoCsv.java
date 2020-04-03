package controller;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

	public class WriteIntoCsv
	{
		//userDetails write into csv file
		
		public void insertData(String userName,String password) throws IOException {
				  String csv = "data.csv";
			      CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
			      String concat=userName+","+password;
			      String [] record = concat.split(",");
			        
			      writer.writeNext(record);
			        
			      writer.close();
			   
		}
}

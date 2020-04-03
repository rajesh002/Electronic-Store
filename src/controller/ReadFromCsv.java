package controller;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.*;
import java.util.Map.Entry;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFromCsv {
	
	//Searching the datails exists in csv or not
	
	public static boolean loginCheck(String userName,String passWord) throws IOException{
    	LinkedHashMap<String,String> result=new LinkedHashMap<String,String>();
        Reader in = new FileReader("data.csv");
        CSVParser parser = new CSVParser( in, CSVFormat.DEFAULT );
        List<CSVRecord> list = parser.getRecords();

        for( CSVRecord row : list ) {
        	for(int index=0;index<row.size()-1;index++) {
                result.put(row.get(index),row.get(index+1));
            }
        }
        
        for (Entry<String, String> entry : result.entrySet()) {
        	if(entry.getKey().equals(userName)&&entry.getValue().equals(passWord))
        		return true;
        }
        return false;
	}
	

}
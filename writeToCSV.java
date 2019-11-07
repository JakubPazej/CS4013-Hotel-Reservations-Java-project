import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
public class writeToCSV{
    public static void reservation(int resNum, String firstName, String lastName,String resType/* , GregorianCalendar from, GregorianCalendar till, Date created*/) {
		String outputFile = Integer.toString(resNum)+"_"+lastName+".csv";
		
		// before we open the file check to see if it already exists
		boolean alreadyExists = new File(outputFile).exists();
			
		try {
			// use FileWriter constructor that specifies open for appending
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
			
			// if the file didn't already exist then we need to write out the header line
			if (!alreadyExists)
			{
				csvOutput.write("Reservation Number");
				csvOutput.write("Reservation Name");
				csvOutput.write("Reservation Type");
				csvOutput.write("Check-in date");
				csvOutput.write("Number of nights");
				csvOutput.write("Number of Rooms");
				//add room type, occupancy, breakfast for each room
				csvOutput.write("Total cost");
				csvOutput.write("Deposit");
				csvOutput.endRecord();
			}
			// else assume that the file already has the correct header line
			
			// write out a few records
			csvOutput.write(Integer.toString(resNum));
			csvOutput.write(firstName+" "+lastName);
			csvOutput.write(resType);
			csvOutput.write("Check-in date");
			csvOutput.write("Number of nights");
			csvOutput.write("Number of Rooms");
			//add room type, occupancy, breakfast for each room
			csvOutput.write("Total cost");
			csvOutput.write("Deposit");
			csvOutput.endRecord();
			
			csvOutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
    }
}

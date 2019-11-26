/**
*class for writing to csv files
*
* @18241646
*/
import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
import java.util.Scanner;

public class toWriteCSV {
	/**prints the reservation into a csv file*/
    public static void reservation(int resNum, String firstName, String lastName,String resType ,GregorianCalendar from, GregorianCalendar till ) throws java.io.IOException { 
        PrintWriter pw;
        Date created = new Date();
        hotel hotel = new hotel(resType);
        try {
            File file = new File("outputFile.csv");
            pw = new PrintWriter((new FileWriter(file,true)));
            Scanner testing = new Scanner(file);
            StringBuffer csvData = new StringBuffer("");
            if(testing.hasNext()){

                }
                else{
                    StringBuffer csvHeader = new StringBuffer("");
                    csvHeader.append("ReservationNum,Name,Surname,Reservation Type,StartDate,EndDate,Date,Hotel,Room\n");
                    pw.write(csvHeader.toString());
                }


            csvData.append("");
            // write data
            csvData.append(resNum);
            csvData.append(',');
            csvData.append(firstName);
            csvData.append(',');
            csvData.append(lastName);
            csvData.append(',');
            csvData.append(resType);
            csvData.append(',');
            csvData.append(from);
            csvData.append(',');
            csvData.append(till);
            csvData.append(',');
            csvData.append(created);
            csvData.append(',');
            csvData.append('\n');

            pw.write(csvData.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
    }
    
  /**prints the reservation into a csv file*/
    public static void reservation(int resNum, String firstName, String lastName,String resType ,String from, String till,String hotel,String room ) throws java.io.IOException { 
        PrintWriter pw;
        hotel hotell = new hotel(resType);
        Date created = new Date();
        try {
            File file = new File("outputFile.csv");
            pw = new PrintWriter((new FileWriter(file,true)));
            Scanner testing = new Scanner(file);
            StringBuffer csvData = new StringBuffer("");
            if(testing.hasNext()){

                }
                else{
                    StringBuffer csvHeader = new StringBuffer("");
                    csvHeader.append("ReservationNum,Name,Surname,Reservation Type,StartDate,EndDate,Date,Hotel,Room\n");
                    pw.write(csvHeader.toString());
                }


            csvData.append("");
            // write data
            csvData.append(resNum);
            csvData.append(',');
            csvData.append(firstName);
            csvData.append(',');
            csvData.append(lastName);
            csvData.append(',');
            csvData.append(resType);
            csvData.append(',');
            csvData.append(from);
            csvData.append(',');
            csvData.append(till);
            csvData.append(',');
            csvData.append(created);
            csvData.append(',');
            csvData.append(hotel);
            csvData.append(',');
            csvData.append(room);
            csvData.append(',');
            csvData.append('\n');
            
            
            pw.write(csvData.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
    }
    
  /**clears the csv file*/
    public static void clear() throws java.io.IOException{ 
            File file = new File("outputFile.csv");
            PrintWriter pw;
            pw = new PrintWriter((new FileWriter(file,false)));
            Scanner testing = new Scanner(file);
            StringBuffer csvData = new StringBuffer("");
            StringBuffer csvHeader = new StringBuffer("");
            csvHeader.append("ReservationNum,Name,Surname,Reservation Type,StartDate,EndDate,Date,Hotel,Room\n");
            pw.write(csvHeader.toString());

    }
}

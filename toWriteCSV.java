import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
import java.util.Scanner;

public class toWriteCSV {
    public static void reservation(int resNum, String firstName, String lastName,String resType ,GregorianCalendar from, GregorianCalendar till ) throws java.io.IOException {
        PrintWriter pw;
        Date created = new Date();
        try {
            File file = new File("outputFile.csv");
            pw = new PrintWriter(file);
            Scanner testing = new Scanner(file);
            StringBuffer csvData = new StringBuffer("");                       
                if(testing.hasNext()){
                   
                }
                else{
                    StringBuffer csvHeader = new StringBuffer("");
                    csvHeader.append("ReservationNum,Name,Surname,Reservation Type,StartDate,EndDate,Date\n");
                    pw.write(csvHeader.toString());
                }
            
            
                csvData.append("\n");
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
            
            pw.write(csvData.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }       
}

import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
import java.util.Scanner;
public class toReadCSV{
    private int x;

    public static void readRes(int resNum) throws Exception { //prints out info from a csv file
        // Create a File instance
        java.io.File file = new java.io.File("outputFile.csv");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            int isResNum = input.nextInt();
            if(isResNum == resNum) {

                String firstName = input.next();
                String lastName = input.next();
                String resType = input.next();
                String startDate = input.next();
                String endDate = input.next();
                String created = input.next();
                System.out.println(
                firstName + " " + lastName + " " + resType + " " + startDate + " " +endDate+ " " +created);
                input.close();
            }

            // Close the file
            //input.close();
        }
    }
    public int nextRes() throws Exception { //returns the next resNum for the reservation system
        java.io.File file = new java.io.File("outputFile.csv");
        Scanner input = new Scanner(file);
        int numberofLines = 0;
        while (input.hasNext()) {
            String line = input.nextLine();
            numberofLines++;
        }
        return numberofLines;
    }

}

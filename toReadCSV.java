/**
*class for reading csv files
*
* @18241646
*/
import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
import java.util.Scanner;
public class toReadCSV{
    private int x;
    private int resNum = 0;

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
    public static String readResType(int resNum) throws Exception { //prints out info from a csv file
        String resType = "";
        
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
                resType = input.next();
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
        return resType;
    }
    public static String readResLastName(int resNum) throws Exception { //prints out info from a csv file
        String lastName = "";
        
        // Create a File instance
        java.io.File file = new java.io.File("outputFile.csv");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            int isResNum = input.nextInt();
            if(isResNum == resNum) {
                String firstName = input.next();
                lastName = input.next();
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
        return lastName;
    }
    public static String readResFirstName(int resNum) throws Exception { //prints out info from a csv file
        String firstName = "";
        
        // Create a File instance
        java.io.File file = new java.io.File("outputFile.csv");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            int isResNum = input.nextInt();
            if(isResNum == resNum) {
                firstName = input.next();
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
        return firstName;
    }
    public static String readResStart(int resNum) throws Exception { //prints out info from a csv file
        String startDate = "";
        
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
                startDate = input.next();
                String endDate = input.next();
                String created = input.next();
                System.out.println(
                firstName + " " + lastName + " " + resType + " " + startDate + " " +endDate+ " " +created);
                input.close();
            }
            
            // Close the file
            //input.close();
        }
        return startDate;
    }
    public static String readResEnd(int resNum) throws Exception { //prints out info from a csv file
        String endDate = "";
        
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
                endDate = input.next();
                String created = input.next();
                System.out.println(
                firstName + " " + lastName + " " + resType + " " + startDate + " " +endDate+ " " +created);
                input.close();
            }
            
            // Close the file
            //input.close();
        }
        return endDate;
    }
}

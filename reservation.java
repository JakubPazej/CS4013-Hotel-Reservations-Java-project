/**
*template class for reservation
*it has all the possible set and return methods
*
* @author 18260179, 18241646
*/
import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
public class reservation{
    String firstName;
    String lastName;
    GregorianCalendar from;
    GregorianCalendar till;
    String fromS;
    String tillS;
    String room;
    String hotel;
    Date created;
    int resNum = 0;
    toWriteCSV writer = new toWriteCSV();
    toReadCSV reader = new toReadCSV();
    String resType;
    
    /** constructor for object class reservation */
    public reservation(){}

    /**changes the first name for a reservation*/
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**returns the first name for a reservation*/
    public String getFirstName(){
        return firstName;
    }

    /**changes the last name for a reservation*/
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**returns the last name for a reservation*/
    public String getLastName(){
        return lastName;
    }

    /**sets the start date of the reservation*/
    public void setFrom(int day, int month, int year){
        from.set(year, month, day);
    }

    /**returns the start date of a reservation*/
    public GregorianCalendar getFrom(){
        return from;
    }

    /**sets the end date of a reservation*/
    public void setTill(int day, int month, int year){
        till.set(year, month, day);
    }

    /**returns the end date of a reservation*/
    public GregorianCalendar getTill(){
        return till;
    }

    /**prints the reservation into the CSV file*/
    public void finishReservation() throws Exception{
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            
        }
        catch (IOException ioe) {}
    }
    
    /**prints the reservation into the CSV file*/
    public void finishReservationS() throws Exception{
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, fromS, tillS,hotel,room);
            
        }
        catch (IOException ioe) {}
    }
    
    /**prints reservation with the specified values into csv file*/
    public void finishReservation( String firstName,String lastName,String resType,GregorianCalendar from,GregorianCalendar till)throws Exception{
        created = new Date();
        //this.resNum = resNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resType=resType;
        this.from=from;
        this.till=till;
        try {
            int resNum =reader.nextRes();
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            
        }
        catch (IOException ioe) {}
    }
}

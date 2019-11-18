import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
public class reservation{
    String firstName;
    String lastName;
    GregorianCalendar from;
    GregorianCalendar till;
    Date created;
    int resNum = 0;
    toWriteCSV writer = new toWriteCSV();
    String resType;
    
    public reservation(){}
    
    public void setFirstName(String firstName){/**changes the first name for a reservation*/
        this.firstName = firstName;
    }
    
    public String getFirstName(){/**returns the first name for a reservation*/
        return firstName;
    }
    
    public void setLastName(String firstName){/**changes the last name for a reservation*/
        this.lastName = lastName;
    }
    
    public String getLastName(){/**returns the last name for a reservation*/
        return lastName;
    }
    
    public void setFrom(int day, int month, int year){
        from.set(year, month, day);
    }
    
    public GregorianCalendar getFrom(){
        return from;
    }
    
    public void setTill(int day, int month, int year){
        till.set(year, month, day);
    }
    
    public GregorianCalendar getTill(){
        return till;
    }
    
    public void finishReservation(){
        created = new Date();
        try {
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            resNum++;
        }
        catch (IOException ioe) {}
    }
}

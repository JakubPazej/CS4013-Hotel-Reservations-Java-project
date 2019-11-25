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

    public reservation(){}

    public void setFirstName(String firstName){/**changes the first name for a reservation*/
        this.firstName = firstName;
    }

    public String getFirstName(){/**returns the first name for a reservation*/
        return firstName;
    }

    public void setLastName(String lastName){/**changes the last name for a reservation*/
        this.lastName = lastName;
    }

    public String getLastName(){/**returns the last name for a reservation*/
        return lastName;
    }

    public void setFrom(int day, int month, int year){/**sets the start date of the reservation*/
        from.set(year, month, day);
    }

    public GregorianCalendar getFrom(){/**returns the start date of a reservation*/
        return from;
    }

    public void setTill(int day, int month, int year){/**sets the end date of a reservation*/
        till.set(year, month, day);
    }

    public GregorianCalendar getTill(){/**returns the end date of a reservation*/
        return till;
    }

    public void finishReservation() throws Exception{ /**prints the reservation into the CSV file*/
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            
        }
        catch (IOException ioe) {}
    }
    
    public void finishReservationS() throws Exception{ /**prints the reservation into the CSV file*/
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, fromS, tillS,hotel,room);
            
        }
        catch (IOException ioe) {}
    }
    public void finishReservation( String firstName,String lastName,String resType,GregorianCalendar from,GregorianCalendar till)throws Exception{/**prints reservation with the specified values into csv file*/
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

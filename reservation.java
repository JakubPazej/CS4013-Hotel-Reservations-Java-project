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

    public void setLastName(String lastName){/**changes the last name for a reservation*/
        this.lastName = lastName;
    }

    public String getLastName(){/**returns the last name for a reservation*/
        return lastName;
    }

    public void setFrom(int day, int month, int year){//sets the start date
        from.set(year, month, day);
    }

    public GregorianCalendar getFrom(){//return the start date
        return from;
    }

    public void setTill(int day, int month, int year){//sets the end date
        till.set(year, month, day);
    }

    public GregorianCalendar getTill(){//returns the end date
        return till;
    }

    public void finishReservation(){ //prints the reservation into the CSV file
        created = new Date();
        try {
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            resNum++;
        }
        catch (IOException ioe) {}
    }
    public void finishReservation(int resNum, String firstName,String lastName,String resType,GregorianCalendar from,GregorianCalendar till){//prints reservation into csv file
        created = new Date();
        this.resNum = resNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resType=resType;
        this.from=from;
        this.till=till;
        try {
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            resNum++;
        }
        catch (IOException ioe) {}
    }
}

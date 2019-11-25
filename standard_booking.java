/**
* class for standard reservation, uses methods from a template reservation
*
* @author 18260179
*/

import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
public class standard_booking extends reservation{/**creates an instance of a standard booking reservation*/
    
    public standard_booking(){}
    public standard_booking(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till){ //sets the reservation to standard
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Standard booking";
    }
    public standard_booking(String firstName, String lastName, String from, String till,String hotel,String Room){ //sets the reservation to standard
        this.firstName = firstName;
        this.lastName = lastName;
        this.fromS = from;
        this.tillS = till;
        this.room=room;
        this.created = new Date();
        this.resType = "Standard booking";
    }
    public standard_booking(String firstName, String lastName ){ //sets the reservation to standard
        this.firstName = firstName;
        this.lastName = lastName;
        //this.from = from;
        //this.till = till;
        this.created = new Date();
        this.resType = "Standard booking";
    }
    
    public void finishReservation() throws Exception{ /**prints the reservation into the CSV file*/
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, from, till);
            
        }
        catch (IOException ioe) {}
    }
}

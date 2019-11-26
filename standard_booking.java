/**
* class for standard reservation, uses methods from a template reservation
*
* @author 18260179
*/

import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
/**creates an instance of a standard booking reservation*/
public class standard_booking extends reservation{
    
	/** constructor for standard_booking type objects */
    public standard_booking(){}
    
    /**sets the reservation to standard*/
    public standard_booking(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till){ 
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Standard booking";
    }
    
  /**sets the reservation to standard*/
    public standard_booking(String firstName, String lastName, String from, String till,String hotel,String Room){ 
        this.firstName = firstName;
        this.lastName = lastName;
        this.fromS = from;
        this.tillS = till;
        this.room=room;
        this.created = new Date();
        this.resType = "Standard booking";
    }
    
  /**sets the reservation to standard*/
    public standard_booking(String firstName, String lastName ){ 
        this.firstName = firstName;
        this.lastName = lastName;
        //this.from = from;
        //this.till = till;
        this.created = new Date();
        this.resType = "Standard booking";
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
}

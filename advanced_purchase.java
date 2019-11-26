/**
* class for AP reservation, uses methods from a template reservation
*
* @author 18260179
*/

import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
public class advanced_purchase extends reservation{/**
													*creates an instance of an AP reservation
													*/
    public advanced_purchase(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till ){ //sets the reservation to advanced booking
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Advanced purchase";
    }
    /**sets the reservation to advanced booking*/
    public advanced_purchase(String firstName, String lastName, String from, String till,String hotel,String room ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fromS = from;
        this.tillS = till;
        this.room=room;
        this.created = new Date();
        this.resType = "Advanced purchase";
    }
    /**prints the reservation into the CSV file*/
    public void finishReservationA() throws Exception{
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, fromS, tillS,hotel, room);
            
        }
        catch (IOException ioe) {}
    }
}

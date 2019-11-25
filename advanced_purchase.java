/**
* class for AP reservation, uses methods from a template reservation
*
* @author 18260179
*/

import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
public class advanced_purchase extends reservation{/**creates an instance of an AP reservation*/
    public advanced_purchase(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till ){ //sets the reservation to advanced booking
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Advanced purchase";
    }
    public advanced_purchase(String firstName, String lastName, String from, String till ){ //sets the reservation to advanced booking
        this.firstName = firstName;
        this.lastName = lastName;
        this.fromS = from;
        this.tillS = till;
        this.created = new Date();
        this.resType = "Advanced purchase";
    }
    public void finishReservationS() throws Exception{ /**prints the reservation into the CSV file*/
        created = new Date();
        try {
            
            int resNum =reader.nextRes();
            
        
        
            writer.reservation(resNum, firstName, lastName, resType, fromS, tillS);
            
        }
        catch (IOException ioe) {}
    }
}

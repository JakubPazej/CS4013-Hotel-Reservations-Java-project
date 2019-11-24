/**
* class for standard reservation, uses methods from a template reservation
*
* @author 18260179
*/

import java.util.GregorianCalendar;
import java.util.Date;
public class standard_booking extends reservation{/**creates an instance of a standard booking reservation*/
    public standard_booking(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till){ //sets the reservation to standard
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Standard booking";
    }
}

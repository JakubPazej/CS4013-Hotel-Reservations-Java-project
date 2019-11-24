import java.util.GregorianCalendar;
import java.util.Date;
public class standard_booking extends reservation{
    public standard_booking(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till){ //sets the reservation to standard
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Standard booking";
    }
}

import java.util.GregorianCalendar;
import java.util.Date;
public class advanced_purchase extends reservation{
    public advanced_purchase(String firstName, String lastName, GregorianCalendar from, GregorianCalendar till ){ //sets the reservation to advanced booking
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.till = till;
        this.created = new Date();
        this.resType = "Advanced purchase";
    }
}

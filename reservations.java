/**
*class formultiple reservations
*
* @18257038
*/
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;

public class reservations
{
    // instance variables - replace the example below with your own
    protected ArrayList<standard_booking> SReserve = new ArrayList<standard_booking>();
    protected ArrayList<advanced_purchase> APReserve = new ArrayList<advanced_purchase>();
    protected String ownerHotel;
    toReadCSV reader = new toReadCSV();
    reservation reservation=new reservation();
    /**
     * Constructor for objects of class reservations
     */
    public reservations(){}

    /**changes the Hotel name for all the reservations*/
    public void setOwnerHotel(String ownerHotel){
        this.ownerHotel=ownerHotel;
    }

    /**returns the Hotel name for all the reservations*/
    public String getOwnerHotel(){
        return ownerHotel;
    }
  
    /**creates a standard booking reservation*/
    public void createStandardReservation(String firstName, String lastName,
    GregorianCalendar from, GregorianCalendar till)throws Exception{  
        SReserve.add(new standard_booking(firstName, lastName, from, till));
        try {
            int resNum =reader.nextRes();
            reservation.finishReservation(resNum,firstName,lastName,"AP",from,till);
        }
        catch (IOException ioe) {}
    }

    /**creates an advanced booking reservation*/
    public void createAdvancedPReservation(String firstName, String lastName,
    GregorianCalendar from, GregorianCalendar till) throws Exception{ 
        APReserve.add(new advanced_purchase(firstName, lastName, from, till));
        try {
            int resNum =reader.nextRes();
            reservation.finishReservation(resNum,firstName,lastName,"AP",from,till);
        }
        catch (IOException ioe) {}
    }

   /**changes the name of a reservation*/
    public void setName(String newFirstName, String newLastName,
    String oldFirstName, String oldLastName){ 
        if(findSReservation(oldFirstName, oldLastName) != -1){
            SReserve.get(findSReservation(oldFirstName, oldLastName)).setLastName(newLastName);
            SReserve.get(findSReservation(oldFirstName, newLastName)).setFirstName(newFirstName);
        }
        if(findAPReservation(oldFirstName, oldLastName) != -1){
            APReserve.get(findAPReservation(oldFirstName, oldLastName)).setLastName(newLastName);
            APReserve.get(findAPReservation(oldFirstName, newLastName)).setFirstName(newFirstName);
        }
    }

  /**returns the name of a reservation*/
    public String getResFirstName(String firstName, String lastName){ 
        if(findSReservation(firstName, lastName) != -1){
            return SReserve.get(findSReservation(firstName, lastName)).getFirstName();
        }
        if(findAPReservation(firstName, lastName) != -1){
            return APReserve.get(findAPReservation(firstName, lastName)).getFirstName();
        }
        return null;
    }

        /**returns the last name of a reservation*/
        public String getResLastName(String firstName, String lastName){ 
        if(findSReservation(firstName, lastName) != -1){
            return SReserve.get(findSReservation(firstName, lastName)).getLastName();
        }
        if(findAPReservation(firstName, lastName) != -1){
            return APReserve.get(findAPReservation(firstName, lastName)).getLastName();
        }
        return null;
    }

      /**changes the start date of a reservation*/
    public void setResFrom(String firstName, String lastName, int year, int month, int day){ 
        if(findSReservation(firstName, lastName) != -1){
            SReserve.get(findSReservation(firstName, lastName)).setFrom(year, month, day);
        }
        if(findAPReservation(firstName, lastName) != -1){
            APReserve.get(findAPReservation(firstName, lastName)).setFrom(year, month, day);
        }
    }

  /**changes the end date of a reservation*/
    public void setResTill(String firstName, String lastName, int year, int month, int day){ 
        if(findSReservation(firstName, lastName) != -1){
            SReserve.get(findSReservation(firstName, lastName)).setTill(year, month, day);
        }
        if(findAPReservation(firstName, lastName) != -1){
            APReserve.get(findAPReservation(firstName, lastName)).setTill(year, month, day);
        }
    }

    /**returns the end date of a reservation*/
    public GregorianCalendar getResTill(String firstName, String lastName){ 
        if(findSReservation(firstName, lastName) != -1){
            SReserve.get(findSReservation(firstName, lastName)).getTill();
        }
        if(findAPReservation(firstName, lastName) != -1){
            APReserve.get(findAPReservation(firstName, lastName)).getTill();
        }
        return null;
    }

    /**returns the start date of a reservation*/
    public GregorianCalendar getResFrom(String firstName, String lastName){ 
        if(findSReservation(firstName, lastName) != -1){
            SReserve.get(findSReservation(firstName, lastName)).getFrom();
        }
        if(findAPReservation(firstName, lastName) != -1){
            APReserve.get(findAPReservation(firstName, lastName)).getFrom();
        }
        return null;
    }

    /**returns index of specified reservation in the list*/
    private int findSReservation(String firstName, String lastName){
        for(reservation h : SReserve){
            if(h.getFirstName() != null && h.getFirstName().contains(firstName)
                && h.getLastName() != null && h.getLastName().contains(lastName)){
                return SReserve.indexOf(h);
            }
        }
        return -1;
    }

    /**returns index of specified reservation in the list*/
    private int findAPReservation(String firstName, String lastName){
        for(reservation h : APReserve){
            if(h.getFirstName() != null && h.getFirstName().contains(firstName)
            && h.getLastName() != null && h.getLastName().contains(lastName)){
                return APReserve.indexOf(h);
            }
        }
        return -1;
    }

    /*private int findReservation(String firstName, String lastName){
        for(reservation h : APReserve){
            if(h.getFirstName() != null && h.getFirstName().contains(firstName)
            && h.getLastName() != null && h.getLastName().contains(lastName)){
                return APReserve.indexOf(h);
            }
        }
        for(reservation h : SReserve){
            if(h.getFirstName() != null && h.getFirstName().contains(firstName)
                && h.getLastName() != null && h.getLastName().contains(lastName)){
                return SReserve.indexOf(h);
            }
        }
        return -1;
    } */
}

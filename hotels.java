/**
* class for creating and managing multiple hotels
*it has all the possible set and return methods
*
* @author 18260179
*/

import java.util.ArrayList;
public class hotels{
  //datafields
  protected String ownerCompany;
  protected ArrayList<hotel> allHotels = new ArrayList<hotel>();
  
  public hotels(){}
  
  /**changes the company name for all the hotels*/
  public void setOwnerCompany(String ownerCompany){
    this.ownerCompany=ownerCompany;
  }
  
  /**returns the company name for all the hotels*/
  public String getOwnerCompany(){
    return ownerCompany;
  }

  /**creates a hotel object with given name*/
  public void createHotel(String name){
    allHotels.add(new hotel(name));
  }
  
  /**changes a name for hotel object*/
  public void setName(String oldName, String newName){
    allHotels.get(findHotel(oldName)).setName(newName);
  }
  
  /**returns a String with the name of the hotel object*/
  public String getName(String name){
    return allHotels.get(findHotel(name)).getName();
  }
  
  /**changes amount of stars for hotel object*/
  public void setStars(String name, int stars){
    allHotels.get(findHotel(name)).setStars(stars);
  }
  
  /**returns amount of stars of the hotel object as integer*/
  public int getStars(String name){
    return allHotels.get(findHotel(name)).getStars();
  }

  /**adds a room type to the room types list in a specified hotel*/
  public void addRoomType(String name, String roomType){
    allHotels.get(findHotel(name)).addRoomType(roomType);
  }
  
  /**removes a given room type from the list in a specified hotel*/
  public void removeRoomType(String name, String roomType){
    allHotels.get(findHotel(name)).removeRoomType(roomType);
  }
  
  /**changes the name of a given room type from the list in a specified hotel*/
  public void changeRoomType(String name, String type, String newType){
    allHotels.get(findHotel(name)).changeRoomType(type, newType);   
  }  
  
  /**changes the minimum occupancy limits for a room in a specified hotel*/
  public void changeOccuMin(String name, String type, int minAdult, int minKid){
    allHotels.get(findHotel(name)).changeOccuMin(type, minAdult, minKid);     
  }
  
  /**returns the minimum occupancy limits for a room in a specified hotel as a String*/
  public String getOccuMin(String name, String type){
    return allHotels.get(findHotel(name)).getOccuMin(type);   
  }
  
  /**changes the maximum occupancy limits for a room in a specified hotel*/
  public void changeOccuMax(String name, String type, int maxAdult, int maxKid){
    allHotels.get(findHotel(name)).changeOccuMax(type, maxAdult, maxKid);    
  }
  
  /**returns the maximum occupancy limits for a room in a specified hotel as a String*/
  public String getOccuMax(String name, String type){
    return allHotels.get(findHotel(name)).getOccuMax(type);     
  }
  
  /**changes the availability of breakfast for a room in a specified hotel*/
  public void setBreakfast(String name, String type, boolean bool){ 
    allHotels.get(findHotel(name)).setBreakfast(type, bool);  
  }
  
  /**returns the availability of breakfast for a room in a specified hotel as a boolean*/
  public boolean getBreakfast(String name, String type){
    return allHotels.get(findHotel(name)).getBreakfast(type);  
  }
  
  /**changes the rates for a room in a specified hotel*/
  public void setRates(String name, String type, double[] rates){
    allHotels.get(findHotel(name)).setRates(type, rates); 
  }

  /**returns rates for this room in a specified hotel as double array*/
  public double[] getRates(String name, String type){
    return allHotels.get(findHotel(name)).getRates(type);
  }

  /**changes the number of rooms of given type in a specified hotel*/
  public void setNumRooms(String name, String type, int num){
    allHotels.get(findHotel(name)).setNumRooms(type, num); 
  }

  /**returns the number of rooms of given type in a specified hotel as an integer*/
  public int getNumRooms(String name, String type){
    return allHotels.get(findHotel(name)).getNumRooms(type);
  }

  /**returns index of specified hotel name in the list*/
  private int findHotel(String name){
    for(hotel h : allHotels){
        if(h.getName() != null && h.getName().contains(name)){
           return allHotels.indexOf(h);
        }
    }
    return -1;
  }
}

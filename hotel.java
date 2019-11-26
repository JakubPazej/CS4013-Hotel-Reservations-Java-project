/**
*class for creating and managing a hotel
*it has all the possible set and return methods
*
* @author 18260179
*/
import java.util.ArrayList;
public class hotel{
  //datafields
  protected String name;
  protected ArrayList<room> roomTypes = new ArrayList<room>();
  protected int stars = -1;
  
  /**creates a hotel object with given name*/
  public hotel(String name){
    this.name=name;
  }
  
  /**changes a name for hotel object*/
  public void setName(String name){
    this.name=name;
  }
  
  /**returns a String with the name of the hotel object*/
  public String getName(){
    return name;
  }
  
  /**changes amount of stars for hotel object*/
  public void setStars(int stars){
    this.stars=stars;
  }
  
  /**returns amount of stars of the hotel object as integer*/
  public int getStars(){
    return stars;
  }

  /**adds a room type to the room types list*/
  public void addRoomType(String roomType){
    roomTypes.add(new room(roomType));
  }
  
  /**removes a given room type from the list*/
  public void removeRoomType(String roomType){
    roomTypes.remove(roomType);
  }
  
  /**changes the name of a given room type from the list*/
  public void changeRoomType(String type, String newType){
    roomTypes.get(findRoomType(type)).setRoomType(newType);    
  }
  
  /**changes the minimum occupancy limits for a room*/
  public void changeOccuMin(String type, int minAdult, int minKid){
    roomTypes.get(findRoomType(type)).setOccuMin(minAdult, minKid);    
  }
  
  /**returns the minimum occupancy limits for a room as a String*/
  public String getOccuMin(String type){
    return roomTypes.get(findRoomType(type)).getOccuMin();    
  }
  
  /**changes the maximum occupancy limits for a room*/
  public void changeOccuMax(String type, int maxAdult, int maxKid){
    roomTypes.get(findRoomType(type)).setOccuMax(maxAdult, maxKid);    
  }
  
  /**returns the maximum occupancy limits for a room as a String*/
  public String getOccuMax(String type){
    return roomTypes.get(findRoomType(type)).getOccuMax();    
  }
  
  /**changes the availability of breakfast for a room*/
  public void setBreakfast(String type, boolean bool){
    roomTypes.get(findRoomType(type)).setBreakfast(bool);
  }
  
  /**returns the availability of breakfast for a room as a boolean*/
  public boolean getBreakfast(String type){
    return roomTypes.get(findRoomType(type)).getBreakfast();
  }
  
  /**changes the rates for a room*/
  public void setRates(String type, double[] rates){
    roomTypes.get(findRoomType(type)).setRates(rates);
  }

  /**returns rates for this room as double array*/
  public double[] getRates(String type){
    return roomTypes.get(findRoomType(type)).getRates();
  }

  /**changes the number of rooms of given type*/
  public void setNumRooms(String type, int num){
    roomTypes.get(findRoomType(type)).setNumRooms(num);
  }

  /**returns the number of rooms of given type as an integer*/
  public int getNumRooms(String type){
    return roomTypes.get(findRoomType(type)).getNumRooms();
  }
  
  /**returns index of specified room type in the list*/
  private int findRoomType(String roomType){
    for(room r : roomTypes){
        if(r.getRoomType() != null && r.getRoomType().contains(roomType)){
           return roomTypes.indexOf(r);
        }
    }
    return -1;
  }
}

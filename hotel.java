/**class for creating and managing a hotel*/
import java.util.ArrayList;
public class hotel{
  //datafields
  protected String name;
  protected ArrayList<room> roomTypes = new ArrayList<room>();
  protected int stars = -1;
  
  public hotel(String name){/**creates a hotel object with given name*/
    this.name=name;
  }
  
  public void setName(String name){/**changes a name for hotel object*/
    this.name=name;
  }
  
  public String getName(){/**returns a String with the name of the hotel object*/
    return name;
  }
  
  public void setStars(int stars){/**changes amount of stars for hotel object*/
    this.stars=stars;
  }
  
  public int getStars(){/**returns amount of stars of the hotel object as integer*/
    return stars;
  }

  public void addRoomType(String roomType){/**adds a room type to the room types list*/
    roomTypes.add(new room(roomType));
  }
  
  public void removeRoomType(String roomType){/**removes a given room type from the list*/
    roomTypes.remove(roomType);
  }
  
  public void changeRoomType(String type, String newType){/**changes the name of a given room type from the list*/
    roomTypes.get(findRoomType(type)).setRoomType(newType);    
  }
  
  public void changeOccuMin(String type, int minAdult, int minKid){/**changes the minimum occupancy limits for a room*/
    roomTypes.get(findRoomType(type)).setOccuMin(minAdult, minKid);    
  }
  
  public String getOccuMin(String type){/**returns the minimum occupancy limits for a room as a String*/
    return roomTypes.get(findRoomType(type)).getOccuMin();    
  }
  
  public void changeOccuMax(String type, int maxAdult, int maxKid){/**changes the maximum occupancy limits for a room*/
    roomTypes.get(findRoomType(type)).setOccuMax(maxAdult, maxKid);    
  }
  
  public String getOccuMax(String type){/**returns the maximum occupancy limits for a room as a String*/
    return roomTypes.get(findRoomType(type)).getOccuMax();    
  }
  
  public void setBreakfast(String type, boolean bool){ /**changes the availability of breakfast for a room*/
    roomTypes.get(findRoomType(type)).setBreakfast(bool);
  }
  
  public boolean getBreakfast(String type){/**returns the availability of breakfast for a room as a boolean*/
    return roomTypes.get(findRoomType(type)).getBreakfast();
  }
  
  public void setRates(String type, double[] rates){/**changes the rates for a room*/
    roomTypes.get(findRoomType(type)).setRates(rates);
  }

  public double[] getRates(String type){/**returns rates for this room as double array*/
    return roomTypes.get(findRoomType(type)).getRates();
  }

  public void setNumRooms(String type, int num){/**changes the number of rooms of given type*/
    roomTypes.get(findRoomType(type)).setNumRooms(num);
  }

  public int getNumRooms(String type){/**returns the number of rooms of given type as an integer*/
    return roomTypes.get(findRoomType(type)).getNumRooms();
  }
  
  private int findRoomType(String roomType){/**returns index of specified room type in the list*/
    for(room r : roomTypes){
        if(r.getRoomType() != null && r.getRoomType().contains(roomType)){
           return roomTypes.indexOf(r);
        }
    }
    return -1;
  }
}

/**class for creating and managing multiple hotels*/
import java.util.ArrayList;
public class hotels{
  //datafields
  protected String ownerCompany;
  protected ArrayList<hotel> allHotels = new ArrayList<hotel>();
  
  public hotels(){}
  
  public void setOwnerCompany(String ownerCompany){/**changes the company name for all the hotels*/
    this.ownerCompany=ownerCompany;
  }
  
  public String getOwnerCompany(){/**returns the company name for all the hotels*/
    return ownerCompany;
  }

  public void createHotel(String name){/**creates a hotel object with given name*/
    allHotels.add(new hotel(name));
  }
  
  public void setName(String oldName, String newName){/**changes a name for hotel object*/
    allHotels.get(findHotel(oldName)).setName(newName);
  }
  
  public String getName(String name){/**returns a String with the name of the hotel object*/
    return allHotels.get(findHotel(name)).getName();
  }
  
  public void setStars(String name, int stars){/**changes amount of stars for hotel object*/
    allHotels.get(findHotel(name)).setStars(stars);
  }
  
  public int getStars(String name){/**returns amount of stars of the hotel object as integer*/
    return allHotels.get(findHotel(name)).getStars();
  }

  public void addRoomType(String name, String roomType){/**adds a room type to the room types list in a specified hotel*/
    allHotels.get(findHotel(name)).addRoomType(roomType);
  }
  
  public void removeRoomType(String name, String roomType){/**removes a given room type from the list in a specified hotel*/
    allHotels.get(findHotel(name)).removeRoomType(roomType);
  }
  
  public void changeRoomType(String name, String type, String newType){/**changes the name of a given room type from the list in a specified hotel*/
    allHotels.get(findHotel(name)).changeRoomType(type, newType);   
  }  
  
  public void changeOccuMin(String name, String type, int minAdult, int minKid){/**changes the minimum occupancy limits for a room in a specified hotel*/
    allHotels.get(findHotel(name)).changeOccuMin(type, minAdult, minKid);     
  }
  
  public String getOccuMin(String name, String type){/**returns the minimum occupancy limits for a room in a specified hotel as a String*/
    return allHotels.get(findHotel(name)).getOccuMin(type);   
  }
  
  public void changeOccuMax(String name, String type, int maxAdult, int maxKid){/**changes the maximum occupancy limits for a room in a specified hotel*/
    allHotels.get(findHotel(name)).changeOccuMax(type, maxAdult, maxKid);    
  }
  
  public String getOccuMax(String name, String type){/**returns the maximum occupancy limits for a room in a specified hotel as a String*/
    return allHotels.get(findHotel(name)).getOccuMax(type);     
  }
  
  public void setBreakfast(String name, String type, boolean bool){ /**changes the availability of breakfast for a room in a specified hotel*/
    allHotels.get(findHotel(name)).setBreakfast(type, bool);  
  }
  
  public boolean getBreakfast(String name, String type){/**returns the availability of breakfast for a room in a specified hotel as a boolean*/
    return allHotels.get(findHotel(name)).getBreakfast(type);  
  }
  
  public void setRates(String name, String type, double[] rates){/**changes the rates for a room in a specified hotel*/
    allHotels.get(findHotel(name)).setRates(type, rates); 
  }

  public double[] getRates(String name, String type){/**returns rates for this room in a specified hotel as double array*/
    return allHotels.get(findHotel(name)).getRates(type);
  }

  public void setNumRooms(String name, String type, int num){/**changes the number of rooms of given type in a specified hotel*/
    allHotels.get(findHotel(name)).setNumRooms(type, num); 
  }

  public int getNumRooms(String name, String type){/**returns the number of rooms of given type in a specified hotel as an integer*/
    return allHotels.get(findHotel(name)).getNumRooms(type);
  }

  private int findHotel(String name){/**returns index of specified hotel name in the list*/
    for(hotel h : allHotels){
        if(h.getName() != null && h.getName().contains(name)){
           return allHotels.indexOf(h);
        }
    }
    return -1;
  }
}

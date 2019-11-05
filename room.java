/**class for creating and managing rooms*/
public class room{
  //datafields
  protected String type;
  protected int ocuMinKid = 0;
  protected int ocuMinAdult = 1;
  protected int ocuMaxKid;
  protected int ocuMaxAdult;
  protected boolean breakfast = false;
  protected double[] rates = new double[7];
  protected static int numOfRooms;

  public room(String type){/**creates a room object with desired type*/
    this.type = type;
  }

  public void setRoomType(String type){this.type = type;} /** changes room type*/

  public String getRoomType(){return type;} /** returns room type*/

  public void setOccuMax(int ocuMaxAdult, int ocuMaxKid){/**changes max ocupancy limits*/
    this. ocuMaxKid = ocuMaxKid;
    this.ocuMaxAdult = ocuMaxAdult;
  }

  public String getOccuMax(){/**returns max ocupancy limits as a String*/
    String returnString="";
    if (ocuMaxAdult == 1){
      returnString=returnString+"Maximum occupancy limits for room of type "+type+" are "+ocuMaxAdult +" adult";
    }else{
      returnString=returnString+"Maximum occupancy limits for room of type "+type+" are "+ocuMaxAdult +" adults";
    }
    if (ocuMaxKid == 1){
      returnString=returnString+" and "+ocuMaxKid+"child";
    }else{
      returnString=returnString+" and "+ocuMaxKid+"children";
    }
    return(returnString);
  }

  public void setOccuMin(int ocuMinAdult, int ocuMinKid){/**changes min ocupancy limits*/
    this. ocuMinKid = ocuMinKid;
    this.ocuMinAdult = ocuMinAdult;
  }

  public String getOccuMin(){/**returns min ocupancy limits as a String*/
    String returnString="";
    if (ocuMinAdult == 1){
      returnString=returnString+"Minimum occupancy limits for room of type "+type+" are "+ocuMaxAdult +" adult";
    }else{
      returnString=returnString+"Minimum occupancy limits for room of type "+type+" are "+ocuMaxAdult +" adults";
    }
    if (ocuMinKid == 1){
      returnString=returnString+" and "+ocuMinKid+"child";
    }else{
      returnString=returnString+" and "+ocuMinKid+"children";
    }
    return(returnString);
  }

  public void setBreakfast(boolean breakfast){this.breakfast = breakfast;}/**changes the availability of breakfast in specified room*/

  public boolean getBreakfast(){return breakfast;}/**returns the availability of breakfast in specified room*/

  public void setRates(double[] rates){this.rates = rates;}/**changes the rates for a room*/

  public double[] getRates(){return rates;}/**returns rates for this room as double array*/

  public static void setNumRooms(int num){num=numOfRooms;}/**changes the static number of rooms of given type*/

  public static int getNumRooms(){return numOfRooms;}/**returns the static number of rooms of given type as an integer*/
}

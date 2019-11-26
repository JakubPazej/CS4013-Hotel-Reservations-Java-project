/**
*class for creating and managing rooms
*it has all the possible set and return methods
*
* @author 18260179
*/
public class room{
  //datafields
  protected String type;
  protected int ocuMinKid = 0;
  protected int ocuMinAdult = 1;
  protected int ocuMaxKid;
  protected int ocuMaxAdult;
  protected boolean breakfast = false;
  protected double[] rates = new double[7];
  protected int numOfRooms;

  /**creates a room object with desired type*/
  public room(String type){
    this.type = type;
  }

  /** changes room type*/
  public void setRoomType(String type){this.type = type;} 

  /** returns room type*/
  public String getRoomType(){return type;} 

  /**changes max ocupancy limits*/
  public void setOccuMax(int ocuMaxAdult, int ocuMaxKid){
    this. ocuMaxKid = ocuMaxKid;
    this.ocuMaxAdult = ocuMaxAdult;
  }

  /**returns max ocupancy limits as a String*/
  public String getOccuMax(){
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

  /**changes min ocupancy limits*/
  public void setOccuMin(int ocuMinAdult, int ocuMinKid){
    this. ocuMinKid = ocuMinKid;
    this.ocuMinAdult = ocuMinAdult;
  }

  /**returns min ocupancy limits as a String*/
  public String getOccuMin(){
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

  /**changes the availability of breakfast in specified room*/
  public void setBreakfast(boolean breakfast){this.breakfast = breakfast;}

  /**returns the availability of breakfast in specified room*/
  public boolean getBreakfast(){return breakfast;}

  /**changes the rates for a room*/
  public void setRates(double[] rates){this.rates = rates;}

  /**returns rates for this room as double array*/
  public double[] getRates(){return rates;}

  /**changes the number of rooms of given type*/
  public void setNumRooms(int num){num=numOfRooms;}

  /**returns the number of rooms of given type as an integer*/
  public int getNumRooms(){return numOfRooms;}
}

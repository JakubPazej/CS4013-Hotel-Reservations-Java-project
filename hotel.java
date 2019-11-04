import java.util.ArrayList;
public class hotel{
  protected String name;
  protected ArrayList<room> roomTypes;
  room idk = new room("abc");
  public hotel(String name){
    this.name=name;
  }

  public void addRoomType(String roomType){
    room roomType = new room("abc");
    idk = roomType;
    roomTypes.add(roomType);
  }


}

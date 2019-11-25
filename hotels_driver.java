/**
* This is a driver class thats gonna be used in GUI to set up a default hotel 
*
*
* @author 18260179 & 18241646
*/
import java.util.Scanner;
public class hotels_driver{
    public static void main(String[] args){
        hotels hotelChain = new hotels();
        hotelChain.setOwnerCompany("L4 Hotels");//giving the hotel chain a company name

        hotelChain.createHotel("Upsilon");//creating 3 hotels
        hotelChain.createHotel("Theta");
        hotelChain.createHotel("Omicron");

        hotelChain.setStars("Upsilon", 5);//giving stars to the hotels
        hotelChain.setStars("Theta", 4);
        hotelChain.setStars("Omicron", 3);

        hotelChain.addRoomType("Upsilon", "Deluxe Double");//adding different room types to different hotels
        hotelChain.addRoomType("Upsilon", "Deluxe Twin");
        hotelChain.addRoomType("Upsilon", "Deluxe Single");
        hotelChain.addRoomType("Upsilon", "Deluxe Family");

        hotelChain.addRoomType("Theta", "Executive Double");
        hotelChain.addRoomType("Theta", "Executive Twin");
        hotelChain.addRoomType("Theta", "Executive Single");

        hotelChain.addRoomType("Omicron", "Classic Double");
        hotelChain.addRoomType("Omicron", "Classic Twin");
        hotelChain.addRoomType("Omicron", "Classic Single");

        hotelChain.setNumRooms("Upsilon", "Deluxe Double", 35);//setting up the number of rooms in different hotels
        hotelChain.setNumRooms("Upsilon", "Deluxe Twin", 25);
        hotelChain.setNumRooms("Upsilon", "Deluxe Single", 10);
        hotelChain.setNumRooms("Upsilon", "Deluxe Family", 10);

        hotelChain.setNumRooms("Theta", "Executive Double", 40);
        hotelChain.setNumRooms("Theta", "Executive Twin", 32);
        hotelChain.setNumRooms("Theta", "Executive Single", 12);

        hotelChain.setNumRooms("Omicron", "Classic Double", 45);
        hotelChain.setNumRooms("Omicron", "Classic Twin", 45);
        hotelChain.setNumRooms("Omicron", "Classic Single", 10);

        hotelChain.changeOccuMax("Upsilon", "Deluxe Double", 2, 0);//setting max occupancy limits to different rooms in different hotels
        hotelChain.changeOccuMax("Upsilon", "Deluxe Twin", 2, 1);
        hotelChain.changeOccuMax("Upsilon", "Deluxe Single", 1, 1);
        hotelChain.changeOccuMax("Upsilon", "Deluxe Family", 3, 1);

        hotelChain.changeOccuMax("Theta", "Executive Double", 2, 0);
        hotelChain.changeOccuMax("Theta", "Executive Twin", 2, 1);
        hotelChain.changeOccuMax("Theta", "Executive Single", 1, 1);

        hotelChain.changeOccuMax("Omicron", "Classic Double", 2, 0);
        hotelChain.changeOccuMax("Omicron", "Classic Twin", 2, 1);
        hotelChain.changeOccuMax("Omicron", "Classic Single", 1, 1);
        
        double[] Deluxe_Double = {75,75,75,80,90,90,75}; //creating arrays with rates for different rooms in different hotels
        double[] Deluxe_Twin = {75,75,75,80,90,90,75};
        double[] Deluxe_Single = {70,70,70,75,80,80,65};
        double[] Deluxe_Family = {80,80,80,80,100,100,80};
        double[] Theta_Double = {70,70,70,70,80,85,85};
        double[] Theta_Twin = {70,70,70,70,80,85,85};
        double[] Theta_Single = {65,65,65,65,70,75,80};
        double[] Omicron_Double = {65,65,70,70,75,80,65};
        double[] Omicron_Twin = {65,65,70,70,80,85,65};
        double[] Omicron_Single = {50,50,50,60,75,75,50};

        hotelChain.setRates("Upsilon", "Deluxe Double", Deluxe_Double);//setting up rates for different rooms and different days
        hotelChain.setRates("Upsilon", "Deluxe Twin", Deluxe_Twin);
        hotelChain.setRates("Upsilon", "Deluxe Single", Deluxe_Single);
        hotelChain.setRates("Upsilon", "Deluxe Family", Deluxe_Family);

        hotelChain.setRates("Theta", "Executive Double", Theta_Double);
        hotelChain.setRates("Theta", "Executive Twin", Theta_Twin);
        hotelChain.setRates("Theta", "Executive Single", Theta_Single);

        hotelChain.setRates("Omicron", "Classic Double", Omicron_Double);
        hotelChain.setRates("Omicron", "Classic Twin", Omicron_Twin);
        hotelChain.setRates("Omicron", "Classic Single", Omicron_Single);
    }
    public String listAllRooms() {
        Scanner input= new Scanner(System.in);
        System.out.println("What Hotel are you in?\n1.Upsilon.\n2.Theta.\n3.Omicron.");
        int choice = input.nextInt();
        String room ="";
        if(choice==1) {
            System.out.println("1.Deluxe Double\n2.Deluxe Twin\n3.Deluxe Single\4Deluxe Family");
            int choice2=input.nextInt();
            if (choice2==1) {
                room = "Deluxe Double";
            }
            if (choice2==2) {
                room = "Deluxe Twin";
            }
            if (choice2==3) {
                room = "Deluxe Single";
            }
            if (choice2==4) {
                room = "Deluxe Family";
            }
        }
        if(choice==2) {
            System.out.println("1.Executive Double\n2.Executive Twin\n3.Executive Single");
            int choice2=input.nextInt();
            if (choice2==1) {
                room = "Exe Double";
            }
            if (choice2==2) {
                room = "Exe Twin";
            }
            if (choice2==3) {
                room = "Exe Single";
            }
        }
        if(choice==3) {
            System.out.println("1.Classic Double\n2.Classic Twin\n3.Classic Single");
            int choice2=input.nextInt();
            if (choice2==1) {
                room = "Classic Double";
            }
            if (choice2==2) {
                room = "Classic Twin";
            }
            if (choice2==3) {
                room = "Classice Single";
            }
        }
        return room;
    }
}

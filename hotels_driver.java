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

        hotelChain.setRates("Upsilon", "Deluxe Double", {75;75;75;80;90;90;75;});//setting up rates for different rooms and different days
        hotelChain.setRates("Upsilon", "Deluxe Twin", [75,75,75,80,90,90,75]);
        hotelChain.setRates("Upsilon", "Deluxe Single", {70,70,70,75,80,80,65});
        hotelChain.setRates("Upsilon", "Deluxe Family", {80,80,80,80,100,100,80});

        hotelChain.setRates("Theta", "Executive Double", {70,70,70,70,80,85,85});
        hotelChain.setRates("Theta", "Executive Twin", {70,70,70,70,80,85,85});
        hotelChain.setRates("Theta", "Executive Single", {65,65,65,65,70,75,80});

        hotelChain.setRates("Omicron", "Classic Double", {65,65,70,70,75,80,65});
        hotelChain.setRates("Omicron", "Classic Twin", {65,65,70,70,80,85,65});
        hotelChain.setRates("Omicron", "Classic Single", {50,50,50,60,75,75,50});
    }
}

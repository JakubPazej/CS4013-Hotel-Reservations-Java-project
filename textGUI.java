import java.util.Scanner;
import java.util.GregorianCalendar;
import java.io.*;
public class textGUI {   
    hotels_driver hotdrive = new hotels_driver();
    toReadCSV read = new toReadCSV();
    public textGUI() throws Exception{
        Scanner input = new Scanner(System.in);
        boolean start = true;
        int perType =0;
        String room = "";
        while(start==true) {
            System.out.println("Who are you? 1.Customer, 2.Desk, or 3.Supervisor?");
            perType = input.nextInt();
            start = false;
        }
        while(start==false) {
            if(perType==1){
                System.out.println("To make a reservation please press 1\nTo cancel a"+ 
                "reservation please press 2\nTo go back please press 3.");
                int choice = input.nextInt();
                if(choice==1) {
                    
                    
                    System.out.println("First name?");
                    String firstName =input.next();
                    System.out.println("Last name?");
                    String lastName =input.next();
                   
                    
                    System.out.println("Date of arrival? In format:(Year, Month, Day)");
                
                    int year=input.nextInt();
                    int month=input.nextInt();
                    int day=input.nextInt();
                    String date = (day+"-"+month+"-"+year);
                    //GregorianCalendar from = new GregorianCalendar(year,month,day);
                    //reservation.setFrom(year,month,day);
                
                    System.out.println("Date of departure? In format:(Year, Month, Day)");
                    int year2=input.nextInt();
                    int month2=input.nextInt();
                    int day2=input.nextInt();
                    String date2 = (day2+"-"+month2+"-"+year2);
                    System.out.println("What Hotel are you in?\n1.Upsilon.\n2.Theta.\n3.Omicron.");
                    int choice3 = input.nextInt();
                    String hotel="";
                    if(choice3==1) {
                        System.out.println("1.Deluxe_Double\n2.Deluxe_Twin\n3.Deluxe_Single\n4.Deluxe_Family");
                        int choice2=input.nextInt();
                        hotel = "Upsilon";
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
                    if(choice3==2) {
                        hotel = "Theta";
                        System.out.println("1.Executive_Double\n2.Executive_Twin\n3.Executive_Single");
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
                    if(choice3==3) {
                        hotel="Omicron";
                        System.out.println("1.Classic_Double\n2.Classic_Twin\n3.Classic_Single");
                        int choice2=input.nextInt();
                        if (choice2==1) {
                            room = "Classic Double";
                        }
                        if (choice2==2) {
                            room = "Classic Twin";
                        }
                        if (choice2==3) {
                            room = "Classic Single";
                        }
                    }
                    //GregorianCalendar till = new GregorianCalendar(year2,month2,day2);
                    System.out.println("Please press 1 for Standard Booking, and 2 for advanced");
                    int ree=input.nextInt();
                    if(ree==1) {
                        standard_booking stan = new standard_booking(firstName,lastName,date,date2,hotel,room);
                        stan.finishReservationS();
                        System.out.println("Reservation finished...");
                    }
                    else if(ree==2) {
                        advanced_purchase adv = new advanced_purchase(firstName,lastName,date,date2,hotel,room);
                        adv.finishReservationA();
                        System.out.println("Reservation finished...");
                    }
                }
                if(choice==2) {}//append cancelled at the end of reservation}
                if(choice==3) {
                    start=true;
                }
            }
            if(perType==2){
                System.out.println("To make a reservation please press 1\nTo cancel a"+ 
                "reservation please press 2\nTo check in a customer press 3\n"+
                "To check out a customer press 4\nTo go back press 5.");
                int choice = input.nextInt();
                if(choice==1) {
                    
                    
                    System.out.println("First name?");
                    String firstName =input.next();
                    System.out.println("Last name?");
                    String lastName =input.next();
                   
                    
                    System.out.println("Date of arrival? In format:(Year, Month, Day)");
                
                    int year=input.nextInt();
                    int month=input.nextInt();
                    int day=input.nextInt();
                    String date = (day+"-"+month+"-"+year);
                    //GregorianCalendar from = new GregorianCalendar(year,month,day);
                    //reservation.setFrom(year,month,day);
                
                    System.out.println("Date of departure? In format:(Year, Month, Day)");
                    int year2=input.nextInt();
                    int month2=input.nextInt();
                    int day2=input.nextInt();
                    String date2 = (day2+"-"+month2+"-"+year2);
                    System.out.println("What Hotel are you in?\n1.Upsilon.\n2.Theta.\n3.Omicron.");
                    int choice3 = input.nextInt();
                    String hotel="";
                    if(choice3==1) {
                        System.out.println("1.Deluxe Double\n2.Deluxe Twin\n3.Deluxe Single\n4Deluxe Family");
                        int choice2=input.nextInt();
                        hotel = "Upsilon";
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
                    if(choice3==2) {
                        hotel = "Theta";
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
                    if(choice3==3) {
                        hotel="Omicron";
                        System.out.println("1.Classic Double\n2.Classic Twin\n3.Classic Single");
                        int choice2=input.nextInt();
                        if (choice2==1) {
                            room = "Classic Double";
                        }
                        if (choice2==2) {
                            room = "Classic Twin";
                        }
                        if (choice2==3) {
                            room = "Classic Single";
                        }
                    }
                    //GregorianCalendar till = new GregorianCalendar(year2,month2,day2);
                    System.out.println("Please press 1 for Standard Booking, and 2 for advanced");
                    int ree=input.nextInt();
                    if(ree==1) {
                        standard_booking stan = new standard_booking(firstName,lastName,date,date2,hotel,room);
                        stan.finishReservationS();
                        System.out.println("Reservation finished...");
                    }
                    else if(ree==2) {
                        advanced_purchase adv = new advanced_purchase(firstName,lastName,date,date2,hotel,room);
                        adv.finishReservationA();
                        System.out.println("Reservation finished...");
                    }
                }
                if(choice==2) {}//append cancelled at the end of reservation}
                if(choice==3) {
                    System.out.println("Customer is checked in");
                }
                if(choice==4) {
                    System.out.println("Customer is checked out");
                }
                if(choice==5) {
                    start=true;
                }
            }
            if(perType==3){
                System.out.println("To make a reservation please press 1\nTo cancel a"+ 
                "reservation please press 2\nTo check in a customer press 3\n"+
                "To check out a customer press 4\nTo apply a discount press 5\n"+
                "To receive data analytics press 6\nTo go back press 7.");
                int choice = input.nextInt();
                if(choice==1) {
                    
                    
                    System.out.println("First name?");
                    String firstName =input.next();
                    System.out.println("Last name?");
                    String lastName =input.next();
                   
                    
                    System.out.println("Date of arrival? In format:(Year, Month, Day)");
                
                    int year=input.nextInt();
                    int month=input.nextInt();
                    int day=input.nextInt();
                    String date = (day+"-"+month+"-"+year);
                    //GregorianCalendar from = new GregorianCalendar(year,month,day);
                    //reservation.setFrom(year,month,day);
                
                    System.out.println("Date of departure? In format:(Year, Month, Day)");
                    int year2=input.nextInt();
                    int month2=input.nextInt();
                    int day2=input.nextInt();
                    String date2 = (day2+"-"+month2+"-"+year2);
                    System.out.println("What Hotel are you in?\n1.Upsilon.\n2.Theta.\n3.Omicron.");
                    int choice3 = input.nextInt();
                    String hotel="";
                    if(choice3==1) {
                        System.out.println("1.Deluxe Double\n2.Deluxe Twin\n3.Deluxe Single\n4Deluxe Family");
                        int choice2=input.nextInt();
                        hotel = "Upsilon";
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
                    if(choice3==2) {
                        hotel = "Theta";
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
                    if(choice3==3) {
                        hotel="Omicron";
                        System.out.println("1.Classic Double\n2.Classic Twin\n3.Classic Single");
                        int choice2=input.nextInt();
                        if (choice2==1) {
                            room = "Classic Double";
                        }
                        if (choice2==2) {
                            room = "Classic Twin";
                        }
                        if (choice2==3) {
                            room = "Classic Single";
                        }
                    }
                    //GregorianCalendar till = new GregorianCalendar(year2,month2,day2);
                    System.out.println("Please press 1 for Standard Booking, and 2 for advanced");
                    int ree=input.nextInt();
                    if(ree==1) {
                        standard_booking stan = new standard_booking(firstName,lastName,date,date2,hotel,room);
                        stan.finishReservationS();
                        System.out.println("Reservation finished...");
                    }
                    else if(ree==2) {
                        advanced_purchase adv =  new advanced_purchase(firstName,lastName,date,date2,hotel,room);
                        adv.finishReservationA();
                        System.out.println("Reservation finished...");
                    }
                }
                if(choice==2) {}//append cancelled at the end of reservation}
                if(choice==3) {
                    System.out.println("Customer is checked in");
                }
                if(choice==4) {
                    System.out.println("Customer is checked out");
                }
                if(choice==5) {
                    System.out.println("Im sorry, you do not meet the requirements for a discount");
                }
                if(choice==6) {
                    int numberOfRooms= read.nextRes();
                    System.out.println("There are currently "+numberOfRooms+" currently booked.\n");
                    
                }
                if(choice==7) {
                    start=true;
                }
            }
            
        }
    }
}


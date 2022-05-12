package travelagents;

import java.util.*;

public class TravelAgents {

    public static void main(String[] args) {
        LinkedList<Booking> holidays = new LinkedList<Booking>();
        String cabin = "";
        String Acco = "";
       
       Scanner scan = new Scanner (System.in);
       System.out.println("Welcome to your booking system. Press 1 to view your bookings, press 2 to add a new booking or press 3 to close the program. ");
       int menu = scan.nextInt();
       
       while (menu !=3) 
           
       if (menu == 1)
       {
           for (Booking book : holidays) {
               System.out.println(book);
           }
           
           System.out.println("Press 1 to view your bookings, press 2 to add a new booking or press 3 to close the program. ");
           menu = scan.nextInt();
           
       }
       else if (menu == 2)
               {
               System.out.println("Please select C for cruise, U for UK or I for international: ");
               String type = scan.next();
               //System.out.println(type);    
               
               if (type.compareTo("C")==0){
                   System.out.println("Would you like Sea View (1) or not (2)? ");
                   int whichCabin = scan.nextInt();
                   
                   if (whichCabin == 1){
                       cabin = "Sea View";                       
                   }
                   else if (whichCabin == 2){
                       cabin = "internal";
                   }
                   
                   System.out.println("Where from? ");
                   String dPort = scan.next();
                   
                   System.out.println("To? ");
                   String rPort = scan.next();
                   
                   System.out.println("How many people are going? ");
                   int numPeople = scan.nextInt();
                   
                   System.out.println("For how many nights? ");
                   int numNights = scan.nextInt();
                   int ppn = 100;
                   int pTotal = numPeople  * ppn * numNights;
                   
                   System.out.println("When from? (DD/MM/YY format) ");
                   String sDate = scan.next();                   
                   
                   System.out.println("Until? ");
                   String eDate = scan.next();
                   
                   holidays.add(new Cruise(cabin, dPort, rPort, ppn, numPeople, pTotal, sDate, eDate, numNights));
                   System.out.println("Press 1 to view your bookings, press 2 to add a new booking or press 3 to close the program. ");
                    menu = scan.nextInt();
               }
               
               else if (type.compareTo("U")==0){
                   System.out.println("Would you like a property (1) or a room (2)? ");
                   int whichAcco = scan.nextInt();
                   
                   if (whichAcco == 1){
                       Acco = "property";                       
                   }
                   else if (whichAcco == 2){
                       Acco = "room";
                   }
                                      
                   System.out.println("How many people are going? ");
                   int numPeople = scan.nextInt();
                   
                   System.out.println("For how many nights? ");
                   int numNights = scan.nextInt();
                   int ppn = 50;
                   int pTotal = numPeople  * ppn * numNights;
                   
                   System.out.println("When from? (DD/MM/YY format) ");
                   String sDate = scan.next();                   
                   
                   System.out.println("Until? ");
                   String eDate = scan.next();
                   
                   holidays.add(new UK(Acco, ppn, numPeople, pTotal, sDate, eDate, numNights));
                   System.out.println("Press 1 to view your bookings, press 2 to add a new booking or press 3 to close the program. ");
                    menu = scan.nextInt();
               }
               
               else if (type.compareTo("I")==0){                   
                   System.out.println("Where from? ");
                   String depA = scan.next();
                   
                   System.out.println("To? ");
                   String retA = scan.next();
                   
                   System.out.println("How many people are going? ");
                   int numPeople = scan.nextInt();
                   
                   System.out.println("For how many nights? ");
                   int numNights = scan.nextInt();
                   int ppn = 200;
                   int pTotal = numPeople  * ppn * numNights;
                   
                   System.out.println("When from? (DD/MM/YY format) ");
                   String sDate = scan.next();                   
                   
                   System.out.println("Until? ");
                   String eDate = scan.next();
                   
                   int flight = 7984;
                    holidays.add(new Inter(depA, retA, flight, ppn, numPeople, pTotal, sDate, eDate, numNights));
                    System.out.println("Press 1 to view your bookings, press 2 to add a new booking or press 3 to close the program. ");
                    menu = scan.nextInt();
               }
               
               else{
                   System.out.println("That was not a valid option, please try again.");                   
               }
               
               
               }
        
        

        
        
    }

}

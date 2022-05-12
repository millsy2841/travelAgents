/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagents;

/**
 *
 * @author m1601293
 */
public class Inter extends Booking {
    String depA; //departure airport
    String retA; //return airport
    int flight;
    
    Inter(){
        super();
        depA = "";
        retA = "";
        flight = 0;
    }
    
    Inter (String dA, String rA, int f, int n, int p, int t, String s, String e, int N){ 
        super(n, p, t, s, e, N);
        depA = dA;
        retA = rA;
        flight = f;
    }
    String getDepA(){
        return depA;
    }
    void setDepA(String dA){
        depA = dA;
    }
    String getRetA(){
        return retA;
    }
    void setRetA(String rA){
        retA = rA;
    }
    int getFlight(){
        return flight;
    }
    void setFlight(int f){
        flight = f;
    }
    String InterDeets(){
        String output;
        output = super.BookingDeets() + (" Your flight will depart from " + getDepA() + " and will arrive at " + getRetA() + ". Your flight number will be " + getFlight() + ".");
        return output;
    }
    @Override
    public String toString(){
        return "The cost of your international holiday will be " + ppn + " GBP per person per night, with " + numPeople + " people over " + numNights + " nights, starting from " + sDate + " before returning on " + eDate + ". This will produce the total price of " + pTotal + " GBP. Your flight will depart from " + depA + " and will arrive at " + retA + ". Your flight number will be " + flight + ".";
    }
}



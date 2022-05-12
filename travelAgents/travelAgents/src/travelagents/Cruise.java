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
public class Cruise extends Booking{
    String dPort;
    String rPort;
    String cabin; //internal or sea view
    
    Cruise(){
        super();
        dPort = "";
        rPort = "";
        cabin = "";
    }
    // (cabin, depart port, return port, price per night, numper of people, total price, start date, end date, number of nights)
    Cruise (String c, String d, String r, int n, int p, int t, String s, String e, int N){ 
        super(n, p, t, s, e, N);
        cabin = c;
        dPort = d;
        rPort = r;
    }
    String getDep(){
        return dPort;
    }
    void setDep(String d){
        dPort = d;
    }
    String getRet(){
        return rPort;
    }
    void setRet(String r){
        rPort = r;
    }
    String getCabin(){
        return cabin;
    }
    void setCabin(String c){
        cabin = c;
    }
    
    String CruiseDeets(){ 
        String output;
        output = super.BookingDeets() + (" Your cruise will depart from " + getDep() + " and will arrive in " + getRet() + ". Your cabin will be " + getCabin() + ".");
        return output;
    }

    @Override
    public String toString() {
        return "The cost of your cruise holiday will be " + ppn + " GBP per person per night, with " + numPeople + " people over " + numNights + " nights, starting from " + sDate + " before returning on " + eDate + ". This will produce the total price of " + pTotal + " GBP. Your cruise will depart from " + dPort + " and will arrive in " + rPort + ". Your cabin will be " + cabin + ".";
    }
//    toString will print String per class so cruise will be different UK and inter
    
    
}

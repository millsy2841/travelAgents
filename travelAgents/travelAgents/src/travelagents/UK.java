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
public class UK extends Booking {
    String Acco; //accomodation type (room or property)
    
    UK(){
        super();
        Acco = "";
    }
    
    UK (String A, int n, int p, int t, String s, String e, int N){ 
        super(n, p, t, s, e, N);
        Acco = A;
    }
    String getAcco(){
        return Acco;
    }
    void setAcco(String A){
        Acco = A;
    }
    String ukDeets(){
        String output;
        output = super.BookingDeets() + (" Your accomodation type will be a " + getAcco() + ".");
        return output;
    }
    @Override
    public String toString(){
        return "The cost of your UK holiday will be " + ppn + " GBP per person per night, with " + numPeople + " people over " + numNights + " nights, starting from " + sDate + " before returning on " + eDate + ". This will produce the total price of " + pTotal + " GBP. Your accomodation type will be a " + Acco + ".";
    }
}

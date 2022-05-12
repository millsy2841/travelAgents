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
public class Booking {
    

    int ppn; //price per person per night
    int numPeople;
    int pTotal; //ppn * numPeople * numNights (total price)
    String sDate; //start date
    String eDate; //end date
    int numNights;
    
    Booking(){
        ppn = 0;
        numPeople = 0;
        pTotal = 0;
        sDate = "";
        eDate = "";
        numNights = 0;
    }
    
    Booking (int n, int p, int t, String s, String e, int N){
        ppn = n;
        numPeople = p;
        pTotal = t;
        sDate = s;
        eDate = e;
        numNights = N;
    }
    
    int getPPN(){
        return ppn;
    }
    void setPPN(int n){
        ppn = n;
    }
    int getPeople(){
        return numPeople;
    }
    void setPeople(int p){
        numPeople = p;
    }
    int getTotal(){
        return pTotal;
    }
    void setTotal(int t){
        pTotal = t;
    }
    String getStart(){
        return sDate;
    }
    void setStart(String s){
        sDate = s;
    }
    String getEnd(){
        return eDate;
    }
    void setEnd(String e){
        eDate = e;
    }
    int getNights(){
        return numNights;
    }
    void setNights(int N){
        numNights = N;
    }
    String BookingDeets(){//deets = details
        String output;
        output = ("The cost of your booking will be " + getPPN() + " GBP per person per night, with " + getPeople() + " people over " + getNights() + " nights, starting from " + getStart() + " before returning on " + getEnd() + ". This will produce the total price of " + getTotal() + " GBP.");
        return output;
    }   
}
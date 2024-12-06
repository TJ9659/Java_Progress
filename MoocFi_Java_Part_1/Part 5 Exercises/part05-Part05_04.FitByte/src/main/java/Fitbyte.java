/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        //double maximumHeartRate = (206.3 - (0.711 * this.age));
        return ((calculateMaximumHeartRate() -this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate);
    }
    
    private double calculateMaximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    
}

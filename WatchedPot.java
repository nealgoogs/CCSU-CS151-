//Niall Geoghegan
//CS 151
//Homework 1

import java.util.Scanner;
import java.lang.Math.*;

public class WatchedPot {
  
  public static void main (String[] args){
    
    final double HEIGHT = 5;
    final double RADIUS = 10;
    double volume;
    double minutes;
    final double STARTING_HEAT = 20;
    final double HEAT_RATE = 250;
    double timeToHeat;
              
    volume = Math.PI * HEIGHT * RADIUS * RADIUS;
    System.out.println("The volume of the water in this glass is " + volume + " cubic meters.");
       
    timeToHeat = (((100 - STARTING_HEAT) * volume)/ HEAT_RATE)/60;
    System.out.println("Time to boil: " + timeToHeat + " minutes");
    
  }
}
//CS 151 Niall Geoghegan
//beeesssss
import java.lang.Math;

public class HungryHoneyBees{

  public static void main (String[] args){
    int day = 0;
    int startingFlowers = 50;
    int beePopulation = 1000;
        
    while(beePopulation<=100000){
      day++;
      beePopulation *= 1.2;
      startingFlowers += 20;
      int flowersDevoured = ((int) Math.ceil(beePopulation/1500.0));
      int flowersRemaining = startingFlowers - flowersDevoured;
      System.out.println("Day " + day + "\tBeePopulation: " + beePopulation + "\tflowersDevoured " + flowersDevoured + "\tflowersRemaining " + flowersRemaining);      
    }
  }
}
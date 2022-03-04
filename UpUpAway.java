import java.util.Scanner;

public class UpUpAway {
  
  public static void main (String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    final double PI = 3.1415;
    double diameter;
    final int RATE_OF_INFLATION = 1;
    double volume;
    double time;
    
    System.out.println("How big do you want your balloon?");
    diameter = scan.nextInt();
    
    volume = 4/3 * PI * (diameter * diameter * diameter);
    System.out.println("Volume is: " + volume);
    
    time = volume / 1000;
    System.out.println("Time to inflation(minutes): " + time);
  } 
  
}
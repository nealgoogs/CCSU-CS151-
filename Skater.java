//Niall Geoghegan
//CS 151

import java.util.Scanner;
import java.lang.Math.*;

public class Skater{
  
  public static void main (String[]args){
    
    double length;
    double sides;
    double apothem;
    double smoothness;
    double absoluteLength;
    double absoluteSides;
    double absoluteApothem;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a length: ");
    length = scan.nextDouble();
    absoluteLength = Math.abs(length);
    
    System.out.print("Enter a number of sides: ");
    sides = scan.nextDouble();
    absoluteSides = Math.abs(sides);
    
    System.out.print("length of apothem: ");
    apothem = scan.nextDouble();
    absoluteApothem = Math.abs(apothem);
    
    smoothness = (absoluteApothem + Math.sqrt(absoluteSides/absoluteLength));
    System.out.print("Smoothness is: ");
    System.out.print(smoothness);
  }
}
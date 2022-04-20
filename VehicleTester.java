//Niall Geoghegan
//Homework 4a

import java.util.Scanner;

public class VehicleTester{
  
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("For vehicle 1: ");
    System.out.print("How many wheels? ");
    int wheels1 = scan.nextInt();
    scan.nextLine();
    System.out.print("Does it have wings (y/n)? ");
    String doesItHaveWings = scan.nextLine();
    
    boolean hasWings1;
    if(doesItHaveWings.equals("y"))
      hasWings1 = true;
    else
      hasWings1 = false;
    
    System.out.print("Does it have an engine (y/n)? ");
    String doesItHaveEngine = scan.nextLine();
    
    boolean hasEngine1;
    if(doesItHaveEngine.equals("y"))
      hasEngine1 = true;
    else
      hasEngine1 = false;
    System.out.println(hasEngine1);
    
    Vehicle typeOfVehicle = new Vehicle(wheels1, hasWings1, hasEngine1);
    
    System.out.println("isBicycle: " + typeOfVehicle.isBicycle());
    System.out.println("isMotorcycle: " + typeOfVehicle.isMotorcycle());
    System.out.println("isSkateboard: " + typeOfVehicle.isSkateboard());
    System.out.println("isCar: " + typeOfVehicle.isCar());
    System.out.println("isAirplane: " + typeOfVehicle.isAirplane());
    System.out.println("Vehicle is " + typeOfVehicle);
    
    System.out.println("\n");
    System.out.println("For vehicle 2: ");
    System.out.print("How many wheels? ");
    int wheels2 = scan.nextInt();
    scan.nextLine();
    System.out.print("Does it have wings (y/n)? ");
    String doesItHaveWings2 = scan.nextLine();
    
    boolean hasWings2;
    if(doesItHaveWings2.equals("y"))
      hasWings2 = true;
    else
      hasWings2 = false;
    
    System.out.print("Does it have an engine (y/n)? ");
    String doesItHaveEngine2 = scan.nextLine();
    
    boolean hasEngine2;
    if(doesItHaveEngine2.equals("y"))
      hasEngine2 = true;
    else
      hasEngine2 = false;
    
    Vehicle typeOfVehicle2 = new Vehicle(wheels2, hasWings2, hasEngine2);
    
    System.out.println("isBicycle: " + typeOfVehicle2.isBicycle());
    System.out.println("isMotorcycle: " + typeOfVehicle2.isMotorcycle());
    System.out.println("isSkateboard: " + typeOfVehicle2.isSkateboard());
    System.out.println("isCar: " + typeOfVehicle2.isCar());
    System.out.println("isAirplane: " + typeOfVehicle2.isAirplane());
    System.out.println("Vehicle is " + typeOfVehicle2);
    
    System.out.println("\nAre both vehicles the same? " + typeOfVehicle.equals(typeOfVehicle2));
    
  }
}
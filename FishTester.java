//Niall Geoghegan
//Extra Credit

import java.util.Scanner;

public class FishTester{
  
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hours of pole rental? ");
    int poleRentalOne = scan.nextInt();
    scan.nextLine();
    System.out.println("Number of worms? ");
    int numberOfWorms = scan.nextInt();
    scan.nextLine();
    System.out.println("Number of fish caught? ");
    int numberOfFishCaught = scan.nextInt();
    scan.nextLine();
    
    boolean customerCaughtFish;
    if(numberOfFishCaught <= 0)
      customerCaughtFish = false;
    else
      customerCaughtFish = true;
    System.out.println(customerCaughtFish);
  }
  
}
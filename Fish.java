//Niall Geoghegan
//Extra Credit

import java.util.Scanner;

public class Fish{
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hours of pole rental? ");
    int poleRental = scan.nextInt();
    scan.nextLine();
    System.out.println("Number of worms? ");
    int numberOfWorms = scan.nextInt();
    scan.nextLine();
    System.out.println("Number of fish caught? ");
    int numberOfFishCaught = scan.nextInt();
    scan.nextLine();
    
    System.out.println("Prices: ");
    
    double price = 0;
    
    if(poleRental>6){
      price = 20;
    }else{
      price = 5*poleRental;
    }
    
    
    double wormPrice = 0;
    wormPrice = numberOfWorms;
    if(numberOfWorms>4){
       wormPrice = ((numberOfWorms - 4)* .1)+4;
    }
    
    boolean noFishCaught;
    if(numberOfFishCaught == 0){
      noFishCaught = true;
      wormPrice = 0;
    }else
      noFishCaught = false;
    
    double totalPrice = price + wormPrice;
    
    System.out.printf("Pole Rental: $% .2f\n", price);
    System.out.printf("wormPrice:   $% .2f\n", wormPrice);
    System.out.printf("TOTAL PRICE: $% .2f\n", totalPrice);
    
  }
}

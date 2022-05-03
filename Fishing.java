//Niall Geoghegan
//Extra Credit

import java.util.Scanner;

public class Fishing {
  
  private int poleRental;
  private int worms;
  private int fishCaught;
  
  public Fishing(int poleRental, int worms, int fishCaught){
    this.poleRental = poleRental;
    this.worms = worms;
    this.fishCaught = fishCaught;
  }
  
  public boolean noFishCaught(){
    return (fishCaught<0);
  }
  
  
}

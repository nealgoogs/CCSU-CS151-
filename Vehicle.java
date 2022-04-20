//Niall Geoghegan
//Homework 4a

public class Vehicle{
  
  private int wheels;
  private boolean hasWings;
  private boolean hasEngine;
  
  public Vehicle (int wheels, boolean hasWings, boolean hasEngine){
    this.wheels = wheels;
    this.hasWings = hasWings;
    this.hasEngine = hasEngine;
  }
  
  public boolean isBicycle() {
    return (wheels == 2 && !hasWings && !hasEngine); 
  }
  
  public boolean isMotorcycle() {
    return (wheels == 2 && !hasWings && hasEngine);   
  }
  
  public boolean isSkateboard() {
    return (wheels == 4 && !hasWings && !hasEngine); 
  }
  
  public boolean isCar() {
    return (wheels == 4 && !hasWings && hasEngine);    
  }
  
  public boolean isAirplane() {
    return (hasWings);  
  }
   
  public String toString() {
    if(isBicycle())     
      return "Bicycle"; 
    else if(isMotorcycle())
      return "Motorcycle";
    else if(isSkateboard()) 
      return "Skateboard";
    else if(isSkateboard()) 
      return "Skateboard";
    else if(isCar())     
      return "Car";   
    else if(isAirplane())  
      return "Airplane";
    else
      return "Unknown";
    }
            
  public boolean equals(Vehicle other) {
        return((wheels == other.wheels) && (hasWings == other.hasWings)
                && (hasEngine == other.hasEngine));
    }



}
  

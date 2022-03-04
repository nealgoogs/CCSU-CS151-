public class Car{
  
  double gasGallons = 0.0;
  boolean isRunning = false;
  
  public void addGas( double gallonsOfGas  ){
    gasGallons += gallonsOfGas;
  }
  
  //accessor or getter 
  public double getGasGallons(){
    return gasGallons;
  }
  //mutator or setter
  public void setGasGallons(double gallonsOfGas){
    gasGallons = gallonsOfGas;
  }
  
   
  public void startEngine(){
    System.out.println("Engine noises");
    isRunning = true;
  }
  
  public boolean isEngineRunning(){
    return isRunning;
  }
  
}
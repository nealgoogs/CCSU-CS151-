public class Drive{
  
  public static void main(String[] args){
    
    //creat a car object
    Car chevy = new Car();
    
    
    
    //Call a method to start the engine
    chevy.startEngine();
    System.out.println("The car is running: " + chevy.isEngineRunning());
    
    //add some gas
    chevy.addGas(12.5 );
    System.out.println("Gas gauge says: " + chevy.getGasGallons());
    
    //drive until the gas tank is empty
    chevy.setGasGallons(0.0);
    System.out.println("drive until the gas tank is empty");
    System.out.println("Gas gauge says: " + chevy.getGasGallons());
    
  }
  
}
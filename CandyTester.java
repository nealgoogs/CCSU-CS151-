public class CandyTester {

  String name;
  String type;
  
  public static void main(String[] args) {

    // create three coffees and assign brand/flavor
    CandyTester candy1 = new CandyTester();
    candy1.setBrand("KitKat");
    candy1.setType("Chocolate");
    System.out.println(candy1.getBrand());
    System.out.println(candy1.getType());
}
public void setBrand (String name){
  this.name = name;
}

public void setType (String type){
  this.type = type;
}
public String getBrand(){
  return this.name;
}
public String getType(){
  return this.type;
}
}
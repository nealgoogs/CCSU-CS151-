//CS 151
//Niall Geoghegan

public class Coffee{
  private String brand;
  private String flavor;
  private boolean match;

  public void setBrand (String brand){
    this.brand = brand;
  }
  public void setFlavor (String flavor){
    this.flavor = flavor;
  }
  public String getBrand(){
    return this.brand;
  }
  public String getFlavor(){
    return this.flavor;
  }
  public String toString(){
    return brand + "(" + flavor + ")";
  }
  boolean equals(Coffee match){
    return(brand.equals(match.brand) && flavor.equals(match.flavor));
  }

  
}
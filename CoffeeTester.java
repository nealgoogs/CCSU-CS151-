// Jeff Blankenship
// CS-151 Spring 22 Homework 3
// This is a test class to use the methods of Coffee class

public class CoffeeTester {

  public static void main(String[] args) {

    // create three coffees and assign brand/flavor
    Coffee coffee1 = new Coffee();
    coffee1.setBrand("Starbucks");
    coffee1.setFlavor("Mocha");

    Coffee coffee2 = new Coffee();
    coffee2.setBrand("Dunkin");
    coffee2.setFlavor("regular");

    Coffee coffee3 = new Coffee();
    coffee3.setBrand("Dunkin");
    coffee3.setFlavor("regular");

    // display the coffees
    System.out.println("coffee1 is: " + coffee1);
    System.out.println("coffee2 is: " + coffee2);
    System.out.println("coffee3 is: " + coffee3);

    // test if coffees are equal
    System.out.println("coffee1.equals(coffee2): " + coffee1.equals(coffee2));
    System.out.println("coffee2 == coffee3:      " + (coffee2 == coffee3));
    System.out.println("coffee2.equals(coffee3): " + coffee2.equals(coffee3));

  }
  
}
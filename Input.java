import java.util.Scanner;

public class Input{
  
  public static void main(String[] args){
    
    //need a scanner for input
    Scanner keyboard = new Scanner(System.in);
    
    //flag to indicate valid input
    boolean valid = false;
    
    int age=0;
    while (!valid) {
      System.out.print("Enter your age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      if ( age>=0  && age<=100){
        valid = true;
      } else {
        System.out.println("must be from 0 to 100 inclusive.  Try again.");
      }
    }
    System.out.println("Valid input for age, age is: " + age +"\n\n");

    //Ask user if they are hungry (y/n)
    String hungry = "";
    valid = false;
    while (!valid){
      System.out.print("Are you hungry (y/n) ? ");
      hungry = keyboard.nextLine();
      hungry = hungry.toLowerCase();
      if (  hungry.equals("y") || hungry.equals("n")
            || hungry.equals("yes") || hungry.equals("no")){
        valid = true;
      } else {
        System.out.println("must be y or n, try again.");
      }
      System.out.println("Valid input for hungry: " + hungry);
    }
    

  }
}







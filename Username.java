//Niall Geoghegan
//CS 151

import java.util.Scanner;
import java.lang.Math.*;

public class Username{
  
  public static void main (String[]args){
    
    Scanner scan = new Scanner(System.in);
    
    String firstName;
    String initials;
    String lastName;
    String lastInitials;
    int randomizer;
    int min = 0;
    int max = 10000;
    String finalName;
    
    System.out.print("Enter your first name: ");
    firstName = scan.nextLine();
    
    initials = firstName.substring(0,2);
    
    System.out.print("Enter your last name: ");
    lastName = scan.nextLine();
    
    lastInitials = lastName.substring(0,2);
    
    randomizer = (int)Math.floor(Math.random()*(max-min+1)+min);
        
    finalName = initials + lastInitials + randomizer;
    System.out.print("Your username is: " + finalName);
    
    
  }
}
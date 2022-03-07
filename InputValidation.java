//CS 151 InputValidation
//Niall Geoghegan

import java.util.Scanner;

public class InputValidation{
  
  public static void main (String[] args){
    
  Scanner scan = new Scanner(System.in);
  
  boolean authorized = false;
    
    int flavorsPerDay=0;
    while (!authorized) {
      System.out.print("How many flavors distributed per day? (1-5) ");
      flavorsPerDay = scan.nextInt();
      scan.nextLine();
      if ( flavorsPerDay>=1  && flavorsPerDay<=5){
        authorized = true;
      } else {
        System.out.println("Please enter a number between 1-5");
      }
    }
    System.out.println(flavorsPerDay + "\n");
    
    String partyTime = "";
    int amountOfParties=0;
    authorized = false;
    while (!authorized) {
      System.out.print("How many parties will you throw? (0-50) ");
      amountOfParties = scan.nextInt();
      scan.nextLine();
      if ( amountOfParties>=0  && amountOfParties<=50){
        authorized = true;
      } else {
        System.out.println("Please enter a number between 0-50");
      }
    }
    System.out.println(amountOfParties);
    
  
  
  
  System.out.println("Mon\tTues\tWed\tThurs\tFri\tSat\tSun");
    int count=1;
    while ( count <= amountOfParties){
      if (count%7==1){
        System.out.print("\n");
      }
      System.out.print(count*flavorsPerDay + "\t");
      count++;

        
      }
   }
}

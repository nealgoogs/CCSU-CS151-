//Niall Geoghegan
//CS 151

import java.util.Scanner;

public class JavaNames{
  
  public static void main (String [] args){
    
    Scanner scan = new Scanner(System.in);
    
    String name1;
    String name2;
    String name3;
    String name4;
    boolean isBanana = false;
    
    System.out.print("Enter your name: ");
    name1 = scan.nextLine();
    
    System.out.print("UpperCase: ");
    name2 = name1.toUpperCase();
    System.out.println(name2);
    
    System.out.print("lower case: ");
    name3 = name1.toLowerCase();
    System.out.println(name3);
    
    //Needs fix
    //tr sed awk PCRE
    System.out.print("e is 3 and a is 8: ");
    name4 = name1.replaceAll("e","3").replaceAll("a","8");
    System.out.println(name4);
    
    System.out.print("Contains banana: ");
    isBanana = name1.contains("banana");
    System.out.print(isBanana);
  }
  
}
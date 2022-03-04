//Niall Geoghegan
//CS 151
//Homework 1

import java.util.Scanner;

public class TuringTest{
  
  public static void main (String [] args){
    
    String message;
    int age;
    boolean college;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is your name? ");
    
    message = scan.nextLine();
    
    System.out.println("How old are you?");
    
    age = scan.nextInt();
    
    System.out.println("Is it true you are in college?");
    
    college = scan.nextBoolean();
    
    System.out.println("My name is " + message + " and I am \n" + age + " years old");
    System.out.println("I am in college. This statement happens to be " + college);
    
    
  }
}
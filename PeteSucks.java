//Niall Geoghegan
//Homework 4b

import java.util.Scanner;

public class PeteSucks{
  
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    double[] gradesList = new double[5];
    
    
    for(int index = 0; index<gradesList.length; index++){
      System.out.println("Enter in a score: ");
    gradesList[index] = scan.nextDouble();
      
    }
    
    //System.out.println("First grade? ");
    //gradesList[0] = scan.nextDouble();
    //System.out.println("Second grade? ");
    //gradesList[1] = scan.nextDouble();
    //System.out.println("Third grade? ");
    //gradesList[2] = scan.nextDouble();
    //System.out.println("Fourth grade? ");
    //gradesList[3] = scan.nextDouble();
    //System.out.println("Fifth grade? ");
    //gradesList[4] = scan.nextDouble();
    
    double maxNum = gradesList[0];
    int maxIndex = 0;
    
    for (int index = 0; index<gradesList.length; index++){
      if (gradesList[index] > maxNum){
        maxNum = gradesList[index];
        maxIndex = index;
        
        
      }
    }
    maxIndex = 0;
    gradesList[maxIndex] = 0.0;
    int sum = 0;
    
    for (int index=0; index<gradesList.length; index++){
      sum += gradesList[index];
    }
   System.out.println("The new score with max value removed is: " + sum);
    
  }
  
}
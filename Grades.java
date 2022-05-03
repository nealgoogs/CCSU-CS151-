//Niall Geoghegan
//Homework 4b

import java.util.Scanner;

public class Grades {
  
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    double[] gradesList = new double[4];
    
    System.out.println("First grade? ");
    gradesList[0] = scan.nextDouble();
    System.out.println("Second grade? ");
    gradesList[1] = scan.nextDouble();
    System.out.println("Third grade? ");
    gradesList[2] = scan.nextDouble();
    System.out.println("Fourth grade? ");
    gradesList[3] = scan.nextDouble();
    
    double sum = 0.0;
    
    for (int index = 0; index<gradesList.length; index++){
      
      if(gradesList[index]<0){
        gradesList[index] = 0;
      }
      if(gradesList[index]>100){
        gradesList[index] = 100;
      }
      sum = sum +=gradesList[index];
    }
     System.out.println("The sum is: " + sum);
     System.out.println("The average grade is: " + sum/gradesList.length);
     double GPA = 0.0;
     if(sum/gradesList.length>93){
       GPA = 4.0;
     }
     else if(sum/gradesList.length>90){
       GPA = 3.7;
     }
     else if(sum/gradesList.length>=87){
       GPA = 3.3;
     }
     else if(sum/gradesList.length>83){
       GPA = 3.0;
     }
     else if(sum/gradesList.length>80){
       GPA = 2.7;
     }
     else if(sum/gradesList.length>77){
       GPA = 2.3;
     }
     else if(sum/gradesList.length>73){
       GPA = 2.0;
     }
     else if(sum/gradesList.length>70){
       GPA = 1.7;
     }
     else if(sum/gradesList.length>67){
       GPA = 1.3;
     }
     else if(sum/gradesList.length>65){
       GPA = 1.0;
     }
     else {
       GPA = 0.0;
     }
    
    System.out.print("Your GPA is: " + GPA);
    
  }
}
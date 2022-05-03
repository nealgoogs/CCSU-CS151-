
public class ArrayPractice{
  
  public static void main(String[] args){
    String[] names = new String[5];
    
    names[0] = "Andy";
    names[1] = "Buzz";
    names[2] = "Woody";
    names[3] = "Jessie";
    names[4] = "Stinky Pete";
    
    for(int index=0; index< names.length  ; index++){
      names[index] = "Name " + index + " is " 
                    +names[index].toLowerCase();
      System.out.println(names[index]);
    }
    
    int[] numbers = {-5,-10,-25,-14};
    int sum = 0;
    
    for(int index=0; index<numbers.length; index++){
      sum += numbers[index];
    }    
    System.out.println("sum is: " + sum);
    
    //this does the conversion before the math
    double average = (double)sum / numbers.length;
    System.out.println("average is: " + average);
    
    //this does the math before the conversion
    average = (double)(sum / numbers.length);
    System.out.println("average is: " + average);
    
    int max=numbers[0];
    
    for (int index=0; index<numbers.length; index++){
      if (numbers[index] > max){
        max = numbers[index];
      }
    }
    System.out.println("Maximum value is: " + max);
    
    
    
    
  }
  
}
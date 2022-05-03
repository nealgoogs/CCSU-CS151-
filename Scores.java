//Niall Geoghegan
//Question 1 Test

public class Scores {
  
  // YOU WRITE THIS METHOD
  //private static .......
  public static double average(double score1,double score2,double score3){
    if(score1<score2 &&  score1<score3){
          return (score2+score3)/2;
    }
    else if(score2<score1 && score2<score3){
           return (score1+score3)/2;
    }
    else if(score3<score2 && score3<score1){
           return (score1+score2)/2;
    }
    return 0;
}
  
  
  public static void main (String[] args){
    
    double score1 = 100.0;
    double score2 = 50.0;
    double score3 = 90.0;
    System.out.println("Average of best two is:  " + average(score1,score2,score3));
    
    score1 = 100.0;
    score2 = 95.0;
    score3 = 80.0;
    System.out.println("Average of best two is:  " + average(score1,score2,score3));
    
    score1 = 10.0;
    score2 = 95.0;
    score3 = 80.0;
    System.out.println("Average of best two is:  " + average(score1,score2,score3));
    
    
    
  }
  
}
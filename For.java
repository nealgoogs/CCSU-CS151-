
public class For{
  
  public static void main(String[] args){
  double index = 0;
  double index2 = 0;
    for(index = 0; index<5; index++){
      for(index2 = 5; index2>=5; index2++){
        index2+=.1;
      }
      index++;
    }
    
    System.out.println(index);
  }
}
public class Weird{
public static void main (String args[]){
System.out.print("Multiplication table\n");
int i=1;
while(i<=10){ 
int j=1; 
    while(j<=10){
     System.out.print(i*j+"\t");
     j+=7;
            }
            i+=4;
            System.out.println();
        }
         
    }
}
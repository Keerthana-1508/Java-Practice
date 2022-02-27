 import java.util.Scanner;  
class Main {  
 private static Scanner in; 
 public static void main(String[] args) {  

double firstNumber,secondNumber,result; 
  
     System.out.println("Enter the two numbers :");
     in = new Scanner(System.in);
     firstNumber=in.nextDouble();
     secondNumber=in.nextDouble();
        try
        {
        result=firstNumber/secondNumber;
        System.out.println("Result is : "+result);
        }
        //catching the exception
        catch(Exception e)
        {
             System.out.println("Error in division ");
                        
        }                
   }
}
import java.util.*;
public class Palendrom
{  
   public static void main(String[] args) 
   {  
    
       Scanner sc = new Scanner(System.in);  // for get input from user
       System.out.println("Enter the number: ");  
       String reverse = ""; //reverse is inbuilt 
       String num = sc.nextLine(); //get no from user
       int length = num.length();   //calculate the length of no
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + num.charAt(i);  //formula
      if (num.equals(reverse))  //condition for palendrom 
         System.out.println("The entered string " +num +" is a palindrome.");  
      else  
         System.out.println("The entered string " +num +"  isn't a palindrome.");     
  }
} 
import java.util.*;
class Test{
	Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
}
class arithmatic extends Test{
	void Arithmatic() {
		/* Arithmatic Operations*/
		System.out.println("The Addition of Two number is :"+(num1+num2));
		System.out.println("The Subtaction of Two number is :"+(num1-num2));
		System.out.println("The MUltiplition of Two number is :"+(num1*num2));
		System.out.println("The division of Two number is :"+(num1/num2));	
	}
}
class logical extends Test{
	void logic() {
		/* Logical operator */
    if(num1>num2 && num2==num1) {
    	System.out.println("number 1 is greater than or equals to number 2 ");
    }
    else
    {
    	System.out.println("number 2 is greater than or equals to number 1");
    }
	}	
}
class bitwise extends Test{
	void bit(){
		/* Bitwise operator */
			int result;
			result=num1 | num2;
			System.out.println("bitwise or : "+result);
			result=num1 & num2;
			System.out.println("bitwise and: "+result);
			result=num1 ^ num2;
			System.out.println("bitwise XOR: "+result);
		}
  }

public class Hirach {
 public static void main(String[] args) {
	System.out.println("enter the two no :");
	 arithmatic a=new arithmatic();
 	 logical l=new logical();
 	 bitwise b=new bitwise();
 	 a.Arithmatic();
 	 l.logic();
 	 b.bit();
}
}
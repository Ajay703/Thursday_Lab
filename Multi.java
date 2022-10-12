import java.util.*;
class prime{
	Scanner a=new Scanner(System.in);
	void prime() {
	System.out.println("Enter the number :");
	int number=a.nextInt(); // to get value from user
	int temp1=0,m=0;
	m=number/2; //formula
	if(number==0||number==1) //to check number is not prime
	{
		System.out.println("A number is not prime number :" + number);
	}
	else {
		for(int i=2;i<=m;i++) //condition
		{
			if(number%i==0) // to check number is not prime
			{
				System.out.println("A number is not prime number :"+number);
				temp1=1;
				break;
			}
		}
		if(temp1==0)
		{
			System.out.println("A number is a prime number :"+number);
		}
	}
}
}
class Swapping extends prime{
	void Swap() {
		System.out.println("4th Swapping Numbers using three variables ");
		System.out.println("enter a number1 :");
		int num1=a.nextInt();
		System.out.println("enter a number2 :");
		int num2=a.nextInt();
		int num3 = 0;
		System.out.println("before Swapping :"+num1+" "+num2);
		num3=num1; 
		num1=num2;  //swapping
		num2=num3;
		System.out.println("After Swapping :"+num1+" "+num2);
	}
}
class avg extends Swapping{
  String name ="Suraj";
  int Total=0;
  int sub[]=new int[5];
  void marks() {
	  System.out.println("Enter the 5 subject marks :");
	  for(int i=0;i<5;i++) {
		  sub[i]=a.nextInt(); //input from user
		  Total+=sub[i];
	  }
	  for(int i=0;i<5;i++) {
		  System.out.println(sub[i]); //print marks
	  }
	  System.out.println("The of Student is :"+name);
	  System.out.println("The total mark is :"+Total);
	  int average=Total/5;
	  System.out.println("The average of marks is :"+average); //average of marks
  }
}
public class Multi {
public static void main(String[] args) {
	avg obj=new avg();
	obj.prime();
	obj.Swap();
	obj.marks();
}
}
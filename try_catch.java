import java.util.*;
public class try_catch {
Scanner sc=new Scanner(System.in);
int a,b,n;
int arr[]=new int[n];
int c=sc.nextInt();

void arithmatic() {
if(c==1) {
try
{ 
  System.out.println("Enter the value of a :");
  a=sc.nextInt();
  System.out.println("Enter the value of b :");
  b=sc.nextInt();
  int add=a+b;
  System.out.println("The addition of a and b :"+add); 
}
catch(Exception e) {
	System.out.println("Arithmatic exception");
}
}
}
void ArrayExcept() {
	if(c==2) {
	try
	{
		arr[6]=78;
		System.out.println("The value of array is :"+arr[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Exception");
	}
	finally {
		System.out.println("This is finally block");
	}
}
}

void multiple() {
	if(c==3) {
	try {
		  System.out.println("Enter the value of a :");
		  a=sc.nextInt();
		  System.out.println("Enter the value of b :");
		  b=sc.nextInt();
		  int add=a+b;
		  System.out.println("The additio of a and b :"+add); 
		  
		  System.out.println("Enter the size of array : ");
		  n=sc.nextInt();
		  System.out.println("Enter the array elements");
		  for(int i=0;i<5;i++)
		  {
			    arr[i]=sc.nextInt();
		  }
		  
		  String name;
		  name=null;
		  System.out.println("Enter name here :");
		  name=sc.next();
		  System.out.println("The name is"+name.hashCode());
	}
	catch(ArithmeticException e1) {
		System.out.println("Arithmatic exception");
	}
	catch(ArrayIndexOutOfBoundsException e2) {
		System.out.println("Array exception");
	}
	catch(NullPointerException e3)
	{
		System.out.println("Null Exception");
	}
	finally {
		System.out.println("The second finally block");
	}
}
}
void nested() {
	if(c==4) {
	try {
		  System.out.println("Enter the value of a :");
	   	  a=sc.nextInt();
		  System.out.println("Enter the value of b :");
		  b=sc.nextInt();
		  int add=a+b;
		  System.out.println("The additio of a and b :"+add); 
	   try {
		   System.out.println("Enter the size of array : ");
			  n=sc.nextInt();
			  System.out.println("Enter the array elements");
			  for(int i=0;i<5;i++)
			  {
				    arr[i]=sc.nextInt();
			  }
	       try {
	    	   String name;
	 		  name=null;
	 		  System.out.println("Enter name here :");
	 		  name=sc.next();
	 		  System.out.println("The name is"+name.hashCode());
	    	   
	       }
	       catch(NullPointerException e3)
	   	   {
	   		System.out.println("Null Exception");
	   	   }
	   }  
	    catch(ArrayIndexOutOfBoundsException e2)
	    {
	   		System.out.println("Array exception");
	   	}
	 catch(ArithmeticException e1) 
	 {
	   		System.out.println("Arithmatic exception");
	 }
	}   
	finally 
	{
	   		System.out.println("The Third finally block");
	}
}
}
public static void main(String[] args) {
	System.out.println("Enter your choice :");
	System.out.println("1:Arithmatic Exception");
	System.out.println("2:Array Exception");
	System.out.println("3:Multiple Exception");
	System.out.println("4:Nested Exception");
	try_catch t=new try_catch();
	t.arithmatic();
	t.ArrayExcept();
	t.multiple();
	t.nested();
}
}
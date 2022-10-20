import java.util.*;
public class Boxing_unboxing {
	Scanner sc=new Scanner(System.in);
	int a;
	void boxing(){
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		Integer it=new Integer(a);
		if(it>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}
	void unboxing(){
		System.out.println("Enter the value of a :");
		Integer it1=sc.nextInt();
		int a=it1;
		if(a%3==0) {
			System.out.println("The number is divisible by 3");
		}
		else {
			System.out.println("The number is not divisible by 3");
		}
	}	

public static void main(String[] args) {
	Boxing_unboxing h=new Boxing_unboxing();
	h.boxing();
	h.unboxing();
}
} 
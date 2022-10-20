import java.util.*;
public class Garbage_Collection {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	public void finalize(){
	
	if(a<b) {
		System.out.println("The greater number is "+b);
	}
	else {
		System.out.println("The greater number is "+a);
	}
}

public static void main(String[] args) {
	System.out.println("enter the two no :");
	Garbage_Collection e=new Garbage_Collection();
	e=null;
	System.gc();
}
}
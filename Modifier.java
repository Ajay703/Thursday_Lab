import Ajay.*;
import java.util.Scanner;
public class Modifier {
	Scanner sc=new Scanner(System.in);
	public int a;
	public int b;
	private int x;
	protected int y;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	protected void sum_d() {
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int Sum=a+b;
		System.out.println("The addition Of two Numbers is :"+Sum);
        int add=x+a+b;
        System.out.println("The addition of Three Numbers is"+add);
	}

	int sum_T;
	public void addition() {
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		System.out.println("Enter the value of y :");
		y=sc.nextInt();
		sum_T=y+a+b;
		System.out.println("The addition of all num :"+sum_T);
	}

}
import Ajay.*;
public class without extends Modifier {
	void Methods(){
		sum_d();
		addition();
	}
public static void main(String[] args) {
	without w=new without();
	w.setX(4);
	w.Methods();
}
}
import java.util.*;
class access_p{
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
	
	void sum_d() {
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int Sum=a+b;
		System.out.println("The addition Of two Numbers is :"+Sum);
        int add=x+a+b;
        System.out.println("The addition of Three Numbers is"+add);
	}
}
public class access extends access_p{
	int sum_T;
	void addition() {
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		System.out.println("Enter the value of y :");
		y=sc.nextInt();
		sum_T=y+a+b;
		System.out.println("The addition of all num :"+sum_T);
	}
public static void main(String[] args) {
	access a1=new access();
	access_p a2=new access_p();
	a1.addition();
	a2.setX(5);
	a2.sum_d();
}
}
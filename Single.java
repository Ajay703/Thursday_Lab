import java.util.*;
class Fiboonacci{
	Scanner sc=new Scanner(System.in);
	int n1=0,n2=1,n3;
	void Fibona() {
	System.out.println("enter the no :");
    int num=sc.nextInt();
    for(int i=2;i<num;i++)
    {
	n3=n1+n2;
	System.out.println(" "+n3);
	n1=n2;
	n2=n3;
    }	
   }
}
public class Single extends Fiboonacci{
	void display() {
		System.out.println("Enter Two numbers :");
		int m=sc.nextInt();
		int m1=sc.nextInt();
		if(m<m1) {
			System.out.println("The Greater no is :"+m1);
		}
		else {
			System.out.println("The Greater no is :"+m);
		}
	}
	public static void main(String[] args) {
	Single s=new Single();
	s.Fibona();
    s.display();
}
}
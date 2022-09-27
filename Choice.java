import java.util.*;
public class Choice {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	System.out.println("1 . factorial");
	System.out.println("2 .addition");
	System.out.println("3 .amstrong");
	System.out.println("4. fibonachi ");
	System.out.println("5 .prime ");
	int a=sc.nextInt();
	switch (a) {
	case 1:
		int i,fact=1;// dicleretion
		System.out.println("enter the no for factorial :");
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial of "+num+" is "+fact);
	break;
		
	case 2:
		System.out.println("enter the two no which u want too add");
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=b+c;
		System.out.println("the add of two no is "+d);
	break;
	
	case 3:
		System.out.println("enter the no :");
		int n=sc.nextInt();
		int rem;
		int res=0;
		while(n!=0) {
			rem=n%10;
			res+=Math.pow(rem, n);
			n/=10;
		}
	if(res==n) 
	System.out.println(n+"this is the amstrong no");
	else
		System.out.println(n+"this is not the amstrong no");
	break;
	
	case 4:
		System.out.println("enter the first two no :");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
        int count=10;
        int m3;
        int j;
        System.out.println(m1+" "+m2);
        for(j=2;j<count;j++) {
        	m3=m1+m2;
        	System.out.println("the fibonachi series of given no is :"+m3);
        	m1=m2;
        	m2=m3;
        }
     break;

	 case 5:
		 System.out.println("enter the value of no :");
		 int f=0;
		int n1=sc.nextInt();
		int n2=n1/2;
		if(n1==0||n1==1) {
			System.out.println(n1 + "is the prime no");
		} 
		else
		{
			for(int k=2;k<=n2;k++) {
				if(n1%k==0) {
					System.out.println(n1 + "is not prime no ");
                      f=1;
                      break;
				}
			}
			if(f==0) {
				System.out.println(n1 + "is the prime no");
			}
		}
	default:
		
	}
}
}
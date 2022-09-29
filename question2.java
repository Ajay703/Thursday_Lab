import java.util.*;
public class question2 
{

	public static void main(String[] args) 
	{
		int i,a,b,hcf=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two no:");
		a=in.nextInt();
		b=in.nextInt();
		for(i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				
				hcf=i;
		}
    System.out.println("The highest common factor is "+hcf);

	}

}

import java.util.*;

public class question4 
{
  
	public static void main(String[] args) 
	{
	int i,del,size;
	char ch;
	Scanner in=new Scanner(System.in);
	do
	{
	System.out.println("Enter size of array");
	size=in.nextInt();
	int n[]=new int[size];
	System.out.println("Enter array elements");
    for(i=0;i<size;i++)
	{
		n[i]=in.nextInt();
	}
	System.out.println("The array elements are:");
	for(i=0;i<size;i++)
	{
		System.out.print("\t");
		System.out.print(n[i]);
	}
	System.out.println("\nEnter no which u want to delete..");
	del=in.nextInt();
	System.out.println("Updated array:");
	for(i=0;i<size;i++)
	{
		if(n[i]!=del)
		{
			int n1[]=new int[size];
			n1[i]=n[i];
			System.out.print("\t"+n[i]);
		}
		
	}
	System.out.println("\nDo you want to contineu(y/n)");
	ch=in.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	}

}
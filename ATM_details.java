import java.util.Scanner;

public class ATM_details 
{
	private int pass=12345;
    private int ac_bal=2000;

	char ans;
	//Creating getter setter methods to access private variables in other class
	public int getPass()
	{
		return pass;
	}
	public void setPass(int ps)
	{
		this.pass = ps;
	}
	public int getAc_balcredit() 
	{
		return ac_bal;
	}
	public void setAc_balcredit(int balance) 
	{
		this.ac_bal += balance;
	}
	public int getAc_baldebit()
	{
		return ac_bal;
	}
	public void setAc_baldebit(int balance) 
	{
		this.ac_bal -= balance;

	}  


}




import java.util.Scanner;

public class Deposit_atm extends  ATM_details 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub									
				String u_id;
				char ans;
				int u_pass,u_bal,ch,balance=2000,withdraw,deposit;
				Bank ob = new Bank();
				Scanner sc = new Scanner(System.in);
				System.out.println("Welcome to SBI ATM");
				System.out.println("****************************");
				System.out.println("Enter User name= ");
				u_id=sc.next();
				System.out.println("Enter Account Password=");
				u_pass=sc.nextInt();
				ob.getPass();
				//if block to check password
				if(ob.getPass()==u_pass) 
				{							
				do				
					{					
					System.out.println("Do you want to\n1. withdraw\n2. deposit \n3.balance");
					ch=sc.nextInt();						
					switch (ch) 
					{
					case 1:	
						System.out.print("Enter money to be withdrawn:");
				        //get the withdrawl money from user  
				        withdraw = sc.nextInt();  
						if(balance >= withdraw)  
				        {  
				            //remove the withdrawl amount from the total balance  
				            balance = balance - withdraw;  
				            System.out.println("Please collect your money");
				            System.out.println("The Username is "+u_id);
							System.out.println("The current balance after withdraw is "+balance);
				        }  
				        else  
				        {  
				            //show custom error message   
				            System.out.println("Insufficient Balance");  
				        }  
				        System.out.println("");
						break;
					case 2:					
						System.out.print("Enter money to be deposited:"); 					

				        //get deposite amount from te user  
				        deposit = sc.nextInt();  

				        //add the deposit amount to the total balanace  
				        balance = balance + deposit;  
				        System.out.println("Your Money has been successfully deposited");  
				        System.out.println("");
				        System.out.println("The Username is "+u_id);
						System.out.println("The current balance after deposit is "+balance);

						break;
					case 3:
						System.out.println("Current Balance : "+balance);  
				        System.out.println("");  
				        break;
					default:
					System.out.println("Enter Valid Input");
					break;
					}
						System.out.println("Do you want to continue transaction? y/n");
						ans=sc.next().charAt(0);
					}
				while(ans=='Y'||ans=='y');
				}
				else
				{
					System.out.println("Sorry you entered wrong password ");
				}
				System.out.println("Thanku for coming");

		}
}
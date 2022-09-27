// Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered
import java.util.Scanner;

public class Menu 
{
 public static void main(String[] args) 
 {
  // TODO Auto-generated method stub
  int menu_item,menu1,i_price=0;
  char ans;
  String i_name="";
  Scanner sc=new Scanner(System.in);
  do
  {
   System.out.println("Menu:\n1:Starters \n2:Main course \n3:Desserts");
   menu_item=sc.nextInt();
   switch(menu_item)   //accept user choice
   {
   case 1:
    System.out.println("1:MasalaPapad \t\t 220Rs.");
    System.out.println("2:PaneerMasala \t\t 300Rs.");
    System.out.println("3:Soup \t\t 100Rs.");
    menu1=sc.nextInt();
    switch(menu1)  // nested user choice
    {
    case 1:
     i_price+=220;  //show price for item
     i_name+="\nSMasalaPapad";
     break;
    case 2:
     i_price+=300;// show price for item 
     i_name+="\nSPaneerMasala";
     break;
    case 3:
     i_price+=100;// show price for item
     i_name+="\nSSoup";
     break;
    default:
     System.out.println("Invalid choice");
      
    }
    break;
   case 2: // second choice case
    System.out.println("1:Mushroom");
    System.out.println("2:Panner");
    System.out.println("3:Dal");
    menu1=sc.nextInt();
    switch(menu1)
    {
    case 1:
     i_price+=220; // here + stands for addition of previous price
     i_name+="\nMPaneer";
     break;
    case 2:
     i_price+=300;
     i_name+="\nMMushroom";
     break;
    case 3:
     i_price+=150;
     i_name+="\nMChole";
     break;
    default:
     System.out.println("Invalid choice");
      
    }
    break;
   case 3:
    System.out.println("1:Ice-cream");
    System.out.println("2:Gulaabjam");
    System.out.println("3:Custard");
    menu1=sc.nextInt();
    switch(menu1)
    {
    case 1:
     i_price+=60;
     i_name+="\nDIce-cream";
     break;
    case 2:
     i_price+=90;
     i_name+="\nDGulaabjam";
     break;

    case 3:
     i_price+=80;
     i_name+="\nDCustard";
     break;
    default:
     System.out.println("Invalid choice");
      
    }
    break;
   
   }
   System.out.println("Do you want to addd another item y/n"); // ask user if they want to countinue or they want bill
   ans=sc.next().charAt(0);
  }
  while(ans=='Y'||ans=='y'); // if yes go to menu or else generate bill
  System.out.println("Thanks for coming");
  System.out.println("The Food Items ARE:\n"+i_name);
  System.out.println("The Total bill amount is:"+i_price);
 }

}
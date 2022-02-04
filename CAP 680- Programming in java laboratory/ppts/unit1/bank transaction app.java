import java.util.*;
class BankTransactionApp
{

	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int choice;
		double amount,bal;
		Transaction t1=new Transaction();
	   do{
System.out.println("Select your choice:\n1.Deposit\n2.Withdrawal\n3.Check Balance\n4.Exit");
		choice=in.nextInt();
		switch(choice)
		{
			case 1:System.out.println("Enter amount for deposit");
				amount=in.nextDouble();
				if(amount>0){
				bal=t1.deposit(amount);
			       System.out.println("Your updated balance is: "+bal);
				}
				else
				{
				System.out.println("Invalid amount");
				}
				break;
			case 2:System.out.println("Enter amount for withdrawal");
				amount=in.nextDouble();
			if(amount>0){
				bal=t1.withdrawal(amount);
			       System.out.println("Your updated balance is: "+bal);
				}
				else
				{
				System.out.println("Invalid amount");
				}
				break;
			case 3:bal=t1.checkBalance();
			       System.out.println("Your updated balance is: "+bal);
				break;
			case 4:
				System.exit(0);
		  }		
		}while(choice!=4);		
	    

		}
	}

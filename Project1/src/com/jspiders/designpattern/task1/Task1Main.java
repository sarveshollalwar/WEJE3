package com.jspiders.designpattern.task1;
import java.util.Scanner;

public class Task1Main {
	static boolean loop =true;
	

    public static void transaction()
    {
			System.out.println("Select Your Operation On Account"+
					"\n1)Deposit"+
					"\n2)Withdraw"+
					"\n3)Check Balance"+
					"\n4)Exit");
			Scanner sc = new Scanner(System.in);
			String choice = sc.next();
			
			
			switch(choice)
			{
			case "1": System.out.println("Enter the amount to be deposited");
			        int depositamount=sc.nextInt();
			        Deposit deposit = new Deposit(depositamount);
				    System.out.println(depositamount+" Deposited!!!");
				    break;
				    
			case "2": System.out.println("Enter the amount to be withdrawn");
			        int withdrawamount =sc.nextInt();
			        Withdraw withdraw = new Withdraw(withdrawamount);
			        System.out.println(withdrawamount+"Withdrawn!!!");
			       
			        break;
			case "3": System.out.println("Checking Balance");
			        CheckBalance checkbalance = new CheckBalance();
			        break;
			case "4": System.out.println("Thank YOU");
			        loop=false;
			        sc.close();
			        break;
			default: System.out.println("Invalid input");
			         break;
				    
			} 
	}
    
	public static void main(String[] args) 
	{
		
		while(loop)
		{
			transaction();
		}
	}
	
}

package com.bankapp;

public class BankTest 
{
	public static void main(String args[])
	{  
		final Customer c=new Customer();  
		new Thread()
		{  
			public void run()
			{	
				System.out.println("Name of thread:"+currentThread().getName());
				c.withdraw(15000);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Name of thread:"+currentThread().getName());
			}  
		}.start();  
		
		new Thread()
		{  
				public void run()
				{
					System.out.println("Name of thread for deposit:"+currentThread().getName());
					c.deposit(10000);
				
				}  
		}.start(); 
	}
}
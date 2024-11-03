import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
	
	Customer c=new Customer("017xxxxxx30",new Date(10,11,2020),5);
	
	Account a1=new Account(444,"kamal",2000);
	Account a2=new Account(555,"kamal",2000);
	
	c.insertAccount(new Account (111,"Kamal",2020));
	c.insertAccount(new Account (222,"Kamal",2020));
	c.insertAccount(new Account (333,"Kamal",2020));
	
	c.getAccountByAccNumber(333).showDetails();
	}
}
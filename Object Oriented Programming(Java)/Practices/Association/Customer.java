import java.lang.*;

public class Customer
{
	private String phnNumber;
	private Date DOB;
	private Account accounts[];
	
	public Customer()
	{
		
	}
	public Customer(String phnNumber,Date DOB,int size)
	{
		this.phnNumber = phnNumber;
		this.DOB = DOB;
		accounts = new Account[size];
	}
	
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public String getPhnNumber(){return phnNumber;}
	public void setDOB(Date DOB){
	this.DOB=DOB;
	}
	public Date getDOB(){return this.DOB;}
	/*public void setAccount(Account account){
		this.account=account;
	}
	public Account getAccount(){return this.account;}*/
	
	public void insertAccount(Account account){
		boolean flag = false;
	for(int i=0;i<accounts.length;i++){
		if(accounts[i]==null){
			accounts[i]=account;
			flag = true;
			break;
			}
		}
		if(flag){
			System.out.println("Account Inserted");
		}
		else{
			System.out.println("Account Insertaion faild");
		}
		
	}
	
	public void showALLAccounts(){
		for(int i=0;i<accounts.length;i++){
			if(
			
		
		
		
		
		
		
		
		public Account getAccountByAccHumber(int accNum){
		Account foundAccount=null;
		for( Account account : accounts){
			if(account !=null){
				if(account.getAccountByAccHumber()==accNum){
					foundAccount account;
					break;
				}
			}
		}
		return foundAccount;
	}
	public void showDetails(){
		System.out.println("Customer Information:");
		System.out.println("Phone Number: "+this.getPhnNumber());
		System.out.println("Date of birth: "+this.DOB.getDate());
		//Account.showDetails());
	}
	
}
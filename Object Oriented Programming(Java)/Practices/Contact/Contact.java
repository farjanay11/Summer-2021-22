public class Contact{
	private String personName;
	private String personId;
	private int Age;
	private String mobileNumber;
	private char Gender;
	
	public Contact(){
		System.out.println("Empty Constructor");
	}
	public Contact(String personName,String personId,int Age,String mobileNumber,char Gender){
		this.personName=personName;
		this.personId=personId;
		this.Age=Age;
		this.mobileNumber=mobileNumber;
		this.Gender=Gender;
		System.out.println("Parameterized Constructor");
	}
	public void setpersonName(String personName){this.personName=personName;}
	public void setpersonId(String personId){this.personId=personId;}
	public void setAge (int Age){this.Age=Age;}
	public void setmobileNumber(String mobileNumber){this.mobileNumber=mobileNumber;}
	public void setGender(char Gender){this.Gender=Gender;}
	public String getpersonName(){return this.personName;}
	public String getpersonId(){return this.personId;}
	public int getAge(){return this.Age;}
	public String getmobileNumber(){return this.mobileNumber;}
	public char getGender(){return this.Gender;}
	
	public void showContactinfo(){
		System.out.println("Name: "+this.getpersonName());
		System.out.println("Id: "+this.getpersonId());
		System.out.println("Age: "+this.getAge());
		System.out.println("Mobile Number: "+this.getmobileNumber());
		System.out.println("Gender: "+this.getGender());
	}
	public static void main(String []args ){
		Contact c1=new Contact();
		c1.setpersonName("Farjana Opi");
		c1.setpersonId("22-47018-1");
		c1.setAge(22);
		c1.setmobileNumber("01765675350");
		c1.setGender('F');
		c1.showContactinfo();
		Contact c2=new Contact("Farjana Opi","22-47018-1",22,"01765675350",'F');
		c2.showContactinfo();
	}
}	
	
		
		
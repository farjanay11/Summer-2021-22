public class Contact {
    private String personName;   
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;
    
    public Contact(){
    System.out.println("E - Contact");
    }
    public Contact(String personName,String personId,int age,String mobileNumber,char gender){
    System.out.println("P - Contact");
    this.personName=personName;        
    this.personId=personId;        
    this.age=age;       
    this.mobileNumber=mobileNumber;        
    this.gender=gender;                   
    }

public void setPersonName(String personName){this.personName=personName;}
public void setPersonId(String personId){this.personId=personId;}
public void setAge(int age){this.age=age;}
public void setMobileNumber(String mobileNumber){this.mobileNumber=mobileNumber;}    
public void setGender(char gender){this.gender=gender;}


    public String getPersonName(){return personName;}
    public String getPersonId(){return personId;}
    public int getAge(){return age;}    
    public String getMobileNumber(){return mobileNumber;}
    public char getGender(){return gender;} 

    public void ShowPersoInfo(){
    System.out.println("Person Name: "+personName);
    System.out.println("Person Id: "+personId);
    System.out.println("Person age:" +age);
    System.out.println("Mobile Number: " +mobileNumber);
    System.out.println("Gender : " +gender);         
    }
    public void DetectMobileOperator(){
        char ch1=mobileNumber.charAt(0);
        char ch2=mobileNumber.charAt(1);
        char ch3=mobileNumber.charAt(2);
        int ch=mobileNumber.length();
        if(ch1=='0' && ch2 == '1' && ch3=='7' && ch==11){
            System.out.println("The operator is grameenphone");
        }
        else if(ch1=='0' && ch2 == '1' && ch3=='8' && ch==11){
            System.out.println("The operator is Robi");
        }
        else if(ch1=='0' && ch2 == '1' && ch3=='9' && ch==11){
            System.out.println("The operator is Banglalink");
        }
        else if(ch1=='0' && ch2 == '1' && ch3=='6' && ch==11){
            System.out.println("The operator is Airtel");
        }
        else{
            System.out.println("This is not a valid mobile number");
        }
    }


    public static void main(String []args){
        Contact C = new Contact();
        C.setPersonName("Farjana Yesmin Opi");
        C.setPersonId("22-47018-1");
        C.setAge(22);
        C.setMobileNumber("01788983931");
        C.setGender('F');
        C.ShowPersoInfo();
        C.DetectMobileOperator();
        Contact C1= new Contact("Farjana Yesmin Opi","22-47018-1",22,"01802023345",'F');
        C1.ShowPersoInfo();
        C1.DetectMobileOperator();
    }
} 

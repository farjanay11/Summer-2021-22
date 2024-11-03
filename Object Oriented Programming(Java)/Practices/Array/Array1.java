import java.lang.*;
public class Array1
{
	
  public static void main(String args[])
  {
    int months[]=new int[12];
   
    months[0]=31;
    months[1]=28;
    months[2]=30;
    months[3]=31;
    months[4]=30;
    months[5]=31;
    months[6]=29;
    months[7]=31;
    months[8]=30;
    months[9]=31;
    months[10]=29;
    months[11]=30;
    
   System.out.println("March has:"+months[2]+" days");
   System.out.println("July has:"+months[6]+" days");
   System.out.println("January has:"+months[0]+" days");
   System.out.println("December has:"+months[11]+" days");


  }

}
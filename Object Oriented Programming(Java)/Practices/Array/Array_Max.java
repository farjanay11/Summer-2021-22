import java.lang.*;
public class Array_Max
{
	
  public static void main(String args[])
  {

    int m[]=new int[]{30,50,40};
    int max;
    for(int i=0;i<m.length;i++)
    {
      System.out.println("Your numbers are :"+m[i]);
 

    }
       max=m[0];
       for(int i=1;i<m.length;i++)
       {
         if(m[i]>max)
         {
           max=m[i];
         }




       }

       System.out.println("Max value is :"+max);



  }




}
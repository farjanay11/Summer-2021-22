import java.lang.*;
public class Array_Sum
{
	
   public static void main(String args[])
{
  int av[]=new int[]{20,50,40,10};
  int sum=0;
  for(int i=0;i<av.length;i++)
  {
    System.out.println("Your elements are :"+av[i]+"\t");
    sum=av[i]+sum;
    

  } 
    System.out.println("Sum is :"+sum);


}   


}
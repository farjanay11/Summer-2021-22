import java.lang.*;
public class Array_Average
{
	int a[]=new int[]{23,67,89,34};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
      System.out.println("Your elements are :"+a[i]);
      sum=a[i]+sum;
      int avg=sum/4;


	}
     System.out.println("Sum is :"+sum);
     System.out.println("Average is :"+avg);

}
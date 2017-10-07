import java.util.*;
import java.io.*;
public class abc
{
	public static void main (String[] args)
	{
		
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		int sum=0; 
		int s;
		for (int i=0;i<5;i++)
		{
			System.out.println ("Enter array elements:");
			a[i]=sc.nextInt();
			
		}
		    System.out.println ("Printing array elements"); 
			
		for (int i=0;i<5;i++)
		{
				sum=sum +a[i];
				System.out.println(a[i]);
		}		
				System.out.println("sum of the numbers is"+sum);
		s=a[3]-a[1];
		System.out.println("subtraction of fourth and the second element:"+s);
		System.out.println ("Printing array elements"); 
		for (int i=0;i<5;i++)
		{
			
				System.out.print(a[i]+" ");
		}
	
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i =0;i<a;i++){
		   int n = sc.nextInt();
		   int k = sc.nextInt();
		   int arr[]=new int[n];
		   long sum=0;
		   for(int j =0;j<n;j++){
		       arr[j]=sc.nextInt();
		   }
		   for(int j =0;j<n;j++){
		       sum+=arr[j];
		       
		   }
		   
		   System.out.println(sum%k);
		}
	}
}

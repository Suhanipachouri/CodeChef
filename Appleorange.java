import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		   int n=sc.nextInt();
		   int m=sc.nextInt();
		   while(n!=m)
		   {
		       if(n>m)
		       {
		           n=n-m;
		       }
		       else
		       {
		           m=m-n;
		       }
		   }
		   System.out.println(m);
		}
	}
}

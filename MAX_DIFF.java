import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i =0;i<a;i++){
		   int N= sc.nextInt();
		   int S= sc.nextInt();
		   int m=0;
		   if(S>N){
		    System.out.println(N-(S-N)); 
		   }
		   else{
		       System.out.println(S);
		   }
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a-b;
		int result2= a-(b+c);
		System.out.print(result +" ");
		System.out.println(result2);
		}
	catch( Exception e)	{
	    return;
    	}
	}
}

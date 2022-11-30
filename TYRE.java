
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
		    int t = sc.nextInt();
		    for(int i = 1;t<=1000;i++ ){
		        int N = sc.nextInt();
		        int M =sc.nextInt();
		        int totalt=((N*2)+(M*4));
		        System.out.println(totalt);
		        }
		    }
		 catch(Exception e){
		     return;
		}
	}
}

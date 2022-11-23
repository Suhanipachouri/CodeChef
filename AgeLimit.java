import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int a =0;a<t;a++){
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  int d = sc.nextInt();
		  if(d>=b && d<c){
		  System.out.println("yes");
		  }
		  else{
		      System.out.println("no"); 
		  }
		}
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a==1 || b==1){
		    System.out.println("No"); 
		    }
		     else if(a%2==1 && b%2==1){
		       System.out.println("No"); 
		    }
		    
		    else{
		      System.out.println("Yes");  
		    }
		}
	}
}

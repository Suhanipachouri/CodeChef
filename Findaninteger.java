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
	    for(int i =0;i<t;i++){
	      long a = sc.nextInt();
	      long b = sc.nextInt();
	       //boolean printed = false;
	      if(a!=b){
	          long n = a*b -a-b;
	          if(n<0){
	              n=2*a*b -a-b;
	          }
	          System.out.println(n);
	       //   printed = true;
	      }
	      else{
	         System.out.println(a); 
	      }
	      
	    }
	}
}

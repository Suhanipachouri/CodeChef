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
		for(int i =0; i<t;i++){
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    int a = sc.nextInt();
		    int s = sc.nextInt();
		    double b = Math.sqrt(u*u-(2*a*s));
		       if (b>v){
		        System.out.println("No");
		       }
		       else{
		        System.out.println("Yes");
		        }
		    
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for(int j =0;j<s;j++){
		   long N = sc.nextInt();
		   long  K = sc.nextInt();
		     if(K>0  && N>0){
		         System.out.println(N%K);
		     }
		      else{
		       System.out.println(N);
		       }
		}
	}
}

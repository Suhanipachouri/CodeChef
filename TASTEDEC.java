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
		int tot1,tot2,cho,can;
		for(int i =0;i<t;i++){
		   cho = sc.nextInt();
		   can = sc.nextInt();
		   tot1= 2*cho;
		   tot2= 5*can;
		   if(tot1 > tot2 ){
		       System.out.println("Chocolate");
		   }
		   else if(tot1<tot2) {
		       System.out.println("Candy");
		   }
		   else {
		       System.out.println("Either");
		   }
		    System.out.println();
		}
	}
}

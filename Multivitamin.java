import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		for(int i =0;i<a;i++){
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		     if(b*3<=c){
		     System.out.println("yes");
		     }else{
		       System.out.println("no");   
		     }
		}
	}
}

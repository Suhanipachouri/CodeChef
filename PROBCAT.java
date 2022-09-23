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
	    for(int i=0;i<t;i++){
	      int a = sc.nextInt(); 
	      if(1 <=a && a<100){
	      System.out.println("Easy");
	      }
	      else if(100 <=a && a<200){
	      System.out.println("Medium");
	      }
	     else if(200 <=a && a<=300){
	      System.out.println("Hard");
	      }
	    }
	}
}

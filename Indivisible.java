
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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int j;
		    for(j=2;j<100;j++){
		        if(a%j!=0 && b%j!=0 && c%j!=0){
		            System.out.println(j);
		            break;
		    }
		    
		}
	}
}}

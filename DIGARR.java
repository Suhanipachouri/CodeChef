import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
		    int count = 0;
		    int d = sc.nextInt();
		    String numb = sc.next();
		    for(int i=0; i<numb.length(); i++){
		        if (numb.charAt(i)=='0'||numb.charAt(i)=='5'){
		            count+=1;
		            break;
		        }
		    }
		    if(count>0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    n-=1;
		}
	}
}

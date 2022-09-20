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
		int tests = sc.nextInt();
		while (tests-->0){
		    int count = 0;
		    int z = 0;
		    int n = sc.nextInt();
		    int [] arr = new int[n];
		    for(int i =0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int j = 0;j<n;j++){
		        if(arr[j] <= 7){
		            count++;
		        }
		        if(count == 7){
		       z = j+1;
		        break;
		    }
		        
		    }
		    System.out.println(z);
		    
		} 
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner ( System.in);
		int N= sc.nextInt();
		int M = sc.nextInt();
		int K= sc.nextInt();
		int p=0;
		while( N>0){
		    int arr[]= new int [K+1];
		    int sum= 0;
		    for (int i=0; i<= K; i++){
		       arr[i]= sc.nextInt();
		      if (i<K){
		           sum= sum+ arr[i];
		       }
		    }
		    
		    if (sum>= M && arr[K]<=10){
		        p++;
		    }
		   
		    N--;
		}
		 System.out.println(p);
	}
}

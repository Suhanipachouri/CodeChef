import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int k =0;k<a;k++){
		  	int N = sc.nextInt();
		  	int arr[]= new int[N];
		  	for(int i=0;i<N;i++){
		  	    arr[i]=sc.nextInt();
		  	}
		  	int sum=0;
		  	int i=0;
		  	for(i=0;i<N;i++){
		  	    sum = sum+arr[i];
		  	    if(sum==0 && arr[i]==0)
		  	        break;
		  	    sum=sum-1;
		    }
		    System.out.println(sum+i);
		}
	}
}

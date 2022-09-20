import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t-->0){
		    int n=sc.nextInt();
		    
		    int [] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        int l=0;
		        int m=0;
		        for(int j=0;j<n;j++){
		            if(arr[j]<=arr[i]){
		                l++;
		            }
		            else{
		                m++;
		            }
		        }
		        if(m<l){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
		  

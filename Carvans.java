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
	    for(int i =0;i<a;i++){
	     int b = sc.nextInt();   
	     int arr[]=new int[b];
	     for(int j=0;j<b;j++){
	         arr[j] = sc.nextInt();
	     }
	     int count=1;
	     int c= arr[0];
	     for(int j=1;j<b;j++){
	         
	         if(arr[j]<=c){
	         count++;
	         c=arr[j];
	         }
	     }
	     System.out.println(count);
	    }
	}
}

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
		  int l[] = new int [b];
		  int c[]= new int [b];
		  for(int j=0;j<b;j++){
		      l[j]=sc.nextInt();
		  }
		  for(int j=0;j<b;j++){
		      c[j]= sc.nextInt();
		  }
		  int arr[]= new int[b];
		  for(int j=0;j<b;j++){
		      arr[j]=l[j]+c[j];
		  }
		  int max=0;
		 for(int j=0;j<b;j++){
		    if(l[max]<l[j]) {
		        max=j;
		  }
		  if(l[max]==l[j]){
		      if(arr[j]>arr[max]){
		          max=j;
		      }
		  }
		  
		 }System.out.println(max+1);
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int ans = 0;
		    int[] A = new int[n];
		    
		    for (int i=0;i<n;i++ )
		    A[i] = sc.nextInt();
		    
		    for(int i=0;i<p;i++){
		        if(A[i] == 0)
		        ans+=x;
		        else
		        ans+=y;
		    }
		    
		    System.out.println(ans);
		}
		   
		    
		
		 
		
	}
}

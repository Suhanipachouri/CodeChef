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
		int a = sc.nextInt();
		for(int j =0;j<a;j++){
		    int N=sc.nextInt();
		    int arr[]= new int [N];
		    for(int i =0;i<N;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int max=arr[0];
		    int min = arr[N-1];
		    System.out.println(Math.abs(max-min));
		}
	}
}

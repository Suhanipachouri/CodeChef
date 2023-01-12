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
    
        for(int j=0;j<a;j++){
            int count=0;
            int num = sc.nextInt();
            while(num>0){
               int rem=num%10;
               if(rem==7){
                   count++;
               }
               num=num/10;
            }
            	if(count>0){
            	    System.out.println("yes");
            	}else{
            	 System.out.println("no");   
            	}
        
    }
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner sc = new Scanner (System.in);
		    int T = sc.nextInt();
        do {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            if (N % 2 == 0) {
                    Arrays.sort(arr);
                for (int i = 0; i < N; i = i + 2) {
                
                    if (arr[i] == arr[i + 1]) {
                      continue;
                    } else {
                        count++;
                    }
                }
                if (count==0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

            T--;
        } while (T > 0);
    }
}

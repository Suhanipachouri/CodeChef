import java.util.*;
class chef{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    for(int i = 0;i<a;i++){
        int x=sc.nextInt();
        int y = sc.nextInt();
        if((y-x)%8==0)
            System.out.println((y-x)/8);
            else
        System.out.println(((y-x)/8)+1);
      }
    }
}

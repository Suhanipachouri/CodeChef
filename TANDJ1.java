class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int i =0;i<t;i++){
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   int c=sc.nextInt();
		   int d=sc.nextInt();
		   int k=sc.nextInt();
		        int e = Math.abs(a-c)+Math.abs(b-d);
		        if(e>k){
		            System.out.println("No");
		        }
		        else{
		            if((e-k)%2==0){
		                System.out.println("Yes");
		            }
		            else{
		                System.out.println("No");
		            }
		        }
		}
	}
}

import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int i=0,p=0,q=1,c=0;
//		while(i<n)
//		{
//			c=p+q;
//			p=q;
//			q=c;
//			i=i+1;
//		}
//		
//		System.out.println(p);
//		 int j=0;
//		    for(;;)
//		    {
//		        if(j==5)
//		            break;
//		        System.out.print(j);
//		        j++;
//		    }
//		    
		    
		int a = 0;
		int b=1;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=n;i>=1;i--)
		{
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}

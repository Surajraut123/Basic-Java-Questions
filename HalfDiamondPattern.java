import java.util.Scanner;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==0)
        {
            System.out.print("*");
        }
		
        int i=1,j,p,x;
        while(i<=n+1)
        {
            System.out.print("*");
            p=1;
            j=1;
            while(j<=i-1)
            {
                System.out.print(p);
                p=p+1;
                j=j+1;
            }
            p=p-1;
            x= p-1;
            while(p>1)
            {
				System.out.print(x);
                p=p-1;
                x=x-1;
            }
            if(i>1)
            {
            	System.out.print("*");
            }
            
            System.out.println();
            i=i+1;
            
        }
        
        
        
        
        
        
        i=1;
        while(i<=n)
        {
			System.out.print("*");
            j=1;
            p=1;
            while(j<=n-i)
            {
				System.out.print(p);
                p=p+1;
                j=j+1;
            }
            p=p-1;
            x= p-1;
            while(p>1)
            {
				System.out.print(x);
                p=p-1;
                x=x-1;
            }
            if(i<n)
            {
            	System.out.print("*");
            }
            
            System.out.println();
            i=i+1;
            
        }
        
        

	}
}

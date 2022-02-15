import java.util.Scanner;
public class OddSquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1,j,p=1,k,x;
        while(i<=n)
        {
         
        	x=1;
            k=2;
            j = p;
            while(j<=(2*n-1))
            {
				System.out.print(j);
                j=j+2;
                
            }
            j=x;
            while(k<=i)
            {
				System.out.print(x);
                x=x+2;
                k=k+1;
                
            }
            i=i+1;
            System.out.println();
            p=p+2;
            k=k+1;
        }

	}

}

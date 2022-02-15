import java.util.Scanner;
public class SumPattern {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int a = s.nextInt();
	        int i=1,j,p;
	        while(i<=a)
	        {
				j=1;
	            p=0;
	            while(j<=i)
	            {
	                if(i>=1){
	                    System.out.print(j);
	                    // System.out.print();
	                }
	                if(j<i)
	                {
	                	System.out.print("+");
	                }
	                p=p+j;
	                j=j+1;
	            }
	            System.out.print("="+(p));
	            i=i+1;
	            System.out.println();
	        }
		
	}

}

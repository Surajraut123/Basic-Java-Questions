import java.util.Scanner;
public class InvertedNumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i=1,p=0,j,q=a;
        while (i<=a)
        {
        	j=1;
			while(j<=a-i+1)
            {
				System.out.print(q);
                j=j+1;
            }
            i=i+1;
            q=q-1;
            System.out.println();                
        }


	}

}

import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i=1,j,p;
        while (i<=a)
        {
            int k=i;
			j=1;
            while (j<=a-i)
            {
                System.out.print(" ");
                j=j+1;
            }
            p=1;
            while (p<=i)
            {
				System.out.print(k);
                p=p+1;
                k = k+1;
            }
            p=i-1;
            k = k-2;
            while(p>=1)
            {
				System.out.print(k);
                p = p-1;
                k = k-1;
            }
            i=i+1;
            System.out.println();

	}

	}

}

import java.util.Scanner;
public class TriangleP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i=1,j,p;
        while (i<=a)
        {
			j=1;
            while (j<=a-i)
            {
                System.out.print(" ");
                j=j+1;
            }
            p=1;
            while (p<=i)
            {
				System.out.print("*");
                p=p+1;
            }
            int dec = i-1;
            while(dec>=1)
            {
				System.out.print("*");
                dec = dec-1;
            }
            i=i+1;
            System.out.println();

	}
	}

}

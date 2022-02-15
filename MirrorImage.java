import java.util.Scanner;
public class MirrorImage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i=1,j;
        int p;
        while (i<=a)
        {
			p=1;
            while (p<=a-i)
            {
                System.out.print(" ");
                p=p+1;
            }
            j=1;
            while(j<=i)
            {
				System.out.print(j);
                j = j +1;
            }
            i=i+1;
            System.out.println();
        }    

	}

}

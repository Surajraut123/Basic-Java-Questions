import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = 0,i;
        for(i = 1;i<=n;i++)
        {
            int sqr = i*i;
            if(sqr<=n)
            {
            	p=i;
				
            }
        }
        System.out.print(p);

	}

}

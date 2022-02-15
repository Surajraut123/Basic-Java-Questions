import java.util.Scanner;
public class AllPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the No ");
		int n = s.nextInt();
		int i,count;
		for(i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		

	}

}

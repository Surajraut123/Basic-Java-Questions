import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = s.nextInt();
        int sum=0;
        if(c==1)
        {
			for(int i=1;i<=a;i++)
            {
                sum+=i;
            }
			System.out.print(sum);
        }
        else if(c==2)
        {
        	sum=1;
            for(int i=1;i<=a;i++)
            {
                sum=sum*i;
            }
            System.out.println(sum);
        }
        else{
            System.out.print("-1");
        }

	}

}

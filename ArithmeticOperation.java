import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for(int i=1;i<=x;i++)
        {
			int series = ((3*i)+2);
            if(series%4==0)
            {
				x++;
                continue;
            }
            System.out.print(series+" ");
        }

	}

}

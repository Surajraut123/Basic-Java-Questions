import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p=0,i=1,dec=0;
		while(n>0)
		{
			p = n % 10;
			dec = dec +(p*i);
			i=i*2;
			n=n/10;
			
		}
		System.out.println(dec);

	}

}

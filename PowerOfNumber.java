import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int p=1,x=0;
        while (b>0){
			p = p*a;
			b=b-1;
        }
        System.out.println(p);

	}

}

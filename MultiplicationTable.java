import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 1;i<=10;i++){
            int mul = a * i;
            System.out.println(mul);
		}

	}

}

import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		int a = (int)(ch);
//		System.out.println(a);
		
		if(a >= 65 && a<=96) {
			System.out.println("1");
		}
		else if(a >= 97 && a<=122) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}
}

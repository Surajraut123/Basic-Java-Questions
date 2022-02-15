import java.util.Scanner;
public class TakingInput {
	public static void main(String args[]) {
		//for string
//		String a,b;
//		Scanner s = new Scanner(System.in);
//		a = s.next();//it print a word not taking a space
//		b =s.nextLine();//it print an entire line
//		System.out.println(a);
//		System.out.println(b);
		
		//for character
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		System.out.println(ch);
		
		//For int
		//int a,b;
//		Scanner s = new Scanner(System.in);
//		a = s.nextInt();
//		b = s.nextInt();
//		int c=a+b;
//		System.out.println(c);
	}
}

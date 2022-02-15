import java.util.Scanner;
public class FarhnhiteToCelcius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
//        int i = a;
        int cel;
        while (a <= b){
            cel = (5*(a-32))/9;
//            System.out.println(cel);
            System.out.println(a + "\t" +cel);
                a = a + c;
        }        

	}
}

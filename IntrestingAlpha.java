import java.util.Scanner;
public class IntrestingAlpha {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p =n;
        int x=0;
        char jth;
        for(int i=0;i<=n;i++){
            for(int j=0 ;j<i;j++){
            	jth = (char)(p-i+65+j);
				System.out.print(jth);
				x=x+1;
            }
            System.out.println();
        }

	}

}

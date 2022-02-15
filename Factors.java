import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i=2;
        
        while (i<a){
            
			if(a%i==0){
				System.out.print(i);
				System.out.print(" ");
            }
            i=i+1;
        }

	}

}

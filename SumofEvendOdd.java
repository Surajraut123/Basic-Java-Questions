import java.util.Scanner;
public class SumofEvendOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int p=0;
        int q=0,r=0;
        while (x>0){
            p = x%10;
            
            if(p%2==0){
                 r=r+p;
			}
            else{
                q=q+p;
			}
            
            x = x/10;
            
		}
        System.out.println(r+" "+q);

	}

}

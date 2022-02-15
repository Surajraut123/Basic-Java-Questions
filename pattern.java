import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p;
        for(int i=1;i<=n;i++){
        	p=i;
            for(int j=0 ;j<i;j++){
            	if(p>0) {
            		System.out.print(p);
            		p = p-1;
            	}
				
            }
            System.out.println();
        }

	}

}

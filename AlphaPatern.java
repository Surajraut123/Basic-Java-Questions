import java.util.Scanner;
public class AlphaPatern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
int row = 1;
        
        while(row <= n) {
			int col = 1;
            char ch = (char)('A' + row -1);
            
            while(col <= row) {
                System.out.print((char)(ch + col -1));
                col += 1;
            }
            
            System.out.println();
            row++;
        }

	}

}

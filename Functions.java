import java.util.Scanner;
public class Functions {
//	public static void doubleValue(int a ){
//	    a = a * 2;
//	}
	
public static void printFahrenheitTable(int a, int b, int c) {
        
        while(a<=b)
        {
			int cel = (5*(a-32))/9;
            System.out.println(a+" "+cel);
            a=a+c;
        }    
        
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int a = 8;
//		 doubleValue(a);
//		 System.out.println(a);
		
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        printFahrenheitTable(a,b,c);
	}

}

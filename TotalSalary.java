import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		String str = s.next();
		char ch = str.charAt(0);
		float hra = (0.2f) * (basic) ;
        float da = (0.5f)*basic;
        float pf = (0.11f)*basic;
//        System.out.println(hra + " " + da + " " + pf);
        int allow;
        
        if(ch == 'A'){
            allow = 1700;
		}
        else if(ch == 'B'){
            allow = 1500;
        }
        else if(ch == 'C') {
            allow = 1300;
        }
        else {
        	allow = 1300;
        }
        
        float total_salary;
        total_salary = basic + hra + da + allow - pf;
        System.out.println((int)(Math.round(total_salary)));
	}

}

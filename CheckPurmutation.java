import java.util.Scanner;
public class CheckPurmutation {

	public static boolean isPermutation(String str1, String str2) {
		int a = str1.length();
        int b = str2.length();
        int c=0;
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    c++;
                }
            }
        }
        
        if(c==a)
        {
            return true;
        }
        return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.print(isPermutation(str1,str2));

	}

}

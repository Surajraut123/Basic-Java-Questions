import java.util.Scanner;
public class ReverseWordwiseString {

	
	public static String reverseWordWise(String str) {
		int i=str.length()-1;
        String ans = "";
        while(i>=0)
        {
        	while(i>=0 && str.charAt(i)==' ') i--;
            int j=i;
            while(i>=0 && str.charAt(i)!= ' ')i--;
            // if(i<0){
            //     break;
            // }
            
            if(ans.isEmpty())
            {
                ans = ans.concat(str.substring(i+1,j+1));
            }
            else
            {
                ans = ans.concat(" " +str.substring(i+1,j+1));
            }
        }
        return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(reverseWordWise(str));

	}

}

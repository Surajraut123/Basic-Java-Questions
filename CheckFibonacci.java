import java.util.Scanner;
public class CheckFibonacci {

	public static boolean checkMember(int n){
		int p=1,q=1,c=0;
        int i=1;
        while(i<n)
        {
            c=p+q;
            p=q;
            q=c;
            i++;
            if(n==p)
            {
                return true;
            }
        }
        return false;
		
	}
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        boolean result = checkMember(a);
        System.out.println(result);
        
    }

}

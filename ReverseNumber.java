import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int remain;
        int rev=0;
        boolean p = true;
        while(a>0){
        	remain = a%10;
        	a=a/10;
//        	if(remain==0)
//        	{
//            	continue;
//        	}
        	System.out.println(p);
        	if(remain==0)
        	{
                if(p = true )
                {
            		continue;
                }    
        	}
            else
            {
                p = false;
                rev = (rev*10)+remain;
            }
//        	rev = (rev*10)+remain;
        
    	}
        System.out.print(rev);

	}

}

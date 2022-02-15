import java.util.Scanner;

public class AllPrimeNumber {

	
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1;i<a;i++)
        {
        	if(i==1 || i==0)
        	{
        		continue;
        	}
        	int flag=1;
        	for(int j = 2;j<=i/2;j++)
        	{
        		if(i%j==0)
        		{
        			flag=0;
        			break;
        		}
        	}
        	if(flag==1)
        	{
        		System.out.print(i+" ");
        	}
        }
            
        	
        

	}

}

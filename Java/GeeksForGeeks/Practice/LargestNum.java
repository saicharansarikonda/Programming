//Largest number with given sum
import java.util.*;
import java.math.*;
public class LargestNum
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,s;
		System.out.println("Enter n");
		n=sc.nextInt();
		System.out.println("Enter sum");
		s=sc.nextInt();
		BigInteger ans=BigInteger.valueOf(0);
		int large=9;
		if(s>9*n)
		{
			System.out.println(-1);
		}
		else{
			while(s>=0 && n>0)
			{
				if(large<=s)
				{
					ans=ans.multiply(new BigInteger("10")).add(BigInteger.valueOf(large));
					s-=large;
					n-=1;
				}
				else{
					large-=1;
				}
				
				if(large<0)
				{
					large=0;
				}
			}
			System.out.println(ans);
		}
	}
}

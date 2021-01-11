import java.util.*;
public class MissingNumber{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b;
		int[] arr=new int[n-1];
		String[] s =new String[n];
		for(int i=0;i<n-1;i++)
		{
			s[i]=sc.next();
			arr[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		for(int i=2;i<=n;i++)
		{
			a^=i;
		}
		b=arr[0];
		for(int i=1;i<n-1;i++)
		{
			b^=arr[i];
		}
		System.out.println(a^b);
	}
}


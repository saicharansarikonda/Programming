import java.util.*;
public class TwoSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		HashSet<Integer> set = new HashSet<>();
		
		System.out.println("Array is");
		for(int i:arr)
		{
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--)
		{
			if(!set.contains(arr[i]))
			{
				set.add(x-arr[i]);
			}
			else{
				System.out.println("True");
				break;
			}
			System.out.println("Set is "+set);
		}
		System.out.println("False");
		
	}
}

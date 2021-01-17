import java.util.*;
class Job
{
	int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
public class JobSequencing
{
	
	public static int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,new Comparator<Job>(){
				public int compare(Job o1,Job o2)
				{
					if(o1.profit>o2.profit)
					{
						return -1;
					}
					else if(o1.profit<o2.profit)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
			
		});
		
		int[] ans=new int[2];
		
		boolean[] slots=new boolean[n];
		for(int i=0;i<n;i++)
		{
			slots[i]=false;
		}
		int maxProfit=0;
		int nJobs=0;
		for(int i=0;i<n;i++)
		{
			for(int j=Math.min(n,(arr[i].deadline)-1);j>=0;j--){
				if(slots[j]==false)
				{
					slots[j]=true;
					maxProfit+=arr[i].profit;
					nJobs+=1;
					break;
				}
			}
		}
		
		ans[0]=nJobs;
		ans[1]=maxProfit;
        
        return ans;
        
        
    }
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter n value: ");
		n=sc.nextInt();
		
		Job[] arr = new Job[n];
		
		String[] jid=new String[n];
		String[] deadline=new String[n];
		String[] profit=new String[n];
		
		System.out.println("Enter job ids");
		for(int i=0;i<n;i++)
		{
			jid[i]=sc.next();
		}
		
		System.out.println("Enter deadlines");
		int max=0;
		for(int i=0;i<n;i++)
		{
			deadline[i]=sc.next();
		}
		
		System.out.println("Enter profits");
		for(int i=0;i<n;i++)
		{
			profit[i]=sc.next();
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i]=new Job(Integer.parseInt(jid[i]),Integer.parseInt(deadline[i]),Integer.parseInt(profit[i]));
		}
		
		int[] ans=JobScheduling(arr,n);
		System.out.println(ans[0]+" "+ans[1]);
	}
}

import java.util.*;
public class MonkIsland
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	static void BFS(ArrayList<ArrayList<Integer>> adj,int v)
	{
		boolean[] visited=new boolean[v+1];
		for(int i=0;i<v+1;i++)
		{
			visited[i]=false;
		}
		int s=1;
		visited[s]=true;
		int[] dist=new int[v+1];
		dist[s]=0;
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(s);
		int count=0;
		while(!q.isEmpty())
		{
			s=q.poll();
			for(int i=0;i<adj.get(s).size();i++)
			{
				int newNode=adj.get(s).get(i);
				if(visited[newNode]!=true)
				{
					q.add(newNode);
					visited[newNode]=true;
					dist[newNode]=dist[s]+1;
					count+=1;
				}


			}
		}
		System.out.println(dist[v]);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n,m;
			String s[]=new String[2];
			int a[]=new int[2];
			for(int i=0;i<2;i++)
			{
				s[i]=sc.next();
				a[i]=Integer.parseInt(s[i]);
			}
			n=a[0];
			m=a[1];
			ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(n+1);
			for(int i=0;i<n+1;i++)
			{
				adj.add(new ArrayList<Integer>());
			}
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<2;j++)
				{
					s[j]=sc.next();
					a[j]=Integer.parseInt(s[j]);
				}
				addEdge(adj,a[0],a[1]);
			}
			BFS(adj,n);
			t-=1;
		}
	}
}

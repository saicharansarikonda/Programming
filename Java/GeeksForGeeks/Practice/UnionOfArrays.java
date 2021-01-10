import java.util.*;
public class UnionOfArrays {

    static ArrayList<Integer> printUnion(int[] arr1,int n,int[] arr2,int m)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j])
            {
                ans.add(arr1[i]);
                i+=1;
                j+=1;
            }
            else if(arr1[i]<arr2[j]){
                if(!ans.contains(arr1[i])){
                    ans.add(arr1[i]);
                }
                i+=1;
            }
            else{
                if(!ans.contains(arr2[j])){
                    ans.add(arr2[j]);
                }
                j+=1;
            }
        }

        while(i<n)
        {
            if(i==0 || arr1[i]!=arr1[i-1]){
                ans.add(arr1[i]);
                i+=1;
            }
        }

        while(j<m)
        {
            if(j==0 || arr2[j]!=arr2[j-1]){
                ans.add(arr2[j]);
                j+=1;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Enter size of first array:");
        n=sc.nextInt();
        System.out.print("Enter size of second array:");
        m=sc.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[m];

        String s1[]=new String[n];
        String s2[]=new String[m];

        System.out.println("Enter elements into first array");
        for(int i=0;i<n;i++)
        {
            s1[i]=sc.next();
            arr1[i]=Integer.parseInt(s1[i]);
        }
        System.out.println("Enter elements into second array");
        for(int i=0;i<m;i++)
        {
            s2[i]=sc.next();
            arr2[i]=Integer.parseInt(s2[i]);
        }

        System.out.println("Union of 2 arrays is "+printUnion(arr1,n,arr2,m));
    }
}

import java.util.*;
public class QuickSort
{
    static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot)
            {
                i+=1;
            }
            while(arr[j]>pivot)
            {
                j-=1;
            }
            if(i<j)
            {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
    static void Quicksort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pr=partition(arr,low,high);
            Quicksort(arr,low,pr);
            Quicksort(arr,pr+1,high);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements into array");
        String[] s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            arr[i]=Integer.parseInt(s[i]);
        }
        arr[n]=Integer.MAX_VALUE;
        System.out.println("Elements before sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Quicksort(arr,0,n-1);
        System.out.println("Elements after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
import java.util.Scanner;
public class MergeSort {
    static void Merge(int[] arr,int low,int mid,int high)
    {
        int i=0;
        int j=0;
        int k=low;

        int left[]=new int[mid-low+1];
        int right[]=new int[high-mid];

        for( i=0;i<mid-low+1;i++)
        {
            left[i]=arr[low+i];
        }

        for(j=0;j<high-mid;j++)
        {
            right[j]=arr[mid+j+1];
        }

        i=0;j=0;

        while(i<mid-low+1 && j<high-mid)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i+=1;
                k+=1;
            }
            else if(right[j]<left[i])
            {
                arr[k]=right[j];
                k+=1;
                j+=1;
            }
        }

        while(i<mid-low+1)
        {
            arr[k]=left[i];
            k+=1;
            i+=1;
        }

        while(j<high-mid)
        {
            arr[k]=right[j];
            k+=1;
            j+=1;
        }
        
    }

    static void Mergesort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            Mergesort(arr,low,mid);
            Mergesort(arr,mid+1,high);
            Merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements into array");
        String[] s = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Array Before Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        Mergesort(arr,0,n-1);
        System.out.println();

        System.out.println("Array after Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}

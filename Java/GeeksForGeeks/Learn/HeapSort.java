import java.util.*;
public class HeapSort {

    static void heapify(int[] arr,int i,int n)
    {
        int largest=i;
        int left=(2*i)+1;
        int right=(2*i)+2;

        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }                                                   

        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,largest,n);

        }

    }

    static void Heapsort(int[] arr,int n){


        for(int i=(n/2)-1;i>=0;i--)
        {
            heapify(arr,i,n);
        }

        for(int i=n-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,0,i);
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements into array");
        String[] s=new String[n];

        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            arr[i]=Integer.parseInt(s[i]);
        }

        Heapsort(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

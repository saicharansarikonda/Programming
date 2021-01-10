import java.util.*;
public class BinarySearch {
    static int Binarysearch(int[] arr,int k,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>k){
                return Binarysearch(arr,k,low,mid-1);
            }
            else{
                return Binarysearch(arr,k,mid+1,high);
            }
        }
        else{
            return -1;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,k;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        String[] s = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println();
        System.out.println("Enter value to search in array");
        k=sc.nextInt();
        int x=Binarysearch(arr,k,0,n-1);
        if(x==-1)
        {
            System.out.println("Element "+k+" is not found in array");
        }
        else{
            System.out.println("Element "+k+" is found at index "+x+" in array");
        }
    }
}

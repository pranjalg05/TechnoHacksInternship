import java.util.*;

public class Array {

    static void swap(int[] arr, int id1, int id2){
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }

    static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while(i<=mid)
            temp[k++] = arr[i++];
        while(j<=end)
            temp[k++] = arr[j++];
        for(i=0;i<temp.length;i++)
            arr[start+i] = temp[i];
    }

    static void divide(int[] arr, int start, int end){
        if(start<=end)
            return;
        int mid = start + (end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    static int search(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array elements are: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to be searched: ");
        int key = in.nextInt();
        if(search(arr, key)==-1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found at index: " + search(arr, key));
        divide(arr,0,n-1);
        System.out.println("Sorted Array elements are: ");
        System.out.println(Arrays.toString(arr));
    }
}

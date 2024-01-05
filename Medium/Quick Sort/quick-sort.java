//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int s, int e)
    {
        // code here
        if(s >= e)return;
        int pi = partition(arr,s,e);
        quickSort(arr,s,pi-1);
        quickSort(arr,pi+1,e);
        
    }
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[], int s, int e)
    {
        // your code here
        int pivot = arr[s];
        int count = 0;
        for(int i = s+1 ; i <= e ; i++){
            if(arr[i] <= pivot)count++;
        }
        int pi = count+s;
        swap(arr,pi,s);
        int i = s;
        int j = e;
        while(i < pi && j > pi){
            while(arr[i] <= pivot)i++;
            while(arr[j] > pivot)j--;
            if(i < pi && j > pi){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pi;
    } 
}
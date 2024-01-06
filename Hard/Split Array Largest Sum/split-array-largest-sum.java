//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int countPartition(int arr[],int maxSum){
        int partition=1;
        long subarraySum =0;
        for(int i=0;i<arr.length;i++){
            if(subarraySum+arr[i]<=maxSum){
                subarraySum += arr[i];
            }else{
                partition++;
                subarraySum = arr[i];
            }
        }
        return partition;
    }
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int low = arr[0];
        int high =0;
        // Find maximum and summation
        for(int i=0;i<arr.length;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        // Binary Search
        while(low<=high){
            int mid = (low+high)/2;
            int partitions = countPartition(arr,mid);
            if(partitions>K){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
};
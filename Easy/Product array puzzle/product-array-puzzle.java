//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
    public static long[] productExceptSelf(int nums[], int n) 
    { 
        // code here
        long product = 1;
        long arr[] = new long[n];
        int zeroCount = 0;
        int zeroIndex = -1;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
            }else{
                product *= nums[i];
            }
        }
        if(zeroCount > 1) return arr;
        
        if(zeroCount == 0){
            for(int i = 0; i<n; i++){
                arr[i] = product/nums[i];
            }
        }else{
            arr[zeroIndex] = product;
        }
        return arr;
    }
} 

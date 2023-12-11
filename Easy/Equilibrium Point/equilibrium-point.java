//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        if(arr.length==1){
            return 1;
        }
        if(arr.length==2){
            return -1;
        }
        long sum=0,sum1=0;
        
       for(int i=0;i<n;i++){
           sum=sum+arr[i];
       }
           for(int i=0;i<n;i++){
               sum=sum-arr[i];
            
               if(sum==sum1){
                   return i+1;
                   
               }else{
                  sum1=sum1+arr[i];
               }
            }
       return -1;
    }     
}
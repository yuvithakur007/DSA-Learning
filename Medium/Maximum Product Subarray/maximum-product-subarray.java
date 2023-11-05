//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    long maxProduct(int[] arr, int n) {
        long p=1;
        long s=1;
        long maxi=arr[0];
        
        for(int i=0;i<n;i++)
        {
            if(p==0) p=1;
            if(s==0) s=1;
            
            p=p*arr[i];
            s=s*arr[n-i-1];
            
            maxi=Math.max(maxi,s);
            maxi=Math.max(maxi,p);
        }
        return maxi;
    }
}
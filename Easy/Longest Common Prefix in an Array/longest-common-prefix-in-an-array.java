//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        if(arr.length==1) return arr[0];
        
        String word1 = arr[0];
        String word2 = "";
        String result="";
        
        for(int i=1;i<n;i++){
            int j=0;
            result="";
            word2=arr[i];
            while(j<word1.length() && j<word2.length()){
                if(word1.charAt(j)==word2.charAt(j)) result += word1.charAt(j);
                else break;
                j++;
            }
            word1=result;
        }
      if(result=="") return "-1";
      return result;
    }
}
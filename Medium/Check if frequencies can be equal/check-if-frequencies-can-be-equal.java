//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
boolean sameFreq(String s) 
    {
        int[] freqs = new int[26];
        for (char ch: s.toCharArray())
            freqs[ch - 'a']++;
            
        int indexMin = -1;
        int indexMax = -1;
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < 26; i++)
        {
            if (freqs[i] > 0)
            {
                if (freqs[i] > max)
                {
                    max = freqs[i];
                    indexMax = i;
                }
                if (freqs[i] < min)
                {
                    min = freqs[i];
                    indexMin = i;
                }
            }
        }
        // check if all are equals, or try to remove 1 from max frequency or min frequency and then re-check if becomes equal

        if (checkEquality(freqs))   return true;
            
        freqs[indexMax]--;
        
        if (checkEquality(freqs))   return true;
            
        freqs[indexMax]++; // to revert the change done before
        freqs[indexMin]--;
        
        if (checkEquality(freqs))   return true;
            
        return false;
    }
    boolean checkEquality(int[] arr)
    {
        boolean flag = false;
        int value = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0 && flag == false)
            {
                value = arr[i];
                flag = true;
            }
            else if (arr[i] > 0 && flag == true)
            {
                if (arr[i] != value)
                    return false;
            }
        }
        return true;
    }
}
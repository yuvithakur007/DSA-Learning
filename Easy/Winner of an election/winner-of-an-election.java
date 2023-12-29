//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n){
            
            HashMap<String, Integer> memo = new HashMap<String, Integer>();
            for(String s : arr){
                memo.put(s, memo.getOrDefault(s, 0)+1);
            }
            String ans = "";
            int maxvotes = Integer.MIN_VALUE;
            for(Map.Entry<String, Integer> map : memo.entrySet()){
                String key = map.getKey();
                if(map.getValue() > maxvotes || (map.getValue() >= maxvotes && key.length() < ans.length()) || (map.getValue() >= maxvotes && ans.compareTo(key) > 0)){
                    ans = key;
                    maxvotes =map.getValue();
                }
            }
            return new String[]{ans, Integer.toString(maxvotes)};
        }
}


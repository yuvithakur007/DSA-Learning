//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        int n = text.length();
        int m =pattern.length();

        for(int i = 0;i<=n-m;i++){
            if(pattern.equals(text.substring(i,i+m))){
                arr.add(i+1);
            }
        }
        return arr;
    }
}
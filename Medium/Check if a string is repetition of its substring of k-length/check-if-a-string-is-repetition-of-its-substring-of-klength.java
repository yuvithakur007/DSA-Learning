//{ Driver Code Starts
//Initial Template for Java

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
            String s = sc.next();
            int k = sc.nextInt();
            int answer = new Solution().kSubstrConcat(n,s,k);
    		System.out.println(answer);
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
   int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here
        if(n%k!=0)
        {
            return 0;
        }
        int i=0;
        HashSet<String>set=new HashSet<>();
        String res="";
        for(i=0;i<k;i++)
        {
            res+=s.charAt(i);
        }
        set.add(res);
        res="";
        i=k;
        while(i<n)
        {
            int j=0;
            while(j<k)
            {
                res+=s.charAt(i);
                i++;
                j++;
            }
            set.add(res);
            res="";
        }
        if(set.size()<=2)
        {
            return 1;
        }
        return 0;
        
    }
}
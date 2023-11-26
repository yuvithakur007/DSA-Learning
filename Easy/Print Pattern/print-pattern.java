//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    ArrayList<Integer> a = new ArrayList<>();
    
    public void patMinus(int n){
        if(n <= 0)
            return;
        a.add(n-5);
        patMinus(n-5);
    }
    public void patPlus(int val, int n){
        if(n == val)
            return;
        a.add(val+5);
        patPlus(val+5, n);
    }
    public List<Integer> pattern(int N){
        // code here
        a.add(N);
        patMinus(N);
        patPlus(a.get(a.size()-1), N);
        return a;
    }
}
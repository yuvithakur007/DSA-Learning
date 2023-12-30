//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] coins = IntArray.input(br, N);
            
            Solution obj = new Solution();
            boolean res = obj.isPossible(N, coins);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends



class Solution {
static int dp[][];
    public static boolean getAll(int coins[],int i,int s, int n){
        if(i==n){
            return s!=0 && (s%20==0 || s%24==0 || s==2024);
        }
        if(s!=0 && s%20==0){
            return true;
        }
        if(s!=0 && s%24==0){
            return true;
        }
        if(s!=0 && s==2024){
            return true;
        }
        if(dp[i][s]!=-1){
            return dp[i][s]==1;
        }
        boolean p,np;
        p = getAll(coins,i+1,s+coins[i],n);
        np = getAll(coins,i+1,s,n);
        dp[i][s] = p||np?1:0;
        return p||np;
    }
    public static boolean isPossible(int N, int[] coins) {
        // code here
        dp = new int[N][2025];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return getAll(coins,0,0,N);
    }
}
        

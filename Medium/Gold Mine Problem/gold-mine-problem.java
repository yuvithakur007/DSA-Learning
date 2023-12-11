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
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxGold(int n, int m, int M[][]) {
        int rahee[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            rahee[i][m - 1] = M[i][m - 1];
        }
        
        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                if (n == 1) {
                    rahee[i][j] = M[i][j] + rahee[i][j + 1];
                } else if (i == 0) {
                    rahee[i][j] = M[i][j] + Math.max(rahee[i][j + 1], rahee[i + 1][j + 1]);
                } else if (i == n - 1) {
                    rahee[i][j] = M[i][j] + Math.max(rahee[i][j + 1], rahee[i - 1][j + 1]);
                } else {
                    rahee[i][j] = M[i][j] + Math.max(rahee[i][j + 1], Math.max(rahee[i + 1][j + 1], rahee[i - 1][j + 1]));
                }
            }
        }
        
        int maxGold = rahee[0][0];
        for (int i = 1; i < n; i++) {
            if (rahee[i][0] > maxGold) {
                maxGold = rahee[i][0];
            }
        }
        
        return maxGold;
    }
}
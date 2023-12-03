//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long q = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            long l[] = new long[(int)(q)];
            long r[] = new long[(int)(q)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine1[i]);
            }
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < 2*q; i+=2) {
                l[(i/2)] = Long.parseLong(inputLine[i]);
                r[(i/2)] = Long.parseLong(inputLine[i+1]);
            }
            
            
            Solution obj = new Solution();
            long ans[] = obj.maxPrefixes(a, l, r, n, q);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<q;i++)
            output.append(ans[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long aux(long arr[] , int k , int l){
        long max = Long.MIN_VALUE;
        long sum =0;
        for(int i = k ; i <= l ; i++){
            sum+=arr[i];
            if(sum > max){
                max = sum;
            }
        }
        return max;
        }
    
    long[] maxPrefixes(long a[], long L[], long R[], long N, long Q) 
    {
        int q = (int)Q;
        long ans[] = new long[q];
        for(int i =0 ; i <q ; i++){
            int l = (int)L[i];
            int r = (int)R[i];
            long val = aux(a,l,r);
            ans[i] = val;
        }
            
        return ans;
    }
}
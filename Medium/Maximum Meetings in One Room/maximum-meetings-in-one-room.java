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
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> maxMeetings(int n, int[] S, int[] F) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Integer[][] a  = new Integer[n][3];
        for(int i=0;i<n;i++) a[i]=new Integer[]{S[i],F[i],i};
        Arrays.sort(a,(x,y)->{
            return x[1]==y[1]?x[0]-y[0]:x[1]-y[1];
        });
        // for(Integer[] i:a) System.out.print(Arrays.toString(i)+" ");
        ans.add(a[0][2]+1);
        int lastEnd = a[0][1];
        for(int i=1;i<n;i++){
            Integer[] x = a[i];
            if(x[0]<=lastEnd) continue;
            lastEnd = x[1];
            ans.add(x[2]+1);
            
        }
        Collections.sort(ans);
        return ans;
    }
}
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Queue<Character> q = new LinkedList<>();
        int[] map = new int[26];
        StringBuilder res = new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            map[ch-97]++;
            if(map[ch-97]==1)
            {
            q.add(ch);
            }
            while(!q.isEmpty() && map[q.peek()-97]>1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                res.append("#");
            }
            else
            {
                res.append(q.peek());
            }
        }
        return res.toString();
    }
}
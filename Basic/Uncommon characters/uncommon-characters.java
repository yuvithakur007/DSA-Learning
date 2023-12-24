//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
        {
           StringBuilder ansA = new StringBuilder();
        StringBuilder ansB = new StringBuilder();
        
        for (int i = 0; i < B.length(); i++) {
            if (!A.contains(String.valueOf(B.charAt(i))) && !ansA.toString().contains(String.valueOf(B.charAt(i)))) {
                ansA.append(B.charAt(i));
            }
        }
    
        for (int i = 0; i < A.length(); i++) {
            if (!B.contains(String.valueOf(A.charAt(i))) && !ansB.toString().contains(String.valueOf(A.charAt(i)))) {
                ansB.append(A.charAt(i));
            }
        }
        if(ansA.length()==0 && ansB.length()==0)
        {
            return "-1";
        }
    
        StringBuilder ret = new StringBuilder(ansA);
        ret.append(ansB);
    
        char[] c = ret.toString().toCharArray();
        Arrays.sort(c);
    
        return new String(c);
        }
}
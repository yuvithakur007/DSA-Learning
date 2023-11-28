//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            Solution obj = new Solution();
            int[] ans=obj.longestCommonPrefix(s1,s2);
            if(ans[0] == -1)
                System.out.println(ans[0]);
            else 
                System.out.println(ans[0]+" "+ans[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int[] longestCommonPrefix(String s1, String s2){
        int i = 0;
        int m = s2.length();
        int a[] = new int[2];
        
        
        a[0]=-1;
        a[1]=-1;
        for(int j=0;j<m;j++){
            
            
            if(s1.charAt(i)==s2.charAt(j)){
                a[1] = Math.max(a[1],i);
                i++;
                
            }else{
                i=0;
                if(s1.charAt(i)==s2.charAt(j)){
                    a[1] = Math.max(a[1],i);
                    i++;
                }
            }
        }
        
        if(a[1]>-1){
            a[0]=0;
        }
        
        return a;
    }
}
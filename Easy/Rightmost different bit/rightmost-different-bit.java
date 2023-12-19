//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int posOfRightMostDiffBit(int m, int n)
    {
        // Your code here        
        String str1 = Integer.toBinaryString(m);
        String str2 = Integer.toBinaryString(n);
        int len1 = str1.length();
        int len2 = str2.length();
        int min = Math.min(len1, len2);
        for (int i = 0; i < min; i++) {
            char ch1 = str1.charAt(len1 - 1 - i);
            char ch2 = str2.charAt(len2 - 1 - i);

            if (ch1 != ch2) {
                return i+1; 
            }
        }
        if (len1 > len2) {
            return len2+1; 
        }
        if (len1 < len2) {
            return len1+1;
        }
        return -1;
    }
}


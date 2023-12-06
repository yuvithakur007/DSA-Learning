//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution(); 
            System.out.println(ob.patternCount(S));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    int patternCount(String S) 
    { 
        int count = 0;
        boolean one = false;
        boolean zero = false;
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch != '1' && ch != '0'){
                one = false;
                zero = false;
            }
            if(ch == '1'){
                one = true;
            }
            if(one == true && ch == '0'){
                zero = true;
            }
            if(one == true &&  zero == true && ch == '1'){
                count++;
                zero = false;
            }
        }
        return count;
    }
}
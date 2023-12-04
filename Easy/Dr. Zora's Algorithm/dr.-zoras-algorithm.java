//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int year = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isDestructive(year));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
   static String isDestructive(int year){
       int ye=year;
       int rem=0;
       int sum=0;
       while(ye!=0)
       {
           rem=ye%10;
           sum=sum+rem;
           ye=ye/10;
       }
       int last=year%100;
       if(sum%2!=0 && last%6==0)
       {
           return "Destructive Year";
       }
       else
       {
           return "Non-Destructive Year";
       }
   }
}

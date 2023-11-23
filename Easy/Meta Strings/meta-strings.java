//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S1 = read.readLine().trim(); 
            String S2 = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.metaStrings(S1, S2))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean metaStrings(String S1, String S2) 
    { 
        // code here
        int n1 = S1.length();
        int n2 = S2.length();
        char ch=' ';
        
        if(n1 != n2) return false;
        
        int count = 0;
        boolean key = false;
        
        for(int i = 0; i < n1; i++){
            if(S1.charAt(i) != S2.charAt(i)){
                if(count == 0){
                    ch = S1.charAt(i);
                    count++;
                    continue;
                }
                if(count == 1){
                    if(ch == S2.charAt(i)){
                        key = true;
                    }else{
                        return false;
                    }
                    count++;
                    continue;
                }
                if(count >= 2){
                   return false;   
                }
            }
        }
        return key;
    }
} 

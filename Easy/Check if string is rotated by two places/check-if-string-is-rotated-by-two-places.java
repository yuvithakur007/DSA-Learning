//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        String shift_right = str2.substring(str2.length() - 2, str2.length()) + str2.substring(0, str2.length() - 2);
        String shift_left = str2.substring(2, str2.length()) + str2.substring(0, 2);
        
        if(shift_left.equalsIgnoreCase(str1) || shift_right.equalsIgnoreCase(str1))
            return true;
        return false;
    }
    
}
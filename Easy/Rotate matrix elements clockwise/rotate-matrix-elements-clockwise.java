//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(N, M, A);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
       int[][] rotateMatrix(int M, int N, int Mat[][]) {
            if(M==1 || N==1) return Mat;
            
            int topleft=0;  //think it like upper row
            int topright=N-1;  //think it like right side(column)
            int bottomright=M-1;  //think it like bottom row
            int bottomleft=0; //think it like left side(column)
            
            
            while(topleft<bottomright && bottomleft<topright){
                
                int prev = Mat[topleft+1][bottomleft];
                
                for(int i=bottomleft; i<=topright; i++){
                    int curr = Mat[topleft][i];
                    Mat[topleft][i] = prev;
                    prev = curr;
                }
                topleft++;
                
                for(int i=topleft; i<=bottomright; i++){
                    int curr = Mat[i][topright];
                    Mat[i][topright] = prev;
                    prev = curr;
                }
                topright--;
                
                if(topleft<=bottomright){
                    for(int i=topright; i>=bottomleft; i--){
                        int curr = Mat[bottomright][i];
                        Mat[bottomright][i] = prev;
                        prev = curr;
                    }
                    bottomright--;
                }
                
                if(bottomleft<=topright){
                    for(int i=bottomright; i>=topleft; i--){
                        int curr = Mat[i][bottomleft];
                        Mat[i][bottomleft] = prev;
                        prev = curr;
                    }
                    bottomleft++;
                }
           }
           
           return Mat;
        }   
}
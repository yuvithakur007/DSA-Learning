import java.util.Arrays;

public class pairsum {
    public static void main(String[] args){
        // count the pairs whose sum is equal to k 
        // int[] arr= {0,-1,2,1,3,5};
        // int k= 4;
        // int count=0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i]+arr[j]==k){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        
        // count the pairs whose sum is equal to k in O(n) using sorting

        int[] arr= {-1,-1,0,1,2,3,0,5,5};
        int k= 4;
        int count=0;
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                count++;
                if(arr[i]==arr[i+1]){
                    count++;
                    if(arr[j]==arr[j-1]){
                        count++;
                        j--;
                    }
                    i++;
                    continue;
                }
                else if(arr[j]==arr[j-1]){
                    j--;
                }
                else{
                    i++;
                    j--;
                }
            }
            else if(arr[i]+arr[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(count);

    }

}

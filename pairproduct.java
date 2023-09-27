// import java.util.Arrays;
public class pairproduct {
    public static void main(String[] args){
        
        int[] arr= {1,2,3,6};
        int k= 5;
        int count=0;
        // find subarrays continues manner, whose product is less than or equal to k
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<k){
                count++;
            }

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j]<k){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}

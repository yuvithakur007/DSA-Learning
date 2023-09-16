public class rightmostMax {
    public static void main(String[] args){
        // print leader element in array
        int[] arr= {5,17,9,3,10,6,4};
        int max= arr[arr.length-1];
        System.out.print(max+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(max+" ");
            }
        }
    }
}
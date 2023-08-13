public class uniqueNumber {
    public static void main(String[] args) {
        int n=12341;
        // unique number is a number in which no digit is repeated
        // 12341 is a unique number
        // 12321 is not a unique number
        // 12341 is a unique number
        //code in java
        // boolean isUnique=true;
        // int[] freq=new int[10];
        // while(n>0){
        //     int digit=n%10;
        //     freq[digit]++;
        //     n=n/10;
        // }
        // for(int i=0;i<10;i++){
        //     if(freq[i]>1){
        //         isUnique=false;
        //         break;
        //     }
        // }
        // if(isUnique){
        //     System.out.println("Unique Number");
        // }else{
        //     System.out.println("Not a Unique Number");
        // }
        
        // unique number is a number in which no digit is repeated not using extra sspace using java cod
        boolean isUnique=true;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            int temp2=temp/10;
            while(temp2>0){
                int digit2=temp2%10;
                if(digit==digit2){
                    isUnique=false;
                    break;
                }
                temp2=temp2/10;
            }
            temp=temp/10;
        }
        if(isUnique){
            System.out.println("Unique Number");
        }else{
            System.out.println("Not a Unique Number");
        }
    }
}
public class harshadNumber {
    public static void main(String[] args){
        // harshad number are those which is exactly divisible by sum of its digits
        // 18 is a harshad number
        // 19 is not a harshad number
        int n=18;
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(n%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }

        
    }
}
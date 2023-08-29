public class magicNumber {
    public static void main(String[] args){
        // check if given number is magic number or not
        // magic number is a number whose sum of digits is 1
        // e.g. 19 is a magic number because 1 + 9 = 10 and 1 + 0 = 1
        // int num = 19;
        // int sum = 0;
        // while (num > 0 || sum > 9){
        //     if (num == 0){
        //         num = sum;
        //         sum = 0;
        //     }
        //     sum += num % 10;
        //     num /= 10;
        // }
        // if (sum == 1){
        //     System.out.println("Magic number");
        // } else {
        //     System.out.println("Not a magic number");
        // }



        // 4 using recursion find magic number
        int num = 9;
        int sum = magic(num);

        if (sum == 1){
            System.out.println(sum +" Magic number");
        } else {
            System.out.println(sum+ " Not a magic number");
        }
        //5 also check if prime or not
        if(sum==2 || sum== 3 || sum==5 || sum==7){
            System.out.println(sum+" Prime no");
        }else{
            System.out.println(sum+" Not Prime no");
        }
        
    }
    static int magic(int n){
        if (n == 0){
            return 0;
        }
        int sum= (n % 10 + magic(n / 10));
        if(sum>9){
            return magic(sum);
        }else {
            return sum;
        }
    }
}
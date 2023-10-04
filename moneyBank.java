import java.util.*;
public class moneyBank {
    public static void main(String[] args){
        // if number=1 we want to make any number only using multiply of 10, 20 to 1,,,, equation:  n= 10x+20y so find gcd (10,20) which is 10 then check the number we want is divisible by gcd is or not.
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1){
            System.out.println("Yes");
        }
        if(n%10==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

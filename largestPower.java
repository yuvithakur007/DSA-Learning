import java.util.*;
public class largestPower {
    // print largest power of prime number that divides  n factorial
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // factorial of n
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact +" fact");
        int p = sc.nextInt();
        sc.close();

        int largest = 0;
        for(int i=1;i<=p;i++){
            // check power of p that divides fact
            if((Math.pow(p,i))==fact){
                largest = i;
                break;
            }       
        }
        
        System.out.println(largest);
        
    }
}

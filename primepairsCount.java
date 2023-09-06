import java.util.*;

public class primepairsCount {
    // print the count of prime pairs in range n and m, 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++){
            for(int j=i+1;j<=m;j++){
                if(isPrime(i)&&isPrime(j) && ((j-i) ==6 || (i-j) ==6)){
                    System.out.print("("+i+ ","+j+")");
                        count++;                    
                }
            }    
            if(i==m){
                break;
            }
        }
        System.out.println();
        System.out.println(count);

    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

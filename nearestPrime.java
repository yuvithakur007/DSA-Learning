import java.util.Scanner;
public class nearestPrime {
	// static int prime(int n)
	// {
	// 	if (n % 2 != 0)
	// 		n -= 2;
	// 	else
	// 		n--;

	// 	int i, j;
	// 	
	// 	for (i = n; i >= 2; i -= 2) {
	// 		if (i % 2 == 0)
	// 			continue;
	// 		for (j = 3; j <= Math.sqrt(i); j += 2) {
	// 			if (i % j == 0)
	// 				break;
	// 		}
	// 		if (j > Math.sqrt(i))
	// 			return i;
	// 	}
	// 	return 2;
	// }

static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
// nearest(next or previous both) ans smallest prime number to given number ex: n= 51 , ans = 53
	
	public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int n1=n+1;
		int n2= n-1;
		while(n2>0){
			if(isPrime(n2)){
				System.out.println(n2);
				break;
			}
			if(isPrime(n1)){
				System.out.println(n1);
				break;
			}
			n1++;
			n2--;
		}
	}
}


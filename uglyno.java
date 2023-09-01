import java.util.Scanner;
public class uglyno {
    // find nth ugly number(who is divisible by prime numbers)
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] ugly= new int[n];

        ugly[0]=1;

        int i2=0, i3=0, i5=0;
        int next_multiple_of_2= ugly[i2]*2;
        int next_multiple_of_3= ugly[i3]*3;
        int next_multiple_of_5= ugly[i5]*5;

        int next_ugly_no=1;
        for(int i=1; i<n; i++){
            next_ugly_no= Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));
            ugly[i]= next_ugly_no;

            if(next_ugly_no==next_multiple_of_2){
                i2++;
                next_multiple_of_2= ugly[i2]*2;
            }
            if(next_ugly_no==next_multiple_of_3){
                i3++;
                next_multiple_of_3= ugly[i3]*3;
            }
            if(next_ugly_no==next_multiple_of_5){
                i5++;
                next_multiple_of_5= ugly[i5]*5;
            }
        }

        for(int elm: ugly){
            System.out.print(elm+" ");
        }
        System.out.println();

        System.out.println(next_ugly_no);
    }
}

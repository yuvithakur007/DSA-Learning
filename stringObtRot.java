import java.util.Scanner;

public class stringObtRot {
        public static void main(String[] args) {
        // check if string "B" obtained by roration of string "A" exactly by 2 places 
        // String A='AMAZON';
        // String B='AZONAM';

        String A="AMAZON";
        String B="AZONAM";
        String ans = A.substring(2) + A.substring(0, 2);
        System.out.println("ans: "+ans);
        if((ans)==B){
            System.out.print("YES");

        }else{
            System.out.print("NO");

        }
    }
}
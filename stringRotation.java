import java.util.Scanner;

public class stringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String pos = sc.nextLine();

        if (pos.equals("l")) {
            String ans = str.substring(len) + str.substring(0, len);
            System.out.print(ans);
        } else if (pos.equals("r")) {
            String ans = str.substring(str.length() - len) + str.substring(0, str.length() - len);
            System.out.print(ans);
        }
    }
}

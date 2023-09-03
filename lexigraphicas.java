import java.util.Arrays;

public class lexigraphicas {
    // sort the string alphabetic order
    public static void main(String[] args) {
        String s = "hello";
        char[] ch = s.toCharArray();
         for (int i = 0; i < ch.length; i++) {
           for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
               }
            }
         }

        
        System.out.println(ch);
    }
    // decrease the complexity of previous
    // public static void main(String[] args) {
    //     String s = "hello";
    //     char[] ch = s.toCharArray();
    //     Arrays.sort(ch);
    //     System.out.println(ch);
    // }
}

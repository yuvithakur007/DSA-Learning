public class spy {
    public static void main(String[] args){
        // whose sum and product or digits are same
        int n = 1124;
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n = n/10;
        }
        if(sum == product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
        }
        
    }
}   
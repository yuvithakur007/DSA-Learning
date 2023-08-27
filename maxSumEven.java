import java.util.Scanner;
public class maxSumEven {
    static int maxSum(val[], maxsum) 
    {
        int sum = 0;
        for (int i = 0; i < val.length; i++){   
            sum = sum + val[i];  
        } 

        if(sum>maxSum){
            maxSum=sum;
            return maxsum;
        }
        return maxSum;
    }
    public static void main(String args[]){
    
    int maxSum= 0;

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int val[] = new int [];
    maxSum(val[],maxSum);
    }
}
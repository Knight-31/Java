import java.util.*;

public class reversednum {
   
    public static int reverse(int n) {
        /* Function to return the reverse of a number n */
        int reverse = 0;
        while(n != 0) {
            int remainder = n % 10;  
            reverse = reverse * 10 + remainder;  
            n = n / 10;
        }
        return reverse;      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int output = reverse(n);
        System.out.println(output);
    }
}
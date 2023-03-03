import java.util.Scanner;

public class evennum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Even numbers from 1 to " + n + " except numbers divisible by 4 are:");
        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
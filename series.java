import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("The series up to " + n + " is:");
        for (int i = 1; i * i * i <= n; i++) {
            int result = i * i * i;
            System.out.println(result);
        }
    }
}

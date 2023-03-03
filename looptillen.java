import java.util.Scanner;
// Java program to print all numbers from 1 to n until m is encountered
public class looptillen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of m: ");
        int m = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == m) {
                break;
            }
            System.out.println(i);
        } 
    }
}

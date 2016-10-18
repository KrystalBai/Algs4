import java.util.Scanner;
public class Exer14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer number:");
        int num = scanner.nextInt();
        int result = lg(num);
        System.out.println(result);
    }
    public static int lg(int num) {
        int result = 1, count = 0;
        while(result <= num) {
            result *= 2;
            ++count;
        }
        return --count;
    }
}
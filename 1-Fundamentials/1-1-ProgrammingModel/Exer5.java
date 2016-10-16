import java.util.Scanner;
public class Exer5 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a double number:");
     double number = scanner.nextDouble();
     if(number < 1 && number > 0) System.out.println("true");
     else System.out.println("false");
    }
}
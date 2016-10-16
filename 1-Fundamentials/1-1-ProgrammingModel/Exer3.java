import java.util.Scanner;
public class Exer3 {
 public static void main(String[] arge) {
     Scanner scanner = new Scanner(System.in);
     int num1 = scanner.nextInt();
     int num2 = scanner.nextInt();
     int num3 = scanner.nextInt();
     if( (num1 == num2) && (num2 == num3) ){
         System.out.println("equal");
     }else{
         System.out.println("not equal");
     }
 }
}
import java.util.Scanner;
public class Exer24 {
    public static void main(String[] args) {
        int res = Euclid(105, 24);
        System.out.println("Result:" + res);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer number in a line splited with space.");
        String input = scanner.nextLine().trim();
        int p = Integer.parseInt(input.split(" ")[0]),
            q = Integer.parseInt(input.split(" ")[1]); 
        res = Euclid(p, q);
        System.out.println("Result:" + res);
        res = Euclid(1111111, 1234567);
        System.out.println("Result:" + res);
    } 
    public static int Euclid(int p, int q) {
        System.out.println("p:" + p + ",q:" + q);
        if(q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }
}
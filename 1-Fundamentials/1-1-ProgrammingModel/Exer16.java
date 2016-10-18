public class Exer16 {
    public static void main(String[] args) {
        String result = exR1(6);
        System.out.printf(result);  //311361142246
    }
    public static String exR1(int n) {
       if(n <= 0) return "";
       return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
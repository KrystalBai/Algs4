import java.lang.Math;
public class Exer20 {
    public static void main(String[] args) {
        double res = ln(4);
        System.out.print(res);    //3.178053830347945
    }
    public static double ln(int N) {
        if(N == 0 || N == 1) return 0;
        else if(N > 1) return Math.log(N) + ln(N - 1);
        else return -1;
    }
}
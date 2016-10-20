public class Exer19 {
    public static long F(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F(N - 1) + F(N - 2);   //0 1 1 2 3 5 ... The biggest N = 56 (Calculated within one hour)
    }    
    public static long[] F1(int N) {   //Optimized version
        long[] res = new long[N];
        if(N >= 1) res[1] = 1;
        for(int i = 2;i < N; i++) res[i] = res[i-1] + res[i-2];
        return res;
    }
    public static void main(String[] args) {
        long[] res = F1(100);
        for(int i = 0; i < 100; i++)
            System.out.println(i + " " + res[i]);
    } 
}
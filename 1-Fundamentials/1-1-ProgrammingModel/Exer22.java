public class Exer22 {
    public static int rank(int key, int[] a) {
       return rank(key, a, 0, a.length-1, 0);
    }
    public static int rank(int key, int[] a, int lo, int hi, int dep) {
        System.out.println("lo:"+lo+",hi:"+hi+",dep:"+(dep++));
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid]) return rank(key, a, lo, mid - 1, dep);
        else if(key > a[mid]) return rank(key, a, mid + 1, hi, dep);
        else return mid;
    }
}
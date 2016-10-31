import java.util.Scanner;
public class Exer23 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter + (Finding elements not in the list) or - (Finding elements in the list)");
       String input = scanner.next();
       int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
       int res = rank(-1, arr); 
       if(new String("+").equals(input)) {
          for(int i = 0; i < arr.length; i++) {
             if(res != i)
                System.out.print(arr[i]+" ");
          }
       }
       else if(new String("-").equals(input) && res != -1)
           System.out.println(arr[res]);
       else if(new String("-").equals(input) && res == -1)
           System.out.println("Not found");
       
    }
    public static int rank(int key, int[] a) {
       return rank(key, a, 0, a.length-1);
    }
    public static int rank(int key, int[] a, int lo, int hi) {
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid]) return rank(key, a, lo, mid - 1);
        else if(key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }
}
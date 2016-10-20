public class Exer18 {
    public static void main(String[] args) {
        mystery(2, 25);  //50
        mystery(3, 11);  //33
        mystery(a, b);   //a*b
        mystery2(2, 25);  //33554432
        mystery2(3, 11);  //177147
        mystery2(a, b);   //a^b
    }
    public static int mystery1(int a, int b) {
       if(b == 0) return 0;
       if(b % 2 == 0) return mystery1(a + a,b / 2);
       return mystery1(a + a, b / 2) + a;
    }
    public static int mystery2(int a, int b) {
       if(b == 0) return 1;
       if(b % 2 == 0) return mystery2(a * a,b / 2);
       return mystery2(a * a, b / 2) * a;
    }
}
public static String exR2(int n) {
   String s = exR2(n - 3) + n + exR2(n - 2) + n;   //java.lang.StackOverflowError
   if(n <= 0) return "";
   return s;
}
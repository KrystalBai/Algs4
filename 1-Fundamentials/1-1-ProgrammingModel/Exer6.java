int f = 0;
int g = 1;
for(int i = 0; i <= 15; i++) {
   System.out.println(f);  //Fibonacci number
   f = f + g;
   g = f - g;
}


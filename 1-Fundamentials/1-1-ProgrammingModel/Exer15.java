public static int[] histogram(int[] a, int m) {   //m should bigger than 0 and less than a.length+1
   int len = a.length;
   int[] pos = new int[len], neg = new int[len], res = new int[m];
   for(int i = 0; i < len; i++) {
      if(a[i] < 0) neg[-a[i]]++;   
      else if(a[i] >= 0 ) pos[a[i]]++;
   }
   for(int j = 0; j < m; j++) {
      if(a[j] < 0) res[j] = neg[-a[j]];
      else if (a[j] >= 0) res[j] = pos[a[j]];
   }
   return res;
}

public class Exer11 {
    public static void main(String[] args) {
        boolean[][] multi = new boolean[][]{
            { true, false, false, false },
            { true, true, false, false },
            { true, true, true, false },
            { true, true, true, true }
        };
        for(int i = 0; i < multi.length; i++) {
            for(int j = 0; j < multi[i].length; j++) {
               if(multi[i][j]) System.out.printf("*");
               else System.out.printf(" ");
            }
            System.out.println();
        }  
    }
}
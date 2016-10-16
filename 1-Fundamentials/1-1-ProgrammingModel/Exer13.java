public class Exer13 {
    public static void main(String[] args) {
        String[][] multi = new String[][]{
            {"*","*","*"},
            {"#","#","#"},
            {"*","*","*"}
        };
        for(int i = 0; i < multi.length; i++) {
            for(int j = 0; j< multi[i].length; j++) {
                System.out.printf(multi[j][i]);
            }
            System.out.println();
        }
    }
}
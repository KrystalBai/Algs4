import java.util.Scanner;
public class Exer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = "";
        System.out.println("Enter a name and two integer number in a line splited with space(To end the input, press '#' key)");
        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            int pos = input.indexOf("#");
            if(pos != -1) {
                input.substring(0, pos).trim();
                break;
            }
            double temp1 = Double.parseDouble(input.split(" ")[1]),
                   temp2 = Double.parseDouble(input.split(" ")[2]);     
            input += ' ' + String.format("%.3f", temp1/temp2);
            inputs += input + "-";
        }
        String[] str = inputs.split("-");
        for(int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
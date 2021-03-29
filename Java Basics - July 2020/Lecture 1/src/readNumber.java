import java.util.Scanner;

public class readNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double number = Double.parseDouble(input);
        double result = number * 2.54;
        System.out.println(result);
    }
}

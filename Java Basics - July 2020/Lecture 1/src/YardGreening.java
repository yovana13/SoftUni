import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());

        double price = meters*7.61;
        double discount = price*0.18;
        System.out.printf("The final price is: %.2f lv.",price-discount);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.",discount);

    }
}
import java.util.Scanner;

public class ShopingForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int sketchbooks = Integer.parseInt(scanner.nextLine());
        int notebook = Integer.parseInt(scanner.nextLine());

        double total = pencils*4.75 + (markers*1.80) + (sketchbooks*6.50) + (notebook*2.50);

        total= total - total*0.05;
        System.out.printf("Your total is %.2flv",total);
    }
}

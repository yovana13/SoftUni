import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int higth = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = (length*width*higth) * 0.001;
        double neededLiters = volume * (1 - percent*0.01);

        System.out.printf("%.2f",neededLiters);
    }
}

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typProjection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        if(typProjection.equals("Premiere"))
        {
            System.out.printf("%.2f leva", row*column*12.00);
        }
        else if(typProjection.equals("Normal"))
            System.out.printf("%.2f leva", row*column*7.50);
        else if(typProjection.equals("Discount"))
            System.out.printf("%.2f leva", row*column*5.00);
    }
}

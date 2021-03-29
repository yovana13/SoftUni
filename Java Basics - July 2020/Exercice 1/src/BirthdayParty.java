import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hall = Integer.parseInt(scanner.nextLine());

        double cake = hall * 20 / 100;
        double drinks = cake - cake * 45 / 100;
        double animator = hall / 3;
        double result = hall + cake + drinks + animator;

        System.out.printf("%.2f",result);
    }
}

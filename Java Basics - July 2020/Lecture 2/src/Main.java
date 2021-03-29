import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = "Pesho";
        String secondString = scanner.nextLine();

        System.out.println(firstString.equals(secondString));
    }
}

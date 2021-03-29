import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int minSum= Integer.parseInt(scanner.nextLine());

        while (sum<minSum)
        {
            int number = Integer.parseInt(scanner.nextLine());
            sum+=number;
        }
        System.out.println(sum);
    }
}

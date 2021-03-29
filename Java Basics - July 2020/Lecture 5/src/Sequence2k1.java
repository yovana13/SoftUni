import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int prevNumber = 1, currentNumber = 1;

        while (currentNumber<=n)
        {
            System.out.println(currentNumber);
            currentNumber = prevNumber*2 + 1;
            prevNumber = currentNumber;
        }
    }
}

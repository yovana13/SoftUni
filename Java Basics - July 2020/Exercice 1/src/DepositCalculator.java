import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double depostitSum = Double.parseDouble(scanner.nextLine());
        int timeDeposit = Integer.parseInt(scanner.nextLine());
        double interestPerYear = Double.parseDouble(scanner.nextLine());

        double insertPerMonth = depostitSum * interestPerYear /100 /12;
        double sum = depostitSum + timeDeposit * insertPerMonth;

        System.out.printf("%.2f",sum);
    }
}

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMatric = scanner.nextLine();

        if(inputMetric.equals("mm"))
            number = number / 1000;
        else if(inputMetric.equals("cm"))
            number = number / 100;

        if(outputMatric.equals("mm"))
            number = number * 1000;
        else if(outputMatric.equals("cm"))
            number = number * 100;

        System.out.printf("%.3f",number);
    }
}

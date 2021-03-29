import java.util.Scanner;

public class TradeCommissons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sale = Double.parseDouble(scanner.nextLine());

if(sale<0)
    System.out.println("error");
else {
    switch (city) {
        case "Sofia":
            if (sale >= 0 && sale <= 500)
                sale = sale * 0.05;
            else if (sale > 500 && sale <= 1000)
                sale = sale * 0.07;
            else if (sale > 1000 && sale <= 10000)
                sale = sale * 0.08;
            else if (sale > 10000)
                sale = sale * 0.12;
            System.out.printf("%.2f", sale);
            break;

        case "Varna":
            if (sale >= 0 && sale <= 500)
                sale = sale * 0.045;
            else if (sale > 500 && sale <= 1000)
                sale = sale * 0.075;
            else if (sale > 1000 && sale <= 10000)
                sale = sale * 0.10;
            else if (sale > 10000)
                sale = sale * 0.13;
            System.out.printf("%.2f", sale);
            break;

        case "Plovdiv":
            if (sale >= 0 && sale <= 500)
                sale = sale * 0.055;
            else if (sale > 500 && sale <= 1000)
                sale = sale * 0.08;
            else if (sale > 1000 && sale <= 10000)
                sale = sale * 0.12;
            else if (sale > 10000)
                sale = sale * 0.145;
            System.out.printf("%.2f", sale);
            break;

        default:
            System.out.println("error");
    }
}

    }
}

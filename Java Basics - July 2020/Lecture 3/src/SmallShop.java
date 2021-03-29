import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (product) {
            case "coffee": {
                if (city.equals("Sofia"))
                    System.out.printf("%f", amount * 0.5);
                else if (city.equals("Plovdiv"))
                    System.out.printf("%f", amount * 0.4);
                else if (city.equals("Varna"))
                    System.out.printf("%f", amount * 0.45);
                break;
            }
            case "water": {
                if (city.equals("Sofia"))
                    System.out.printf("%f", amount * 0.8);
                else if (city.equals("Plovdiv"))
                    System.out.printf("%f", amount * 0.7);
                else if (city.equals("Varna"))
                    System.out.printf("%f", amount * 0.7);
                break;
            }

            case "beer": {
                if (city.equals("Sofia"))
                    System.out.printf("%f", amount * 1.20);
                else if (city.equals("Plovdiv"))
                    System.out.printf("%f", amount * 1.15);
                else if (city.equals("Varna"))
                    System.out.printf("%f", amount * 1.10);
                break;
            }

            case "sweets": {
                if (city.equals("Sofia"))
                    System.out.printf("%f", amount * 1.45);
                else if (city.equals("Plovdiv"))
                    System.out.printf("%f", amount * 1.30);
                else if (city.equals("Varna"))
                    System.out.printf("%f", amount * 1.35);
                break;
            }

            case "peanuts": {
                if (city.equals("Sofia"))
                    System.out.printf("%f", amount * 1.60);
                else if (city.equals("Plovdiv"))
                    System.out.printf("%f", amount * 1.50);
                else if (city.equals("Varna"))
                    System.out.printf("%f", amount * 1.55);
                break;
            }
        }
    }
}

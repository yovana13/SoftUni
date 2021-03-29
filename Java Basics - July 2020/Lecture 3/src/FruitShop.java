import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if(product.equals("banana"))
                    System.out.printf("%.2f",quantity*2.50);
                else if(product.equals("apple"))
                    System.out.printf("%.2f", quantity*1.20);
                else if(product.equals("orange"))
                    System.out.printf("%.2f", quantity*0.85);
                else if(product.equals("grapefruit"))
                    System.out.printf("%.2f", quantity*1.45);
                else if(product.equals("kiwi"))
                    System.out.printf("%.2f",quantity*2.70);
                else if (product.equals("pineapple"))
                    System.out.printf("%.2f",quantity*5.50);
                else if(product.equals("grapes"))
                    System.out.printf("%.2f",quantity*3.85);
                else
                    System.out.println("error");
                break;
            case "Saturday":
            case "Sunday":
                if(product.equals("banana"))
                    System.out.printf("%.2f",quantity*2.70);
                else if(product.equals("apple"))
                    System.out.printf("%.2f", quantity*1.25);
                else if(product.equals("orange"))
                    System.out.printf("%.2f", quantity*0.90);
                else if(product.equals("grapefruit"))
                    System.out.printf("%.2f", quantity*1.60);
                else if(product.equals("kiwi"))
                    System.out.printf("%.2f",quantity*3.0);
                else if (product.equals("pineapple"))
                    System.out.printf("%.2f",quantity*5.60);
                else if(product.equals("grapes"))
                    System.out.printf("%.2f",quantity*4.20);
                else
                    System.out.println("error");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}

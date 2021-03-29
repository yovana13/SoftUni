import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if(budget<=100)
        {
            System.out.printf("Somewhere in Bulgaria");
            System.out.println();
            if(season.equals("summer"))
                System.out.printf("Camp - %.2f", budget*0.3);
            else
                System.out.printf("Hotel - %.2f",budget*0.7);
        }
        else if(budget>100 && budget<=1000)
        {
            System.out.printf("Somewhere in Balkans");
            System.out.println();
            if(season.equals("summer"))
                System.out.printf("Camp - %.2f", budget*0.4);
            else
                System.out.printf("Hotel - %.2f",budget*0.8);
        }
        else if(budget>1000)
        {
            System.out.printf("Somewhere in Europe\n" +
                    "Hotel - %.2f",budget*0.9);
        }

    }
}

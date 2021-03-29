import java.util.Scanner;

public class KartCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String circles = scanner.nextLine();
        String fan = scanner.nextLine();
        String type = scanner.nextLine();
        double priceTicket=0;

        if(circles.equals("five"))
        {
            if(type.equals("Child"))
                priceTicket=7;
            else if(type.equals("Junior"))
                priceTicket=9;
            else if(type.equals("Adult"))
                priceTicket=12;
            else if(type.equals("Profi"))
                priceTicket=18;
        }
        else if(circles.equals("ten"))
        {
            if(type.equals("Child"))
                priceTicket=11;
            else if(type.equals("Junior"))
                priceTicket=16;
            else if(type.equals("Adult"))
                priceTicket=21;
            else if(type.equals("Profi"))
                priceTicket=32;
        }

        if(fan.equals("yes"))
            priceTicket= priceTicket - priceTicket*0.2;

        if(budget>=priceTicket)
            System.out.printf("You bought %s ticket for %s laps. Your change is %.2flv.",type,circles,budget-priceTicket);
        else
            System.out.printf("You don't have enough money! You need %.2flv more.",priceTicket-budget);
    }
}

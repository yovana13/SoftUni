import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        int priceTicket = Integer.parseInt(scanner.nextLine());

        int totalPrice =  numberOfTickets*priceTicket;
        if(budget>=totalPrice)
        {
            System.out.printf("You can sell your client %d tickets for the price of %d$!\n",numberOfTickets, totalPrice);
            System.out.printf("Your client should become a change of %d$!",budget-totalPrice);
        }
        else
            System.out.printf("The budget of %d$ is not enough. Your client can't buy %d tickets with this budget!",budget,numberOfTickets);
    }
}

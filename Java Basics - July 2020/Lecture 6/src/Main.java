import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  standard =0, student =0, kid =0;
        int totalTickets = 0;
        double soldTicketsPerMovie=0;
        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")) {

            double freePlaces = Double.parseDouble(scanner.nextLine());
            soldTicketsPerMovie =0;
            for(int i=1; i<=freePlaces;i++) {
                String input = scanner.nextLine();
                while (!input.equals("End")) {
                    if (input.equals("standard"))
                        standard++;
                    else if (input.equals("kid"))
                        kid++;
                    else if (input.equals("student"))
                        student++;
                    soldTicketsPerMovie++;
                    totalTickets++;
                    if(soldTicketsPerMovie>=freePlaces)
                        break;

                    input = scanner.nextLine();
                }

            }

            System.out.printf("%s - %.2f%% full.\n",movieName,soldTicketsPerMovie/freePlaces*100);
            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n",totalTickets);
        System.out.printf("%.2f%% student tickets.\n",student*1.0/totalTickets*100.0);
        System.out.printf("%.2f%% standard tickets.\n",standard*1.0/totalTickets*100.0);
        System.out.printf("%.2f%% kids tickets.\n",kid*1.0/totalTickets*100.0);
    }
}

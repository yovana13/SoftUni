import java.util.Scanner;

public class CinemaTickets{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();

        int studentN = 0;
        int standardN = 0;
        int kidN = 0;

        double totalTickets = 0;
        double buyPlaces = 0;


        while (!movie.equals("Finish")) {
            String places = scan.nextLine();
            int placesNumber = Integer.parseInt(places);

            boolean isFinish = false;
            for (int i = 0;i < placesNumber; i++ ) {
                String type = scan.nextLine();

                switch (type) {
                    case "student":
                        studentN++;
                        break;
                    case "standard":
                        standardN++;
                        break;
                    case "kid":
                        kidN++;
                        break;
                }

                if (type.equals("Finish")){
                    isFinish = true;
                    break;
                }
                if (type.equals("End")) {
                    isFinish = false;
                    break;
                }
                buyPlaces++;
                totalTickets++;
            }
            if (isFinish){
                System.out.printf("%s - %.2f%% full.\n",movie,(totalTickets/placesNumber)*100.00);
                break;
            }
            System.out.printf("%s - %.2f%% full.\n",movie,(buyPlaces/placesNumber)*100.00);
            movie = scan.nextLine();
            buyPlaces = 0;
        }
        System.out.printf("Total tickets: %.0f\n",totalTickets);
        System.out.printf("%.2f%% student tickets.\n",(studentN /totalTickets)*100);
        System.out.printf("%.2f%% standard tickets.\n",(standardN /totalTickets)*100);
        System.out.printf("%.2f%% kids tickets.\n",(kidN /totalTickets)*100);
    }
}
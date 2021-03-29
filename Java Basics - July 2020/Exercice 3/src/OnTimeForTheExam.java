import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int totalMins = 60 * hour + minutes;
        int totalArrivalMins = 60 * arrivalHour + arrivalMin;

        if(totalArrivalMins == totalMins )
            System.out.println("On time");
        else if (totalMins> totalArrivalMins)
        {
            if(totalMins-totalArrivalMins<=30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start",totalMins-totalArrivalMins);
            }
            else {
                System.out.println("Early");
                if(totalMins-totalArrivalMins<60)
                {
                    System.out.printf("%d minutes before the start",totalMins-totalArrivalMins);
                }
                else
                {
                    System.out.printf("%d:%02d hours before the start",(totalMins-totalArrivalMins)/60,(totalMins-totalArrivalMins)%60);
                }

            }
        }else if (totalMins< totalArrivalMins)
        {
            System.out.println("Late");
            if(totalArrivalMins-totalMins<60)
            {
                System.out.printf("%d minutes after the start",totalArrivalMins-totalMins);
            }
            else
            {
                System.out.printf("%d:%02d hours after the start",(totalArrivalMins-totalMins)/60,(totalArrivalMins-totalMins)%60);
            }
        }
    }
}

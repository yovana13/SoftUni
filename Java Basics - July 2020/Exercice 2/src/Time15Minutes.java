import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if(minutes+15<60){
            System.out.printf("%d:%02d",hour,minutes+15);
        }
        else {
            minutes = minutes+15 - 60;
            hour= hour+1;
            if(hour==24)
                hour=0;
            System.out.printf("%d:%02d",hour,minutes);
        }
    }
}

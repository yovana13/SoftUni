import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nights = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        double totalPrice =0;
        nights = nights-1;

        switch (typeRoom)
        {
            case "room for one person":
                totalPrice = 18.00 * nights;
                break;

            case "apartment":
                totalPrice = 25.00 * nights;
                if( nights <10)
                    totalPrice = totalPrice * 0.70;
                else  if(nights>=10 && nights<=15)
                    totalPrice = totalPrice * 0.65;
                else if (nights>15)
                    totalPrice = totalPrice * 0.50;
                break;

            case "president apartment":
                totalPrice = 35.00 * nights;
                if( nights <10)
                    totalPrice = totalPrice *0.90;
                else  if(nights>=10 && nights<=15)
                    totalPrice = totalPrice * 0.85;
                else if (nights>15)
                    totalPrice = totalPrice * 0.80;
                break;
        }

        if(grade.equals("positive"))
            totalPrice = totalPrice + totalPrice*0.25;
        else
            totalPrice = totalPrice * 0.9;

        System.out.printf("%.2f",totalPrice);
    }
}

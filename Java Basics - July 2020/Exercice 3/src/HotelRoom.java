import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0;
        double studioPrice = 0;

        switch (month)
        {
            case "May":
            case "October":
                apartmentPrice = nights * 65;
                studioPrice = nights*50;
                if(nights>7 && nights<=14)
                {
                    studioPrice = studioPrice * 0.95;
                }
                else if (nights>14)
                {
                    apartmentPrice = apartmentPrice*0.9;
                    studioPrice = studioPrice * 0.7;
                }
break;
            case "June":
            case "September":
                apartmentPrice = nights * 68.70;
                studioPrice = nights*75.20;
               if (nights>14)
                {
                    apartmentPrice = apartmentPrice*0.9;
                    studioPrice = studioPrice * 0.8;
                }
                break;
            case "July":
            case "August":
                apartmentPrice = nights * 77;
                studioPrice = nights*76;
                if (nights>14)
                {
                    apartmentPrice = apartmentPrice*0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n" +
                "Studio: %.2f lv.", apartmentPrice, studioPrice);
    }
}

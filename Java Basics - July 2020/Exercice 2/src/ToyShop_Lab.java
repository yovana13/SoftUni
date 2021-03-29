import java.util.Scanner;

public class ToyShop_Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excurcionPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double sumMoney = puzzle * 2.6 + talkingDoll * 3 + teddyBear * 4.1 + minion * 8.2 + truck * 2;
        double sumToys = puzzle + talkingDoll + teddyBear + minion + truck;

        if (sumToys >= 50) {
            sumMoney = sumMoney - sumMoney * 0.25;
        }

        sumMoney = sumMoney - sumMoney * 0.1;
        if (sumMoney >= excurcionPrice) {
            System.out.printf("Yes! %.2f lv left.", sumMoney - excurcionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(sumMoney - excurcionPrice));
        }

    }
}

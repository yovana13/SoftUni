import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String place = scanner.nextLine();
        boolean flag = false;

        while (!place.equals("End")) {
            int neededMoney = Integer.parseInt(scanner.nextLine());
            int sumMoney=0;
            while (neededMoney > sumMoney) {
                String input = scanner.nextLine();
                if(input.equals("End")) {
                    flag = true;
                break;}
                int money = Integer.parseInt(input);
                sumMoney += money;
            }
            if(flag)
                break;
            if(neededMoney<=sumMoney)
            System.out.printf("Going to %s!\n",place);
            place = scanner.nextLine();
        }
    }
}

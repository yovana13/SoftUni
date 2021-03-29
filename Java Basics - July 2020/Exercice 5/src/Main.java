import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter=0, spendingDays=0;

        while (ownedMoney<neededMoney && spendingDays<5)
        {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if(command.equals("save"))
            {
                ownedMoney+=money;
                spendingDays=0;
            }
            else if(command.equals("spend"))
            {
                ownedMoney-=money;
                spendingDays++;
                if(ownedMoney<0)
                    ownedMoney=0;
            }
        }

        if(spendingDays==5)
        {
            System.out.println("You can't save the money.");
            System.out.printf("%d",spendingDays);
        }
        else
            System.out.printf("You saved the money for %d days.",daysCounter);
    }
}

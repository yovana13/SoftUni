import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int days=0, spendDays=0;
        boolean flag = false;

        while (budget<moneyForVacation)
        {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;

            if(action.equals("save"))
            {budget+=money;
            spendDays=0;}
            else if(action.equals("spend"))
            {
                budget=budget-money;
                if(budget<0)
                    budget=0;
                spendDays++;
            }

            if(spendDays==5)
            { flag=true;
                break;}
        }

        if(flag)
            System.out.printf("You can't save the money.\n5");
        else
        System.out.printf("You saved the money for %d days.",days);
    }
}

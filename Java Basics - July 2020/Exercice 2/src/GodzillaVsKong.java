import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceOfCostume = Double.parseDouble(scanner.nextLine());

        double priceForDecor = movieBudget*0.1;
        double sumOfCostume = statists* priceOfCostume;


        if(statists>=150)
            sumOfCostume = sumOfCostume - sumOfCostume*0.1;
        double leftMoney = movieBudget - priceForDecor - sumOfCostume;

        if(leftMoney >=0){
            System.out.printf("Action!");
            System.out.println();
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
        else{
            System.out.printf("Not enough money!");
            System.out.println();
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(leftMoney));
        }
    }
}

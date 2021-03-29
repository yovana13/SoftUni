import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double priceMachine = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());
        int numberOfToys = 0;
        int totalMoney = 0;
        int p=10;

        for(int i=1; i<=years; i++)
        {
            if(i%2==0)
            {
                  totalMoney=totalMoney+p;
                  p=p+10;
                  totalMoney = totalMoney-1;
            }
            else
                numberOfToys++;
        }

        totalMoney = totalMoney + numberOfToys*priceToys;
        if(priceMachine<=totalMoney)
            System.out.printf("Yes! %.2f",totalMoney-priceMachine);
        else
            System.out.printf("No! %.2f",priceMachine-totalMoney);
    }
}


import javax.print.DocFlavor;
import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberOfFlowers =  Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalSum=0;

        switch (flowers)
        {
            case "Roses":
            {  totalSum = numberOfFlowers*5.00;
                if(numberOfFlowers>=80)
                    totalSum = totalSum * 0.9;
                break;}
            case "Dahlias":
            {totalSum = numberOfFlowers*3.80;
                if(numberOfFlowers>=90)
                    totalSum=totalSum*0.85;
                break;}
            case "Tulips":
            { totalSum=numberOfFlowers*2.80;
                if(numberOfFlowers>=80)
                    totalSum=totalSum*0.85;
                break;}
            case "Narcissus":
            { totalSum=numberOfFlowers*3.00;
                if(numberOfFlowers<120)
                    totalSum = totalSum + totalSum*0.15;
                break;}
            case "Gladiolus":
            {totalSum = numberOfFlowers * 2.50;
                if(numberOfFlowers<80)
                    totalSum = totalSum + totalSum*0.20;
                break;}

        }

        if(totalSum<budget)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers, flowers,budget-totalSum);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", totalSum - budget);
    }
}

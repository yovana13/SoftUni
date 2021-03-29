import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double finalSum = 0;

        switch (flower)
        {
            case "Roses":
                finalSum = 5.00 * numberOfFlowers;
                if(numberOfFlowers>80)
                    finalSum = finalSum - finalSum*0.10;
                break;

            case "Dahlias":
                finalSum = 3.80 * numberOfFlowers;
                if(numberOfFlowers>90)
                    finalSum = finalSum - finalSum*0.15;
                break;

            case "Tulips":
                finalSum = 2.80 * numberOfFlowers;
                if(numberOfFlowers>80)
                    finalSum = finalSum - finalSum*0.15;
                break;

            case "Narcissus":
                finalSum = 3.00 * numberOfFlowers;
                if(numberOfFlowers<120)
                    finalSum = finalSum + finalSum*0.15;
                break;

            case "Gladiolus":
                finalSum = 2.50 * numberOfFlowers;
                if(numberOfFlowers<80)
                    finalSum = finalSum + finalSum*0.20;
                break;
        }

        if(budget>finalSum)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flower, budget-finalSum);
        }
        else
        {
            System.out.printf("Not enough money, you need %.2f leva more.", finalSum - budget);
        }
    }
}

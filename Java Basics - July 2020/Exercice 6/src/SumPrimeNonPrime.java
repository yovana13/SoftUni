import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime=0, sumNonPrime=0;

        while (!input.equals("stop"))
        {
            int num = Integer.parseInt(input);
            if(num<0)
                System.out.println("Number is negative.");
            else
            {
                int counter=0;
                for(int i=1;i<=num;i++)
                    if(num%i==0)
                        counter++;
                    if(counter<=2)
                        sumPrime+=num;
                    else
                        sumNonPrime+=num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrime);
    }
}

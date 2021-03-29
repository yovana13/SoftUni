import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for(int j=num1; j<=num2; j++)
        {
            int oddSum=0, evenSum=0, counter=1;
            int i=j;
            while (i>0)
            {
                if(counter%2!=0)
                oddSum+=i%10;
                else
                    evenSum+=i%10;
                i=i/10;
                counter++;
            }
            if(oddSum==evenSum)
                System.out.printf("%d ",j);
        }
    }
}

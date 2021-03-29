import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from = Integer.parseInt(scanner.nextLine());
        int to = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int i=0,n;
        int m=from;
        boolean flag = false;

        for (n=from; n<=to; n++)
        {
            for (m=from; m<=to; m++) {
                i++;
                if (m + n == sum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",i,n,m,sum);
                    flag=true;
                    break;
                }
            }
            if (flag)
                break;
        }

        if(m+n!=sum)
            System.out.printf("%d combinations - neither equals %d",i,sum);
    }
}

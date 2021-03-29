import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum=0;
        int rightSum=0;

        int num = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<num*2; i++)
        {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if(i<num)
                leftSum = leftSum+inputNumber;
            else
                rightSum+=inputNumber;
        }

        if(rightSum==leftSum)
            System.out.printf("Yes, sum = %d",leftSum);
        else
            System.out.printf("No, diff = %d",Math.abs(rightSum - leftSum));
    }
}

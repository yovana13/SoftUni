import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggest= Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            int number= Integer.parseInt(scanner.nextLine());
            if(number>biggest)
                biggest=number;
            sum+=number;
        }

        if(sum-biggest == biggest)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d",biggest);
        }
        else
        {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum-biggest-biggest));
        }
    }
}


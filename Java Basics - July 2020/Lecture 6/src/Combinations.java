import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        int result=0;

        for(int i=0;i<=sum;i++)
        {
            for(int n=0;n<=sum;n++)
            {
                for(int m=0;m<=sum;m++)
                    if(m+n+i==sum)
                        result++;
            }
        }
        System.out.println(result);
    }
}

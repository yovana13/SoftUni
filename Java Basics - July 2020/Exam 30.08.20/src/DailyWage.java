import java.util.Scanner;

public class DailyWage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        double strawberries=0, berrie = 0;
        int p=0;

        for(int i=1; i<=row; i++)
        {
            if(i%2!=0)
                strawberries = strawberries + 3.50*position;
            else
            {
                for(int j=1;j<=position;j++)
                    if(j%3!=0)
                        berrie= berrie +5.00;
            }
        }

        double sum = berrie+ strawberries;
        sum =  sum*0.8;
        System.out.printf("Total: %.2f lv.",sum);
    }
}

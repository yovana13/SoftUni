import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary =Integer.parseInt(scanner.nextLine());
        int salaryReduction=0;

        for(int i =0; i<n; i++)
        {
            String site = scanner.nextLine();
            if(site.equals("Facebook"))
                salaryReduction+=150;
            if(site.equals("Instagram"))
                salaryReduction+=100;
            if(site.equals("Reddit"))
                salaryReduction+=50;
        }
        salary=salary-salaryReduction;

        if(salary>0)
            System.out.println(salary);
        else
            System.out.printf("You have lost your salary.");
    }
}

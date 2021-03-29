import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum=0;
        int i, faildYears=0;

        for( i=1 ; i<=12;i++)
        {
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade<4)
                faildYears++;
            if(faildYears==2)
            {
                System.out.printf("%s has been excluded at %d grade",name,i-1);
                break;
            }
            sum+=grade;
        }
        if(faildYears!=2)
        System.out.printf("%s graduated. Average grade: %.2f",name,sum/12*1.0);
    }
}

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1=0, p2=0, p3=0, p4=0, p5=0;

        for(int i=0;i<n;i++)
        {
            int number = Integer.parseInt(scanner.nextLine());
            if(number<200)
                p1++;
            else if(number>=200 && number<=399)
                p2++;
            else if(number>=400 && number<=599)
                p3++;
            else if (number>=600 && number<=799)
                p4++;
            else if (number>=800)
                p5++;
        }

        System.out.printf("%.2f",p1*1.0/n*100.00);
        System.out.println("%");
        System.out.printf("%.2f",p2*1.0/n*100.00);
        System.out.println("%");
        System.out.printf("%.2f",p3*1.0/n*100.00);
        System.out.println("%");
        System.out.printf("%.2f",p4*1.0/n*100.00);
        System.out.println("%");
        System.out.printf("%.2f",p5*1.0/n*100.00);
        System.out.println("%");
    }
}

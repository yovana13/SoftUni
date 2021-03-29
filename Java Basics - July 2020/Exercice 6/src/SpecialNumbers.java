import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i =1111; i<=9999; i++)
        {
            int j =i, counter=0;
            while (j!=0)
            {
                if(j%10!=0)
                if(n%(j%10)==0)
                    counter++;
                j=j/10;
            }
            if(counter==4)
                System.out.printf("%d ",i);
        }
    }
}

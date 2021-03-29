import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int n=1;n<=10;n++)
        {
            for(int m=1;m<=10;m++)
                System.out.printf("%d * %d = %d\n",n,m,m*n);
        }
    }
}

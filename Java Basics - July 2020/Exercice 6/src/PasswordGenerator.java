import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String alphabet = "abcdefghijklmnopqrstuvxyz";

        for(int i=1; i<n;i++)
        {
            for(int j=1; j<n; j++)
                for(int p=0;p<l;p++)
                    for(int q=0;q<l;q++)
                    {
                        int min;
                        if(i>j)
                            min=i;
                        else
                            min = j;

                        for(int o=min+1;o<=n;o++)
                            System.out.printf("%d%d%s%s%d ",i,j,alphabet.charAt(p),alphabet.charAt(q),o);
                    }
        }
    }
}

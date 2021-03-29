import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for(int n =0; n<rooms;n++)
            if(n==rooms-1)
                System.out.printf("L%d%d",floor,n);
            else
            System.out.printf("L%d%d ",floor,n);
        System.out.println();
        for(int i=floor-1; i>=1; i--)
        {
            for(int j=0; j<rooms; j++)
            {
                if(i%2==0)
                { if(j==rooms-1)
                    System.out.printf("O%d%d",i,j);
                    else
                        System.out.printf("O%d%d ",i,j);}
                else
                {  if(j==rooms-1)
                    System.out.printf("A%d%d",i,j);
                else
                    System.out.printf("A%d%d ",i,j);}
            }
            System.out.println();
        }
    }
}

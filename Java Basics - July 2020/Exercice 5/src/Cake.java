import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int piecesCake = height* width;
        int sumEatenPieces = 0;

        while (sumEatenPieces<piecesCake)
        {
            String input = scanner.nextLine();
            if(input.equals("STOP"))
                break;
            int eaten = Integer.parseInt(input);
            sumEatenPieces+=eaten;
        }

        if(sumEatenPieces<piecesCake)
            System.out.printf("%d pieces are left.",piecesCake-sumEatenPieces);
        else
            System.out.printf("No more cake left! You need %d pieces more.",sumEatenPieces-piecesCake);

    }
}

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int vacationsPerYear = Integer.parseInt(scanner.nextLine());
        int goingHomePerYear = Integer.parseInt(scanner.nextLine());

        double totalGames = 0;
        totalGames = (48-goingHomePerYear)*3.0/4.0 + vacationsPerYear*2.0/3.0 + goingHomePerYear;

        if(typeOfYear.equals("leap"))
            totalGames = totalGames + totalGames*0.15;
        System.out.printf("%.0f",Math.floor(totalGames));

    }
}

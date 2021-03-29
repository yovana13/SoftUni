import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double lenghtInMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double timeForSwimming = lenghtInMeters * secondsPerMeter;
        double addedSeconds = Math.floor(lenghtInMeters / 15 ) * 12.5;
        double totalTime = timeForSwimming + addedSeconds;

        if(totalTime<recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime-recordInSeconds);
        }

    }
}

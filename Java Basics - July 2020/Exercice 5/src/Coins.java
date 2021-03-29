import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rest= Double.parseDouble(scanner.nextLine());
        int counter =0;

        while (rest>=2)
        {
            counter++;
            rest=rest-2.0;

        }
        while (rest>=1)
        {
            counter++;
            rest=rest-1.0;

        }
        while (rest>=0.5)
        {
            counter++;
            rest=rest-0.5;
        }
        while (rest>=0.2)
        {
            counter++;
            rest=rest-0.2;
        }
        while (rest>=0.1)
        {
            counter++;
            rest=rest-0.1;
        }
        while (rest>=0.05)
        {
            counter++;
            rest=rest-0.05;
        }
        while (rest>=0.02)
        {
            counter++;
            rest=rest-0.02;
        }
        while (rest>=0.01)
        {
            counter++;
            rest=rest-0.01;
        }
        System.out.println(counter);
    }
}

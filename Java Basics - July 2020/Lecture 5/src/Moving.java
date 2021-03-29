import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        int space = width*high*depth;
        String input = scanner.nextLine();
        int sumTakenSpace = 0;

        while (!input.equals("Done") )
        {
            int number = Integer.parseInt(input);
            sumTakenSpace+=number;
            if(sumTakenSpace>space)
            {
                System.out.printf("No more free space! You need %d Cubic meters more.",sumTakenSpace-space);
                break;
            }
            input = scanner.nextLine();
        }
        if (sumTakenSpace<=space)
            System.out.printf("%d Cubic meters left.",space-sumTakenSpace);
    }
}

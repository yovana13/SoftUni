import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int steps = Integer.parseInt(input);
        int flag= 0;

        while (steps<10000)
        {
            input = scanner.nextLine();
            if(input.equals("Going home"))
            {
                int num=Integer.parseInt(scanner.nextLine());
                steps+=num;
                if(steps<10000)
                flag =1;
                break;
            }
            int number = Integer.parseInt(input);
            steps+=number;
        }

        if(flag==0)
        {
            System.out.printf("Goal reached! Good job!\n");
            System.out.printf("%d steps over the goal!",Math.abs(10000-steps));
        }
        else if(flag==1)
            System.out.printf("%d more steps to reach goal.",Math.abs(10000-steps));
    }
}

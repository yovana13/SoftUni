import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h=0, min=0;

        while (min<=59 && h<24)
        {
            System.out.printf("%d:%d\n",h,min);
            min++;
            if(min==60)
            {
                min=0;
                h++;
            }
        }
    }
}

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String neededBook = scanner.nextLine();
        int counter =0;
        boolean flag = true;

        String input = scanner.nextLine();
        while (!input.equals("No More Books"))
        {
            if(input.equals(neededBook))
            {
                System.out.printf("You checked %d books and found it.",counter);
                flag = false;
                break;
            }
            counter++;
            input = scanner.nextLine();
        }
        if(flag)
        {
        System.out.printf("The book you search is not here!\n");
        System.out.printf("You checked %d books.",counter);}
    }
}

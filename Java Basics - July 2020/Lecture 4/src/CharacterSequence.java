import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        for(int i=0;i< str.length();i++) // ne smee da e <= tuku samo <
        {
            char letter = str.charAt(i);
            System.out.println(letter);
        }
    }
}

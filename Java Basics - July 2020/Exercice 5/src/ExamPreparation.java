import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades =  Integer.parseInt(scanner.nextLine());
        String nameOfExercise="";
        String input =  scanner.nextLine();
        double sumGrades = 0, counter =0;
        int badGrades = 0;
        boolean flag = true;

        while (!input.equals("Enough"))
        {
            nameOfExercise = new String(input);
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrades+=grade;
            counter++;
            if(grade<=4)
                badGrades++;
            if(badGrades==maxBadGrades)
            {flag=false;
                break;}
            input = scanner.nextLine();
        }

        if(flag)
        {
            System.out.printf("Average score: %.2f\n", sumGrades/counter);
            System.out.printf("Number of problems: %.0f\n",counter);
            System.out.printf("Last problem: %s",nameOfExercise);
        }
        else
            System.out.printf("You need a break, %d poor grades.",maxBadGrades);
    }
}

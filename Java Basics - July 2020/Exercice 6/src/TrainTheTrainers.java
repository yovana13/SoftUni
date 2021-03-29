import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInJury = Integer.parseInt(scanner.nextLine());
        double sumAllGrades=0,numOfAllGrades=0;
        String input = scanner.nextLine();

        while (!input.equals("Finish"))
        {
            double sumGrades=0;
            for(int i=1; i<=peopleInJury;i++)
            {
                double grade= Double.parseDouble(scanner.nextLine());
                numOfAllGrades++;
                sumGrades+=grade;
            }
            sumAllGrades+=sumGrades;
            System.out.printf("%s - %.2f.\n",input, sumGrades/peopleInJury*1.0);
            input=scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",sumAllGrades/numOfAllGrades);
    }
}

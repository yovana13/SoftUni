import java.util.Scanner;

public class KartRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String theBestName = "";
        int bestTime= Integer.MAX_VALUE;
        //int bestMinutes=Integer.MAX_VALUE, bestSeconds=Integer.MAX_VALUE;
        int silver=0, gold=0, bronze=0;

        while (!name.equals("Finish"))
        {
            int minutes = Integer.parseInt(scanner.nextLine());
            int seconds = Integer.parseInt(scanner.nextLine());
            int time=minutes*60 + seconds;

            if(minutes==0 && seconds<55)
                gold++;
            else if(time>=55 && time<=85)
                silver++;
            else if(time>85 && time<120)
                bronze++;

            if(bestTime>time)
            { bestTime=time;
            theBestName=new String(name);}
            name= scanner.nextLine();
        }
        int bestMinutes = bestTime/60;
        int bestSeconds = bestTime - bestMinutes*60;

        System.out.printf("With %d minutes and %d seconds %s is the winner of the day!\n",bestMinutes,bestSeconds,theBestName);
        System.out.printf("Today's prizes are %d Gold %d Silver and %d Bronze cards!",gold,silver,bronze);
    }
}

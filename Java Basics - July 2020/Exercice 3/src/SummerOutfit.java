import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grad = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

      switch (partOfTheDay)
      { case "Morning":
          if(grad>=10 && grad<=18)
              System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.",grad);
          else if(grad>18 && grad<=24)
              System.out.printf("It's %d degrees, get your Shirt and Moccasins.",grad);
          else if(grad>=25)
              System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",grad);
          break;

          case "Afternoon":
              if(grad>=10 && grad<=18)
                  System.out.printf("It's %d degrees, get your Shirt and Moccasins.",grad);
              else if(grad>18 && grad<=24)
                  System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",grad);
              else if(grad>=25)
                  System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",grad);
              break;

          case "Evening":
                  System.out.printf("It's %d degrees, get your Shirt and Moccasins.",grad);
                  break;
      }
    }
}

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double kgBannana = Double.parseDouble(scanner.nextLine());
        double kgOrange = Double.parseDouble(scanner.nextLine());
        double kgRaspberry = Double.parseDouble(scanner.nextLine());
        double kgStrawberry = Double.parseDouble(scanner.nextLine());

        double priceRaspberry = priceStrawberry / 2;
        double priceBannana = priceRaspberry - 0.8 * priceRaspberry;
        double priceOrange = priceRaspberry - 0.4 * priceRaspberry;


        double sumRaspberry = priceRaspberry*kgRaspberry;
        double sumBannana = priceBannana*kgBannana;
        double sumOrange = priceOrange*kgOrange;
        double sumStrawberry = priceStrawberry*kgStrawberry;
        double result = sumBannana + sumOrange + sumRaspberry + sumStrawberry;


        System.out.printf("%.2f",result);
    }
}

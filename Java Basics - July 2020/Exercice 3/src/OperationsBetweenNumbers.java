import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result= 0;

        switch (symbol)
        {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result=1.0*num1/num2;
                if(num2==0)
                    System.out.printf("Cannot divide %d by zero",num1);
                break;
            case "%":
                if(num2==0)
                    System.out.printf("Cannot divide %d by zero",num1);
                else
                    result = num1%num2;
                break;
        }

        if(!symbol.equals("/")&&!symbol.equals("%"))
        {
            System.out.printf("%d %s %d = %.0f - ",num1,symbol,num2,result);
            if(result%2==0)
                System.out.print("even");
            else
                System.out.print("odd");
        }
        else if (symbol.equals("/") && num2!=0)
            System.out.printf("%d %s %d = %.2f",num1,symbol,num2,result);
        else if(symbol.equals("%") && num2!=0)
            System.out.printf("%d %s %d = %.0f",num1,symbol,num2,result);
    }
}

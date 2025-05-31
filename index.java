import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner sb = new Scanner(System.in);

        System.out.print("Enter Your 1st Numbe : ");
        double num1 = sb.nextDouble();

        System.out.print("Choose an Operation (+ , - , * , / , ^ ) : ");
        char Operation = sb.next().charAt(0);


        System.out.print("Enter Your 2nd Number : ");
        double num2 = sb.nextDouble();

        double result;

        switch (Operation) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            case '/':
                if(num2 != 0)
                {
                result = num1 / num2;
                System.out.println(result);
                }
                else
                {
                    System.out.println("Division by 0 is Not Allowed");
                    return;
                }
                break;

            case '^':
                result  = Math.pow(num1, num2);
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }

        sb.close();
        
    }
}
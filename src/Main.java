import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("CALCULATOR");

        //First number
        System.out.println("Enter your first number:");
        num1 = myObj.nextDouble();

        //Second Number
        System.out.println("Enter your second number:");
        num2 = myObj.nextDouble();

        //Operator
        System.out.println("Enter your operator(+,-,*,/):");
        operator = myObj.next().charAt(0);

        //Answer
        double answer = 0.0;

        switch (operator) {
            case '+':
                answer = num1+num2;
                break;
            case '-':
                answer = num1-num2;
                break;
            case '*':
                answer = num1*num2;
                break;
            case '/':
                answer = num1/num2;
                break;
            default:
                System.out.print("You've entered the wrong operator!");
        }

        System.out.print(num1 + " " + operator + " " + num2 + " =" + answer);

    }
}

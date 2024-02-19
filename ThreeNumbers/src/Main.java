import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = firstNumber();
        int b = secondNumber();
        int c = thirdNumber();

        System.out.println("You've entered these numbers: " + a + ", " + b + ", " + c + "." + "\n" + "Among these numbers the largest number is " + comarisionOfNumbers(a, b, c) + ".");
    }

    private static int firstNumber() {

        try{
            System.out.println("Enter a first number!");
            Scanner sc1 = new Scanner(System.in);
            int firstNumber = sc1.nextInt();
            if ((firstNumber > 94) && (firstNumber < 727)) return firstNumber;
            else return firstNumber();
        }catch (Exception e){return firstNumber();}
    }

    private static int secondNumber() {

        try{
            System.out.println("Enter a second number!");
            Scanner sc2 = new Scanner(System.in);
            int secondNumber = sc2.nextInt();
            if ((secondNumber > 94) && (secondNumber < 727)) return secondNumber;
            else return secondNumber();
        }catch (Exception e){return secondNumber();}
    }

    private static int thirdNumber() {

        try{
            System.out.println("Enter a third number!");
            Scanner sc3 = new Scanner(System.in);
            int thirdNumber = sc3.nextInt();
            if ((thirdNumber > 94) && (thirdNumber < 727)) return thirdNumber;
            else return thirdNumber();
        }catch (Exception e){return thirdNumber();}
    }

    private static int comarisionOfNumbers(int a, int b, int c){

        int number1 = 0;
        int number2 = 0;

        if (a > b) {number1 = a;}
        else {number1 = b;}

        if (number1 > c) {number2 = number1;}
        else {number2 = c;}

        return number2;
    }
}

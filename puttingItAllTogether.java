import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        System.out.println("Calculator");
        int number1;
        int number2;
        int option = 0;
        String firstNumber = JOptionPane.showInputDialog("enter the first number");
        number1 = Integer.parseInt(firstNumber);
        String secondNumber = JOptionPane.showInputDialog("enter the second number");
        number2 = Integer.parseInt(secondNumber);

        String menu = JOptionPane.showInputDialog("Select an option: \n"
                + "1.Addition\n"
                + "2.Subtraction\n"
                + "3. Multiplication \n"
                + "4.Division");
        option = Integer.parseInt(menu);
        int answer;
        switch (option) {
            case 1:
                System.out.println("you selected addition");
                answer = addition(number1, number2);
                System.out.println(answer);
                break;

            case 2:
                System.out.println("you selected subtraction");
                answer = subtraction(number1, number2);
                System.out.println(answer);
                break;

            case 3:
                System.out.println("you selected multiplication");
                answer = multiplication(number1, number2);
                System.out.println(answer);
                break;

            case 4:
                System.out.println("you selected division");
                answer = number1 - number2;
                System.out.println(answer);
        }

    }

    // adding method
    final static int addition(int number1, int number2) {

        int answer = number1 + number2;
        return answer;
    }

    // subtracting method
    final static int subtraction(int number1, int number2) {

        int answer = number1 - number2;
        return answer;
    }

    // multiplying method
    final static int multiplication(int number1, int number2) {

        int answer = number1 * number2;
        return answer;
    }

    // dividing method
    final static int division(int number1, int number2) {

        int answer = number1 / number2;
        return answer;
    }

    // Unit testing
    @Test
    public void tests() {
        int number1 = 15;
        int number2 = 20;
        int answerAdd = addition(number1, number2);
        int answerSubtrct = subtraction(number1, number2);
        int answerMultiply = multiplication(number1, number2);
        int answerDivide = division(number1, number2);

        // expected results
        int expectedAddingResult = 35;
        int expectedSubtractingResult = -5;
        int expectedMultiplicationResult = 300;
        int expectedDivideResult = (int) 0.75;

        // Assertions
        Assert.assertEquals(expectedAddingResult, answerAdd);
        Assert.assertEquals(expectedSubtractingResult, answerSubtrct);
        Assert.assertEquals(expectedMultiplicationResult, answerMultiply);
        Assert.assertEquals(expectedDivideResult, answerDivide);
    }
}

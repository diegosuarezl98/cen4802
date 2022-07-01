/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.alltogether;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Suarez
 */
public class AllTogether {
/*The main method contains the entirety of the code. No other methods are used
    It contains variables for two numbers and the logic to determine the answer
    to four types of operations. */
    public static void main(String[] args) {
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
                answer = number1 + number2;
                System.out.println(answer);
                break;

            case 2:
                System.out.println("you selected subtraction");
                answer = number1 - number2;
                System.out.println(answer);
                break;

            case 3:
                System.out.println("you selected multiplication");
                answer = number1 * number2;
                System.out.println(answer);
                break;

            case 4:
                System.out.println("you selected division");
                answer = number1 - number2;
                System.out.println(answer);
                break;

        }
    }
}

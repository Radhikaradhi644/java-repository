package javapractice;

import java.util.Scanner;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        double a = sc.nextInt();
        System.out.println("enter b number");
        double b = sc.nextInt();
        System.out.println("enter a key word");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("a+b =" + (a + b));
                break;
            case '-':
                System.out.println("a-b =" + (a - b));
                break;
            case '*':
                System.out.println("a*b=" + (a * b));
                break;
            case '/':
                System.out.println("a/b=" + (a / b));
                break;
            case's':
                System.out.println("sine value of a is:" +Math.sin(a));
                break;
            case'c':
                System.out.println("cosine value of a is:" +Math.cos(a));
                break;
            case't':
                System.out.println("Tan value of a is:" +Math.tan(a));
                break;
            case'C':
                System.out.println("Cot value of a is:" +(Math.sin(a)/Math.cos(a)));
                break;
        }
    }
}

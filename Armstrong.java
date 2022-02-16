package Main;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, temp, res=0, rem;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        num = scan.nextInt();

        temp = num;
        while(temp!=0)
        {
            rem = temp%10;
            res = res + (rem*rem*rem);
            temp = temp/10;
        }

        if(num==res)
            System.out.println("\nArmstrong Number.");
        else
            System.out.println("\nNot an Armstrong Number.");
    }

}

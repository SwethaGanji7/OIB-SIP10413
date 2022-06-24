import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class AtmInterface {

    public static void main(String args[]) {

        int Balance = 500000, Withdraw, Deposit, Amount;

        Scanner sc = new Scanner(System.in);

        int atmnumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("   Welcome  ");
        System.out.print("Enter Atm Number : ");
        int atmNumber = in.nextInt();
        System.out.print("Enter Pin: ");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {

            while (true) {
                System.out.println("Automated Teller Machine");
                System.out.println("Press 1 to Check Balance");
                System.out.println("Press 2 to Withdraw");
                System.out.println("Press 3 to Deposite");
                System.out.println("Press 4 to Transfer");
                System.out.println("Press 5 to EXIT");
                System.out.print("Choose the operation you want to perform:");

                int Press = sc.nextInt();

                if (Press == 1) {
                    System.out.println("Your Balance is: " + Balance);
                } else if (Press == 2) {
                    System.out.print("Enter the Amount to be withdrawn:");

                    Withdraw = sc.nextInt();

                    if (Balance >= Withdraw) {
                        Balance = Balance - Withdraw;
                        System.out.println("Please Collect Your Amount");
                    } else {
                        System.out.println("Your Balance is Insufficient");
                    }
                } else if (Press == 3) {
                    System.out.print("Enter the Amount to be deposited:");

                    Deposit = sc.nextInt();

                    Balance = Balance + Deposit;
                    System.out.println("Your Aomunt has been successfully deposited");
                } else if (Press == 4) {
                    System.out.println("Enter the Account Number: ");
                    System.out.println("Enter the Amount: ");
                    Amount = sc.nextInt();
                    System.out.println("Your Amount has been successfully Transmitted");
                }

                else {
                    System.out.println("* * * * *THANK YOU* * * * *");
                    System.out.println("* * * * *VISIT AGAIN* * * * *");
                }
            }
        } else {
            System.out.println("Incorrect Atmnumber or pin");
        }
    }
}
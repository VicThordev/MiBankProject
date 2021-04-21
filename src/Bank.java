import java.util.Scanner;

public class Bank {
    int balance=0;
    int amountSaved;
    int amountWithdrawn;
    String check="Invalid input, please check again";
    String proceedCheck="Would you like to 1.proceed or 2.End transaction";
    int acctNo;
    int pinNo=2041;
    Scanner sca=new Scanner(System.in);
    public void openingCourse() {
        System.out.println("Welcome to Folahan's Bank: ");
        System.out.println("Please select your action:");
        System.out.println("1.enquiry 2.Withdrawal 3.Deposit 4.End");
        int checkingAcct=sca.nextInt();
        if (checkingAcct==1) {
            enquiry();
        } else if (checkingAcct==2) {
            withdrawal();
        }
        else if (checkingAcct==3) {
            deposit();
        }
        else if (checkingAcct==4) {
            System.out.println("Thank you for banking with us. See you next time");
        }
        else {
            System.out.println("Sorry, that's an invalid input.");
            openingCourse();
        }
    }
    public void checkingAcct() {

    }
    public void withdrawal() {
        System.out.println("Welcome customer, your account balance is $"+balance);
        System.out.println("Please enter your pinNo");
        System.out.println("How much would you like to withdraw? ");
        amountWithdrawn= sca.nextInt();
        if (amountWithdrawn>balance){
            System.out.println("Sorry, Dear Customer Insufficient funds.");
        } else {
            balance-=amountWithdrawn;
            System.out.println("Your new balance is $"+balance);
        }
        System.out.println(proceedCheck);
        int proceed= sca.nextInt();
        /*switch (proceed) {
            case 1: openingCourse();
            case 2:
                System.out.println("Thank you for banking with us.See you next time.");
                break;
            default:
                System.out.println("Invalid input, please check again");
                openingCourse();
                break;
        }*/
        if (proceed==1) {
            openingCourse();
        }
         if (proceed==2) {
            System.out.println("Thank you for banking with us. See you next time");
        }
        else {
            System.out.println(check);
            openingCourse();
        }
    }
    public void deposit() {
        System.out.println("Dear customer, Your account balance is $"+balance);
        System.out.println("How much would you like to deposit?");
        amountSaved = sca.nextInt();
        balance+=amountSaved;
        System.out.println("Dear customer, Your new account balance is $"+balance);
        System.out.println(proceedCheck);
        int proceed=sca.nextInt();
        if (proceed==1){
            openingCourse();
        }
        if (proceed==2) {
            System.out.println("Thank you for banking with us. See you next time");
        }
        else {
            System.out.println(check);
            openingCourse();
        }
    }
    public void enquiry() {
        System.out.println("Dear customer, your account balance is $"+balance);
        System.out.println("You withdrew $"+amountWithdrawn);
        System.out.println("You deposited $"+amountSaved);
        System.out.println(proceedCheck);
        int proceed=sca.nextInt();
        if (proceed==1) {
            openingCourse();
        }
        if (proceed==2) {
            System.out.println("Thank you for banking with us. See you next time.");
        } else {
            System.out.println(check);
            openingCourse();
        }
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.openingCourse();
    }

 }

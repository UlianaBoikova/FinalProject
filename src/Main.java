import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taxRate;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your weekly income: ");
        int income = in.nextInt();
        if (income < 500) {
            taxRate = 10;
        }
        else if (income < 1500) {
            taxRate = 15;
        }
        else if (income < 2500) {
            taxRate = 20;
        }
        else {
            taxRate = 30;
        }
        int averageTaxWithholding = income * taxRate / 100;
        System.out.println("Your average tax withholding: " + averageTaxWithholding);
    }
}
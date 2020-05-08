package P1NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double input =scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest = money * (interestRate/100)/12 * 3;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}

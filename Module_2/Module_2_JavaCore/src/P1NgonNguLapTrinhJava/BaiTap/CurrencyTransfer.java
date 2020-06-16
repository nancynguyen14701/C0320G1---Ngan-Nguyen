package P1NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class CurrencyTransfer {
    public static void main(String[] args) {
        double interestRate = 23000;
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap USD muon quy doi:");
        double usd= input.nextDouble();
        double result=usd*interestRate;
        System.out.printf("Quy ra VND: %.2f " ,result);
    }
}

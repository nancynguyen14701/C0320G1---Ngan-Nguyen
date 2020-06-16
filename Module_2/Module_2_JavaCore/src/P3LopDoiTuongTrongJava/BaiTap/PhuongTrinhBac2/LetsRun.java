package P3LopDoiTuongTrongJava.BaiTap.PhuongTrinhBac2;

import java.util.Scanner;

public class LetsRun {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập hệ số 1: ");
        double input1= scanner.nextDouble();
        System.out.println("Nhập hệ số 2: ");
        double input2= scanner.nextDouble();
        System.out.println("Nhập hệ số 3: ");
        double input3= scanner.nextDouble();
        QuadraticEquation test= new QuadraticEquation(input1,input2,input3);
        double delta= test.getDiscriminant();
        System.out.println("Delta của phương trình là: "+test.getDiscriminant());
        if(delta>0){
            System.out.print("Phương trình có 2 nghiệm: ");
            System.out.printf("%-10.5f%-10.5f",test.getRoot1(),test.getRoot2());
        }
        else if (delta == 0.0) {
            double r1 = -input1 / (2.0 * input2);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}

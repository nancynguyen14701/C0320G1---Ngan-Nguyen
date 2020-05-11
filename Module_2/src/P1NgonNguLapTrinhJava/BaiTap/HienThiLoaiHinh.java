package P1NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class HienThiLoaiHinh {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int choose=input.nextInt();
        switch(choose){
            case 1: {
                System.out.println("Drawing rectangle");
                for(int j=0;j<3;j++){
                    for (int i=0;i<7;i++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 2: {
                System.out.println("Drawing square triangle");
                for(int i=1; i<=5; i++){
                    for(int j=1; j<i; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 3: {
                System.out.println("Drawing  isosceles triangle");
                for (int i=1;i<6;i++){
                    for(int j=5;j>i;j--){
                        System.out.print(" ");
                    }
                    for(int f=0;f<2*i-1;f++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }


}

package P2MangPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TongCacSoDuongCheo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Khởi tạo ma trận");
        System.out.println("Số cột bạn muốn tạo: ");
        int cols= scanner.nextInt();
        System.out.println("Số hàng bạn muốn tạo: ");
        int rows= scanner.nextInt();
        int[][] matran= new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element "+ i+"-"+j+":");
                matran[i][j]= scanner.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j==i){
                    sum+= matran[i][j];
                }
            }
        }
        System.out.println("Tổng các số thuộc đường chéo chính là: "+ sum);
    }
}

package P2MangPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimPhanTuMaxMang2Chieu {
    public static int findMax(int arr[][]){
        int max= arr[0][0];
        int hang=0;
        int cot=0;
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                    hang=i;
                    cot=j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng hai chiều là: "+ max+" nằm ở tọa độ " + hang + "-"+ cot);
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bắt đầu khởi tạo mảng 2 chiều");
        System.out.println("Nhập số cột bạn muốn tạo: ");
        int cols= scanner.nextInt();
        System.out.println("Nhập số hàng bạn muốn tạo: ");
        int rows= scanner.nextInt();
        int[][] matran= new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element "+ i+"-"+j+":");
                matran[i][j]= scanner.nextInt();
            }
        }
        findMax(matran);
    }
}

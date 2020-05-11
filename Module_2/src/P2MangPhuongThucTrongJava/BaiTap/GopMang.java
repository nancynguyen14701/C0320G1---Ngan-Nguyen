package P2MangPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1= new int[4];
        int[] arr2= new int[5];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập giá trị mảng 1");
        for(int i=0;i<arr1.length;i++){
            System.out.println("Nhập phần tử thứ "+ (i+1)+" :" );
            arr1[i]= scanner.nextInt();
        }
        System.out.println("Nhập giá trị mảng 2");
        for(int i=0;i<arr2.length;i++){
            System.out.println("Nhập phần tử thứ "+ (i+1)+" :" );
            arr2[i]= scanner.nextInt();
        }
        System.out.println("Tiến hành gộp mảng, chờ 1 tí");
        int[] arr3= new int[9];
        for(int i=0;i<arr1.length;i++){
            arr3[i]= arr1[i];
        }
        for (int i= arr1.length,j=0;j<arr2.length;i++,j++){
            arr3[i]= arr2[j];
        }
        System.out.println("New array: ");
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+"\t");
        }
    }
}

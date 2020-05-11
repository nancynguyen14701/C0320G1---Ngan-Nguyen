package P2MangPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class FindMinInAnArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size= scanner.nextInt();
        int[] array= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element "+ (i+1)+" :");
            array[i]= scanner.nextInt();
        }
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("The smallest element is: "+ min);
    }
}

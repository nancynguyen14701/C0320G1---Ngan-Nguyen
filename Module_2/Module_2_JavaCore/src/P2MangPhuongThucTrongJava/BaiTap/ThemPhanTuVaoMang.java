package P2MangPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
public static int[] insertElement(int newValue,int index,int arr[]){
    int newArr[]= new int[arr.length+1];
    for(int i=0;i<index;i++){
        newArr[i]=arr[i];
    }
    for (int i=arr.length;i>index;i--){
        newArr[i]=arr[i-1];
    }
    newArr[index]= newValue;
    for (int i=0;i<newArr.length;i++){
        System.out.print(newArr[i]+"\t");
    }
    return newArr;
}
public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int array[]={3,5,7,9};
        System.out.println("Enter the number you want to insert: ");
        int input = scanner.nextInt();
        System.out.println("Enter the position you want to insert the number: ");
        int pos= scanner.nextInt();
    insertElement(input,pos,array);
    }
}

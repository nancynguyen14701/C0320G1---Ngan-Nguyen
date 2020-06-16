package P2MangPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class DemLanXuatHienCuaKyTu {

    public static void main(String[] args) {

        String a= "abc12c3";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any character: ");
        String input= scanner.nextLine();

        int count=0;

        for(int i=0;i<a.length();i++){
            if(Character.toString(a.charAt(i)).equals(input)){
                count++;
            }
        }
        System.out.println(input +" xuất hiện "+ count +" lần");

    }
}
